package Collections;

public class MaxHeap <T extends Comparable<T>>{
	//Constant
		public final static int DEFAULT_CAPACITY = 100;
	
	//Attributes
		private T[] heap;
		private int size;
	
	//Methods
		
		//Builder
			@SuppressWarnings("unchecked")
			public MaxHeap() {
				heap = (T[]) new Object[DEFAULT_CAPACITY]; 
			}
			
			@SuppressWarnings("unchecked")
			public MaxHeap(int capacity) {
				heap = (T[]) new Object[capacity];
			}
			
			public MaxHeap(T[] array) {
				heap = array;
				size = array.length;
			}
		
		//Getters
			public int getSize() {
				return size;
			}
		
		//Operational
			public int heapLenght() {
				return heap.length;
			}
			
			public int left(int i) {	
				return 2*i;
			}
			
			public int right(int i) {
				return 2*i + 1;
			}
			
			public int parent(int i) {
				return i/2;
			}

			public void heapify(int root) {
				int l = left(root);
				int r = right(root);
				if(l < heapLenght() && heap[l].compareTo(heap[root]) > 0) {
					
				}
			}
	
	
	
	
}
