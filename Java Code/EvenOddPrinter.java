package Java

Code;

public class NumberPrinter {
    private int number = 1;
    private final Object lock = new Object();

    public void printEven() {
        synchronized (lock) {
            while (number <= 10) {
                if (number % 2 == 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    lock.notify(); // Notify the waiting thread (if any)
                } else {
                    try {
                        lock.wait(); // Release the lock and wait for notification
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                sleep();
            }
        }
    }

    public void printOdd() {
        synchronized (lock) {
            while (number <= 10) {
                if (number % 2 != 0) {
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    lock.notify(); // Notify the waiting thread (if any)
                } else {
                    try {
                        lock.wait(); // Release the lock and wait for notification
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                sleep();
            }
        }
    }

    private void sleep() {
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class EvenOddPrinter {
    public static void main(String[] args) {
        NumberPrinter numberPrinter = new NumberPrinter();

        Thread evenThread = new Thread(() -> numberPrinter.printEven(), "EvenThread");
        Thread oddThread = new Thread(() -> numberPrinter.printOdd(), "OddThread");

        evenThread.start();
        oddThread.start();
    }
}EvenOddPrinter{

}
