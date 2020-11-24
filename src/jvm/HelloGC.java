package jvm;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class HelloGC {

    private List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 1000; i < 10000000; i++) {
            HelloGC helloGC = new HelloGC();
            IntStream.rangeClosed(0, i).forEach(num -> helloGC.list.add(num));
            try {
                TimeUnit.MILLISECONDS.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
