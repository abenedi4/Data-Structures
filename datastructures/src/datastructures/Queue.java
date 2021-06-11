package datastructures;

public class Queue {
	int front, rear, size;
	int capacity;
	int array[];
	
	public Queue(int capacity) {
		//Set capacity of queue
		this.capacity = capacity;
		//Front = 0 = first element
		//Size = 0 when initializing new queue
		front = this.size = 0;
		//Rear = the last item in queue
		rear = capacity -1;
		//Create new array with set capacity size
		array = new int[this.capacity];
	}
	
	/*
	 * Queue is full when size becomes
	 * equal to the capacity.
	 * Size is number of elements currently in queue
	 * Capacity is max possible elements to store
	 */
	boolean isFull(Queue queue) {
		return (queue.size == queue.capacity);
	}
	
	//Queue is empty when size is 0
	boolean isEmpty(Queue queue) {
		return (queue.size ==0);
	}
	
	/* 
	 * Method to add an item to the queue
	 * It changes rear and size
	 */
	void enqueue(int item) {
		if (isFull(this)) return;
		
		this.rear = (this.rear + 1) % this.capacity;
		this.array[this.rear] = item;
		this.size = this.size + 1;
		System.out.println(item + "enqueued to queue");
		
	}
	
	// Method to remove an item from queue.
    // It changes front and size
    int dequeue()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
 
        int item = this.array[this.front];
        this.front = (this.front + 1)
                     % this.capacity;
        this.size = this.size - 1;
        return item;
    }
 
    // Method to get front of queue
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
 
        return this.array[this.front];
    }
 
    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
 
        return this.array[this.rear];
    }

 
    public static void main(String[] args)
    {
        Queue queue = new Queue(1000);
 
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
 
        System.out.println(queue.dequeue()
                           + " dequeued from queue\n");
 
        System.out.println("Front item is "
                           + queue.front());
 
        System.out.println("Rear item is "
                           + queue.rear());
    }

}
