// REWRITTEN _data

import java.util.ArrayList ;

public class ArrayPriorityQueue<Ticket> implements PriorityQueue<Ticket> {
	
	private ArrayList<Ticket> _data ;
	
	public ArrayPriorityQueue() {
		_data = new ArrayList<Ticket>() ;
	}
	
	// adds an item to this priority queue
	public void add( Ticket x ) {
		int size = _data.size() ;
		// starts from left
		for( int i = 0 ; i < size ; i ++ ) { 
			Ticket stuff = _data.get( i ) ;
			// if current element is more than x
			if( x.compareTo( stuff ) > 0 ) {
				_data.add( i , x ) ;
				return ;
			}
		}
		// if x belongs at the very end
		_data.add( x ) ;
	}
	
	// returns true if this stack is empty, otherwise return false
	public boolean isEmpty() {
		return( _data.size() == 0 ) ;
	}
	
	// returns the smallest item stored in this priority queue without removing item
	public Ticket peekMin() {
		return( _data.get( 0 ) ) ;
	}
	
	// removes and returns the smallest item stored in this priority queue
	public Ticket removeMin() {
		return( _data.remove( 0 ) ) ;
	}
	
	public static void main( String[] args ) {
		ArrayPriorityQueue<Integer> test = new ArrayPriorityQueue() ;
		test.add( 2 ) ;
		test.add( 0 ) ;
		test.add( 1 ) ;
		test.add( 3 ) ;
		
		System.out.println( test.peekMin() ) ;
		System.out.println( test.removeMin()) ;
		
		System.out.println( test.removeMin()) ;
		
		System.out.println( test.removeMin()) ;
		
		System.out.println( test.removeMin()) ;
		System.out.println( test.isEmpty() ) ; // true 
	}
}