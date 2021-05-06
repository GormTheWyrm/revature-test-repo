package usingThreadClass;
public class Demo {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread());
        Thread t = Thread.currentThread();
        t.setName("gorms thread");
        t.setPriority(6);
    MyThread m1 = new MyThread();
         m1.setName("my-1");
        MyThread m2 = new MyThread();
        m2.setName("my-2");
        MyThread m3 = new MyThread();
        m3.setName("my-3");
        m1.start();
        m2.start();
        m3.start();

    }
}
