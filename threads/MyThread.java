/*
 Файл: MyThread.java
 Пакет: threads
 MyThread наследуется от Thread
 Учебная задача
 */
package threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author vvm
 */
public class MyThread extends Thread {

    static Lock lock = new ReentrantLock();
    private String strVoice;

    private void setVoice(String str) {
        this.strVoice = str;
    }

    MyThread(String str) {
        this.setVoice(str);
    }

    @Override
    public void run() {
        for (;;) { // бесконечные цикл
            lock.lock();
            lock.unlock();
            try {
                MyThread.sleep(1000);// чтобы спорили медленнее
            } catch (InterruptedException ex) {

            }
            System.out.println(this.strVoice);

        }
    }
}
