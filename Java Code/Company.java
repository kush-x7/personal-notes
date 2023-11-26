public class Company {
    int n;
    boolean f = false;

    // f =false:chance:producer
    // f =false:chance:consumer
    synchronized public void produce_item(int n) throws Exception {
        if (f) {
            wait();
        }
        this.n = n;
        System.out.println("Producer: " + this.n);
        f = true;
        notify();
    }

    synchronized public int consume_item() throws Exception {
        if (f) {
            wait();
        }

        System.out.println("Consumed: " + this.n);
        f = false;
        notify();
        return this.n;
    }

}

class Producer extends Thread {
    Company c;

    Producer(Company c) {
        this.c = c;

    }

    public void run() {
        try {
            int i = 1;
            while (true) {
                this.c.produce_item(i);
                Thread.sleep(1000);
                i++;
            }

        } catch (Exception e) {
        }
    }
}

class Consumer extends Thread {
    Company c;

    Consumer(Company c) {
        this.c = c;

    }

    public void run() {
        try {

            while (true) {
                this.c.consume_item();
                Thread.sleep(2000);

            }

        } catch (Exception e) {
        }
    }
}

class ProducerConsumer {
    public static void main(String[] args) {
        Company comp = new Company();
        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);
        p.start();
        c.start();
    }
}