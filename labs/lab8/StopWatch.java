import java.util.*;

public class StopWatch {

    private long startTime = 0;
    private long stopTime = 0;
    private boolean running = false;

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.stopTime = System.currentTimeMillis();
        this.running = false;
    }

    //elaspsed time in milliseconds
    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = (System.currentTimeMillis() - startTime);
        }
        else {
            elapsed = (stopTime - startTime);
        }
    return elapsed;
    }

 

    //elaspsed time in seconds
    public long getElapsedTimeSecs() {
        long elapsed;
        if (running) {
            elapsed = ((System.currentTimeMillis() - startTime) / 1000);
        }
        else {
            elapsed = ((stopTime - startTime) / 1000);
        }
    return elapsed;
    }

    public String toString() {
        String str = new String();
        str += this.getElapsedTime();

        return str;
    }

    //sample usage
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StopWatch s = new StopWatch();
        s.start();
        double z =0.0;
        //use scanner to get an string from keyboard
        scan.nextLine();

        s.stop();
        System.out.println("elapsed time in milliseconds:" + s);
    }
}