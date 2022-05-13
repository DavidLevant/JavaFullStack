import java.util.Scanner;

public class ArrayList<T> implements List<T> {

	private static final int DEFAULT_INITIAL_CAPACITY = 11;
	private T[] data;
	private int size;
	/**
	 * Constructs an ArrayList using the default capacity
	 */
	
		public ArrayList() {
			this.size = 0;
			this.data = (T[])new Object[DEFAULT_INITIAL_CAPACITY];
			
		}

	/**
	 * Constructs an ArrayList with an 'initialCapacity'
	 * 
	 * If 'initalCapacity' is non-positive use the default capacity
	 * 
	 * @param initialCapacity
	 */
	public ArrayList(int initialCapacity) {
		
	  if (initialCapacity < 0) {
		  this.size = 0;
			this.data = (T[])new Object[DEFAULT_INITIAL_CAPACITY];
		} else {
			this.size =0;
			this.data = (T[]) new Object [initialCapacity];
		}

	}
	
	

	@Override
	public void add(T item, int index) {
		if (index < 0 || index > size) {
			
		}else {
			regrow();
			for (int i = (data.length - 1); i >= 0; i--) {                
			    data[i] = data[i-1];
			    
			}
			      data[index] = item;
			      size++;
		}  
	}
	
	public void regrow() {
		
		T[] newArr = (T[]) new Object [this.data.length * 2];
        for (int i =0; i< this.data.length; i ++) {
        	newArr[i]= this.data[i];
           }
        this.data  = newArr;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean contains(Object item) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {
		
		return data[index];
	}

	@Override
	public int indexOf(Object item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		if (size ==0) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return this.size;
	}
	
	
}
