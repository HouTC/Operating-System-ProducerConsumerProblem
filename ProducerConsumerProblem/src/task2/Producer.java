/**
 * @Student ID: 17956190
 * @author Jing Zhang
 * @Student ID: 17967739
 * @author Tiancheng Hou
 * Producer.java
 */
package task2;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Producer implements Runnable{
    
    private Buffer my_buffer;
    private int data;
    
    public Producer(Buffer my_buffer){
        this.my_buffer=my_buffer;
    }
    
    @Override
    public void run() {
        producer();
    }  
    
    public void producer(){
        while(true){
            //Generate a random number to be inserted into queue
            
            data=(int)(Math.random() *100);
            
            try {
                //Producer sleeps for a random time
                Thread.sleep((int) (Math.random() *1000));
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }    
            //Get and print the current thread ID
            long threadId=Thread.currentThread().getId();
            if(my_buffer.insert_item(data)==-1){
                System.out.println("report error condition");
            }
            else{
                //Print out the current status of the buffer
                System.out.println("Producer "+threadId+" produced "+data+", the buffer now contains "+my_buffer.current_size);
            }
        }
    }
}
