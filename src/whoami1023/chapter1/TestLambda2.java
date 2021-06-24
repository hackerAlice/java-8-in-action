package whoami1023.chapter1;

/**
 * 使用Lambda表达式
 * 1. 无参无返回值类型
 */
public class TestLambda2 {
    public static void main(String[] args) {
        new Thread(() -> System.out.println("Hello, World!")).start();
    }
}
