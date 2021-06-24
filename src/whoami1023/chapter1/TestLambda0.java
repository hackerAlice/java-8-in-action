package whoami1023.chapter1;

/**
 * 实现Runnable接头的类MyRunnable
 */
public class TestLambda0 {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World!");
    }
}

