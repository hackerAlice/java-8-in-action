package whoami1023.chapter1;

/**
 * 使用局部内部类来实现
 */
public class TestLambda1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, World!");
            }
        });
        thread.start();
    }
}
