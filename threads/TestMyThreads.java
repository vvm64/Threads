/*
 Файл: TestMyThreads.java
 Пакет: threads
 тестируем MyThread.java
 */
package threads;

/**
 *
 * @author vvm
 */
public class TestMyThreads {

    public static void main(String[] args) {
        MyThread th0 = new MyThread("поток 0");
        MyThread th1 = new MyThread("поток 1");
        MyThread th2 = new MyThread("поток 2");
        MyThread th3 = new MyThread("поток 3");
        th0.setPriority(4);
        th1.setPriority(3);
        th2.setPriority(2);
        th3.setPriority(1);
        th0.start();
        th1.start();
        th2.start();
        th3.start();
    }
}
