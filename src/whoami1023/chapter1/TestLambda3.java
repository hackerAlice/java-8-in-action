package whoami1023.chapter1;

import java.util.ArrayList;

/**
 * Lambda 表达式
 * 2. 有参无返回值
 */
public class TestLambda3 {
    public static void main(String[] args) {
        ArrayList<String> lists = new ArrayList<>();
        lists.add("AAAA");
        lists.add("BBBB");
        lists.add("CCCC");
        lists.add("CCCC");
        lists.forEach(t -> System.out.print(t + "\t"));
        System.out.println();
        lists.forEach(System.out::println);
    }
}
