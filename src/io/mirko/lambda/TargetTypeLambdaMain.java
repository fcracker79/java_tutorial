package io.mirko.lambda;

import java.util.concurrent.Callable;

public class TargetTypeLambdaMain {
    @FunctionalInterface
    private interface Dino {
        int faiCose();
    }

    private static void dino(Runnable r) {
        System.out.println("dino(Runnable)");
    }
    // private static void dino(Callable<Integer> c) {
    //     System.out.println("dino(Callable)");
    // }
    private static void dino(Dino d) {
        System.out.println("dino(Dino)");
    }
    public static void main(String ... args) throws Exception {
        dino(() -> 0);
    }
}
