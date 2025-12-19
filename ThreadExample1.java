
class Restaurant {

    private String orderName;
    private boolean orderTaken = false;
    private boolean orderCooked = false;
    synchronized void foodOrder(String orderName) {
        this.orderName = orderName;
        orderTaken = true;
        System.out.println("Waiter: Order taken -> " + orderName);
        notifyAll();
    }
    synchronized void cookedOrder() {
        try {
            while (!orderTaken) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        orderCooked = true;
        System.out.println("Cook: Order cooked -> " + orderName);
        notifyAll();
    }
 synchronized void receiveOrder(String customerName) {
        try {
            while (!orderCooked) {
                wait();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(customerName + " received the order -> " + orderName);
    }
}
class Customer extends Thread {
    Restaurant r;

    Customer(Restaurant r, String name) {
        super(name);
        this.r = r;
    }

    public void run() {
        r.receiveOrder(getName());
    }
}
class Waiter extends Thread {
    Restaurant r;

    Waiter(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.foodOrder("Veg Biryani");
    }
}
class Cook extends Thread {
    Restaurant r;

    Cook(Restaurant r) {
        this.r = r;
    }

    public void run() {
        r.cookedOrder();
    }
}

public class ThreadExample1{

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();

        Customer c1 = new Customer(restaurant, "Customer-1");
        Customer c2 = new Customer(restaurant, "Customer-2");
        Customer c3 = new Customer(restaurant, "Customer-3");

        Waiter waiter = new Waiter(restaurant);
        Cook cook = new Cook(restaurant);

        // Start all threads
        c1.start();
        c2.start();
        c3.start();
        waiter.start();
        cook.start();
    }
}