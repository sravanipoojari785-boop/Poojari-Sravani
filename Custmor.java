class Restaurant {

    boolean foodPrepared = false;

    synchronized void placeOrder() {
        System.out.println("Customer: Order placed.");
        try {
            wait();   
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Customer: Food received and eating.");
    }
    synchronized void prepareFood() {
        System.out.println("Cook: Preparing food...");
        foodPrepared = true;
        notifyAll();  
    }
    synchronized void serveFood() {
        try {
            while (!foodPrepared) {
                wait();  
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Waiter: Serving food to customer.");
    }
}

class Customer extends Thread {
    Restaurant r;

    Customer(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.placeOrder();
    }
}
class Cook extends Thread {
    Restaurant r;

    Cook(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.prepareFood();
    }
}

class Waiter extends Thread {
    Restaurant r;

    Waiter(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.serveFood();
    }
}

public class Custmor {
    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Customer customer = new Customer(restaurant);
        Cook cook = new Cook(restaurant);
        Waiter waiter = new Waiter(restaurant);

        customer.start();
        waiter.start();
        cook.start();
    }
}
