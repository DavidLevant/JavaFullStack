package homeWork3;

import java.util.Scanner;

public class ArrayList<T> implements List<T> {
	
	private T[] data;
	private int size;
	
	data = (T[]) new Object[length];

	private static final int DEFAULT_INITIAL_CAPACITY = 11;
	
	
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    Int initialCapacity = scan.nextLine();
    

	/**
	 * Constructs an ArrayList using the default capacity
	 */
	public ArrayList() {
		data = (T[]) new Object [DEFAULT_INITIAL_CAPACITY];
			}

	/**
	 * Constructs an ArrayList with an 'initialCapacity'
	 * 
	 * If 'initalCapacity' is non-positive use the default capacity
	 * 
	 * @param initialCapacity
	 */
	public ArrayList(int initialCapacity) {
		if(initialCapacity < 0) {
			this.data = (T[]) new Object [DEFAULT_INITIAL_CAPACITY];
		} else {
			this.data = (T[]) new Object [initialCapacity];
		}
		

	}

	@Override
	public void add(T item, int index) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}