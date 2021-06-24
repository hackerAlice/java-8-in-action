package whoami1023.chapter1;

/**
 * https://zhuanlan.zhihu.com/p/365505945 介绍比较详细
 */
public class TestIMyInterface {
    public static void main(String[] args) {
        IMyInterface myInterface = () -> System.out.println("I am Studying");
        myInterface.study();
    }
}
