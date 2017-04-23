import cs1.Keyboard ;

public class HelpDesk {
	
	private ArrayPriorityQueue<Ticket> tickets ;
	// customer #
	private int probNum ;
	
	public HelpDesk() {
		tickets = new ArrayPriorityQueue<Ticket>() ;
		probNum = 0 ;
	}
	
	// ask Qs and add new ticket onto queue. Importance randomized (?)
	public void addTicket() {
		
		System.out.println( "Hello, what is your name?" ) ;
		String name = Keyboard.readString() ; // possibility of there being a space? IDK
		
		System.out.println( "Ah, thank you. And what is your problem?" ) ;
		// life, money, school, people, health, tech, relationship
		String problem = Keyboard.readWord() ;
		
		
		int level = ( int )( Math.random() * 50 ) ;
		probNum ++ ;
		Ticket jimbob = new Ticket( probNum, level, problem, name ) ;
		tickets.add( jimbob ) ;
		
		System.out.println( "Thanks! I'll get back to you as soon as possible." ) ;
	}
	
	public void findSoln( Ticket x ) {
		String prob = x.getProb() ;
		
		if( prob.equals( "life" ) || prob.equals( "Life" )) {
			x.setSoln( "Call 1-800-273-8255 immediately." ) ;
		}
		else if( prob.equals( "money" ) || prob.equals( "Money" )) {
			x.setSoln( "Reach out to family. Start saving. Get a job or negotiate for higher salary." ) ;
		}
		else if( prob.equals( "relationship" ) || prob.equals( "Relationship" )) {
			x.setSoln( "Hit the lawyer, delete the gym, Facebook up." ) ;
		}
		else {
			x.setSoln( "Sorry, can't help you :(" ) ;
		}
	}
	
	// solve and dequeue ticket. Prints soln
	public void probDone() {
		findSoln( tickets.peekMin()) ;
	}
	
	public static void main( String[] args ) {
		
		HelpDesk hihello = new HelpDesk() ;
		
		// enqueue n dequeue n enqueue n dequeue... 5 times?
		for( int n = 0 ; n < 5 ; n ++ ) {
			hihello.addTicket() ;
			
		} 
	}
	
}