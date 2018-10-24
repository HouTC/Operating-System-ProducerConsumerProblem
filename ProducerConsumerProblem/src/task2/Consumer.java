/**
 * @Student ID: 17956190
 * @author Jing Zhang
 * @Student ID: 17967739
 * @author Tiancheng Hou
 * Consumer.java
 */
package task2;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Consumer implements Runnable{
    private Buffer my_buffer;
    public Consumer(Buffer my_buffer){
        this.my_buffer=my_buffer;
    }

    @Override
    public void run() {
        consumer();                    
    }   
    
    public void consumer(){
        while(true){
            try{
                Thread.sleep((int) (Math.random() *1000)); //sleep for a random period
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Get and print the current thread ID
            long threadId=Thread.currentThread().getId();
            if(my_buffer.remove_item()==-1){
                System.out.println("report error condition");
            }
            else{
                System.out.println("Consumer "+threadId+" consumed "+my_buffer.removed+", the buffer now contains "+my_buffer.current_size);
            }
        }
    }
}
