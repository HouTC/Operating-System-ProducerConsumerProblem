/**
 * @Student ID: 17956190
 * @author Jing Zhang
 * @Student ID: 17967739
 * @author Tiancheng Hou
 * Buffer.java
 */
package task2;
import java.util.concurrent.Semaphore;

public class Buffer {
    //Create a circular queue to contain the numbers
    Queue queue;
    //Create three Semaphore to control the thread
    Semaphore full;
    Semaphore empty;
    Semaphore mutex;
    //removed item
    Object removed;
    //count the items
    static int current_size;
    
    public Buffer(){
        full=new Semaphore(0);
        //the empty size should be defined in Constant class
        empty=new Semaphore(Constants.BUFFER_SIZE);
        mutex=new Semaphore(1);
        this.queue=new Queue(Constants.BUFFER_SIZE);
        current_size=0;
    }
    
    //implementation of Circular Queue using Generics
    public class Queue {
        int front, rear;
        Object [] Q;
        int maxSize;
        
        /*
        * Queue constructor that passes the buffer size
        */
        public Queue(int size) {
          this.maxSize=size;
          Q=new Object[this.maxSize];
          front = -1;
          rear = -1;
        }
        
        /*
        * Function that inserts the object into the end of the queue
        */
        public void enqueue(Object val) {
            rear = (rear + 1) % Q.length;
            Q[rear] = val;
            current_size++;
            if (front == -1) {
                front = rear;
            }
        }
        
        /*
        * Function that removes the first object of the queue
        */
        public Object dequeue() {
            Object tmp = null;
                tmp = Q[front];
                Q[front] = null;
                current_size--;
                front = (front + 1) % Q.length;
            return tmp;
        }
    }
    
    /*
    * This function is going to insert the item into the buffer
    */
    public int insert_item(int item){
        
        try {
            empty.acquire();
            mutex.acquire();  
        } catch (InterruptedException ex) {
            return -1;
        }
        
        //Count how many items in the queue
        int count=0;
        for(int i=0;i<Constants.BUFFER_SIZE;i++){
            if(queue.Q[i]!=null){
                ++count;
                break;
            }
        }

        queue.enqueue(item);       
        

        mutex.release();
        full.release();
        
        //Full return -1
        if(count==5){
            return -1;
        }
        else{
            return 0; 
        }           
    }
    
    /*
    * This function is going to remove the item out of the buffer
    */
    public int remove_item(){
        try {
            //Get permits to remove item
            full.acquire();
            mutex.acquire();
        } catch (InterruptedException ex) {
            return -1;
        }
        
        //Count how many items are null
        int count=0;
        for(int i=0;i<Constants.BUFFER_SIZE;i++){
            if(queue.Q[i]==null){
                ++count;
                break;
            }
        }
        
        removed=queue.dequeue();

        //Release the permits
        mutex.release();
        empty.release();
        
        //Empty return -1
        if(count==5){
            return -1;
        }else{
            return 0;
        }              
    }    
}

