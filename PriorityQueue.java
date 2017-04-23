public interface PriorityQueue<Ticket> {
	
	// adds an item to this priority queue
	public void add( Ticket x ) ;
	// returns true if this stack is empty, otherwise return false
	public boolean isEmpty() ;
	// returns the smallest item stored in this priority queue without removing item
	public Ticket peekMin() ;
	// removes and returns the smallest item stored in this priority queue
	public Ticket removeMin() ;
	
}