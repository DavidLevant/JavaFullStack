public class Queue<V> {

    /**
    * Constructor to initialize the queue with a maximum capacity of maxSize.
    */
    @SuppressWarnings("unchecked")
    public Queue(int maxSize) {
        queue.size(maxSize);
    }

    /**
        Returns the maximum size this queue can support.
    */
    public int getMaxSize() {
        queue.getMaxSize();
        return getMaxSize();

    }

     /**
        Returns the current number of items enqueued.
    */
    public int getCurrentSize() {
        queue.getCurrentSize();
        return getCurrentSize();
    }

    /**
        Returns true if there are no elements in the queue.
    */
    public boolean isEmpty() {
        if (queue.isEmpty() == true){
            return true;
        }
    }

    /**
        Returns true if the queue is size is at max size.
    */
    public boolean isFull() {
        if (queue.size() == queue.getMaxSize()){
            return true;
        }
    }

    /**
        Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
    */
    public V peek() {
        queue.peek();

        if (queue.size()== 0){
            return null;
        }
    }
    
   /**
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions, returning true upon success and throwing an IllegalStateException if no space is currently available.
    */
    public void add(V value) {
        queue.add();

    }

    /**
        Retrieves and removes the head of this queue, or returns null if this queue is empty.
    */
    public V poll() {
    queue.remove();
        if (queue.size()== 0){
            return null;
        }
    }
    
    /**
        Retrieves and removes the head of this queue.
    */
     public V remove() {
         queue.remove();
    }
    
}