package sbu.cs.multithread.semaphor;
import java.util.concurrent.*;
public class Chef extends Thread {
    Semaphore sem;
    String name;
    public Chef(Semaphore sem,String name) {
        super(name);
        this.sem = sem;
        this.name = name;
    }

    @Override
    public void run() {
        // run by thread A
        if(this.getName().equals("chef1"))
        {
            System.out.println("Starting " + name);
            try
            {
                // First, get a permit.
                System.out.println(name + " is waiting for a permit.");

                // acquiring the lock
                sem.acquire();

                System.out.println(name + " gets a permit.");

                // Now, accessing the shared resource.
                // other waiting threads will wait, until this
                // thread release the lock
                for(int i=0; i < 5; i++)
                {
                    Shared.count++;
                    System.out.println(name + ": " + Shared.count);

                    // Now, allowing a context switch -- if possible.
                    // for thread B to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }

            // Release the permit.
            System.out.println(name + " releases the permit.");
            sem.release();
        }

        // run by thread B
        else
        {
            System.out.println("Starting " + name);
            try
            {
                // First, get a permit.
                System.out.println(name + " is waiting for a permit.");

                // acquiring the lock
                sem.acquire();

                System.out.println(name + " gets a permit.");

                // Now, accessing the shared resource.
                // other waiting threads will wait, until this
                // thread release the lock
                for(int i=0; i < 5; i++)
                {
                    Shared.count--;
                    System.out.println(name + ": " + Shared.count);

                    // Now, allowing a context switch -- if possible.
                    // for thread A to execute
                    Thread.sleep(10);
                }
            } catch (InterruptedException exc) {
                System.out.println(exc);
            }
            // Release the permit.
            System.out.println(name + " releases the permit.");
            sem.release();
        }

        for (int i = 0; i < 10; i++) {
            Source.getSource();
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
