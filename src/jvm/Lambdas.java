package jvm;

import java.util.Optional;

public class Lambdas {
    public static void main(String[] args) {
        Optional.ofNullable(100).orElse(getDefault());
    }

    private static Integer getDefault() {
        System.out.println(1000);
        return 10000;
    }
}
