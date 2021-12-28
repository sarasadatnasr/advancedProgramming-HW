package sbu.cs.multithread.semaphor;
import java.util.concurrent.*;
public class SourceController {

    public static void main(String[] args) {
        Semaphore sem = new Semaphore(5);
        Chef chef1 = new Chef(sem,"chef1");
        Chef chef2 = new Chef(sem,"chef2");
        Chef chef3 = new Chef(sem,"chef3");
        Chef chef4 = new Chef(sem,"chef4");
        Chef chef5 = new Chef(sem,"chef5");
        chef1.setPriority(1);
        chef2.setPriority(1);
        chef3.setPriority(1);
        chef4.setPriority(1);
        chef5.setPriority(1);
        chef1.start();
        chef2.start();
        chef3.start();
        chef4.start();
        chef5.start();
    }
}
