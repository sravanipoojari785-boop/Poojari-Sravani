class square{
    public void run(){

    }
}
class AverageThread extends Thread {

    public void run() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double average = sum / 10.0;
        System.out.println("Average of first 10 numbers: " + average);
    }
}

// Thread to print square of array elements
class SquareThread extends Thread {

    int[] arr = {1, 20, 50, 15, 30};

    public void run() {
        System.out.println("Squares of array elements:");
        for (int num : arr) {
            System.out.println(num + "² = " + (num * num));
        }
    }
}

public class ThreadExample {

    public static void main(String[] args) {

        AverageThread t1 = new AverageThread();
        SquareThread t2 = new SquareThread();

        try {
            t1.start();     
            t1.join();     

            t2.start();     
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Both threads executed successfully.");
    }
}