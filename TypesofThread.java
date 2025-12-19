class Daemon1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("user Thread is executing");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.err.println("some problem occured");
            }
        }
    }
}

class Daemon2 extends Thread {
    public void run() {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Demon thread is executing");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Some problem occured");
            }
        }
    }
}

public class TypesofThread {
    public static void main(String[] args) {
        System.out.println("Main()started executing");
        Daemon1 d1 = new Daemon1();
        Daemon2 d2 = new Daemon2();
        d2.setDaemon(true);
        d1.start();
        d2.start();
        System.out.println("Main() stopped working");
    }
}
