package io.mirko.lambda;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by mypc on 26/03/17.
 */
public class AggregateMain {
    static double averageQuadratic(Collection<Integer> values) {
        final int[] result = values.stream().collect(
                () -> new int[2],
                (d, i) -> {
                    d[0]++;
                    d[1] += i * i;
                },
                (d1, d2) -> {
                    d1[0] += d2[0];
                    d1[1] += d2[1];
                });
        return (result[1] + 0.0) / result[0];
    }
    public static void main(String ... args) throws Exception {
        final List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final double result = averageQuadratic(data);
        double handmade = 0.0;
        for (int i : data) {
            handmade += i * i;
        }
        handmade /= data.size();
        System.out.format("Result: %s\nHand made: %s\n", result, handmade);
    }
}
