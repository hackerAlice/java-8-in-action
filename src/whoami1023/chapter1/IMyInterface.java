package whoami1023.chapter1;

/**
 * 什么事函数式接口？
 * SAM（Single Abstract Method ）接口，有且只有一个抽象方法的接口
 * （可以有默认方法或者是静态方法和从Object继承来的方法，但是抽象方法有且只能有一个）。
 * JDK1.8之后，添加@FunctionalInterface表示这个接口是是一个函数式接口，因为有了@functionalInterface标记，
 * 也称这样的接口为Mark（标记）类型的接口。
 *
 * 只有函数式接口的变量或者是函数式接口，才能够赋值为Lambda表达式。
 * 这个接口中，可以有默认方法，或者是静态方法。函数式接口中还可以有Object中覆盖的方法，也就是equals方法，hashCode方法。
 */
@FunctionalInterface
public interface IMyInterface {
    void study();
}
