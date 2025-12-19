class printer implements Runnable {
    public void run(){
        Thread.currentThread().getName();
        System.out.println( "printing started");
        for(int i=1;i<=5;i++)
        {
            System.out.println(" is printing");
            try{
                Thread.sleep(2000);
            }
            catch(Exception e)
            {
                System.out.println("some problem occured");
            }
        }
        System.out.println( "completed the printing");
    }
    }
    public class DisadvantageOfMultithreading{
        public static void main(String[] args) {
            printer p = new printer();
            Thread t1 = new Thread(p);
            Thread t2 = new Thread(p);
            Thread t3 = new Thread(p);
            t1.setName("chinnu");
            t2.setName("Lucky");
            t3.setName("Anu");
            t1.start();
            t2.start();
            t3.start();
        }
    }

