/**
 * @Student ID: 17956190
 * @author Jing Zhang
 * @Student ID: 17967739
 * @author Tiancheng Hou
 * Main.java
 */
package task2;
import static java.lang.System.exit;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        //Get command linke arguements
        Scanner scan=new Scanner(System.in);
        System.out.println("Sleep time (second): ");
        int sleep_time=scan.nextInt();
        System.out.println("The number of producer threads: ");
        int producer_num=scan.nextInt();
        System.out.println("The number of consumer threads: ");
        int consumer_num=scan.nextInt();
        
        //Initialize buffer
        Buffer my_buffer=new Buffer();

        //Create producer threads
        for(int i=0;i<producer_num;i++){
            Producer producer=new Producer(my_buffer);
            Thread producerThread=new Thread(producer);
            producerThread.start();
        }
        //Create consumer threads 
        for(int j=0;j<consumer_num;j++){
            Consumer consumer=new Consumer(my_buffer);
            Thread consumerThread=new Thread(consumer);
            consumerThread.start();
        }
        
        //main method sleep a few seconds to wait for producers and consumers
        try {
            Thread.sleep(sleep_time*1000);
            //once main method awakes, then termintate the application
            exit(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }     
    }   
}
