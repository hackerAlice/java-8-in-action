package whoami1023.chapter1;

import java.util.Random;
import java.util.stream.Stream;

public class TestLambda4 {
    public static void main(String[] args) {
        Random random = new Random();
        Stream<Integer> stream = Stream.generate(() -> random.nextInt(100));
        stream.forEach(t -> System.out.println(t));
    }
}
