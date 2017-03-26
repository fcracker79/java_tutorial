package io.mirko.lambda;

/**
 * Created by mypc on 26/03/17.
 */
public class OtherLambdaMain {
    private static interface Operator<R> {
        R operate(int t1, int t2);
    }

    private static <R> R operate(int f, int s, Operator<R> operator) {
        return operator.operate(f, s);
    }

    public static void main(String ... args) throws Exception {
        operate(10, 20, (a, b) -> String.format("a: %s, b: %s", a, b));
    }
}
