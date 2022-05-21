public class Stack<V>
{

    /**
        Constructor to initialize the stack with a maximum capacity of maxSize.
    */
    @SuppressWarnings("unchecked")
    public Stack(int maxSize)
    { stack.setSize(maxSize);
    }
 
    /**
         Pushes an item onto the top of this stack.
    */
    public void push(V element){
    stack.push(V element);
    }
 
    /**
        Removes the object at the top of this stack and returns that object as the value of this function.
    */
    public V pop()
    { stack.pop();
    }
 
    /**
        Looks at the object at the top of this stack without removing it from the stack.
    */
    public V peek()
    {
        stack.peek();
    }
 
    /**
        Returns the number of items currently in the stack
    */
    public int currentSize() {

        stack.size();
    }
 
    /**
        Tests if this stack is empty.
    */
    public boolean isEmpty() {
        stack.empty();

    }
 
    /**
        Tests if this stack is full
    */
    public boolean isFull() {
        if (stack.size(maxSize) == stack.size()){
            System.out.println("Stack is full");
        } else {
            System.out.println("Stack is not full");
        }
    }
    
}