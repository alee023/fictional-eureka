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
		
		probNum ++ ;
		System.out.println( "NUMBER " + probNum + "!\nHello, what is your name?" ) ;
		String name = Keyboard.readString() ;
		
		System.out.println( "Ah, thank you. And what is your problem?" ) ;
		// life, money, school, people, health, relationship
		String problem = Keyboard.readString() ;
		
		
		int level = ( int )( Math.random() * 50 ) ;
		Ticket jimbob = new Ticket( probNum, level, problem, name ) ;
		tickets.add( jimbob ) ;
		
		System.out.println( "Thanks! I'll get back to you as soon as possible.\n\n" ) ;
	}
	
	// matches solution to problem
	public void findSoln( Ticket x ) {
		// every problem in the conditional statement stuff below should be solved EXCEPT for the one in the else
		x.setSolved( true ) ; 
		String prob = x.getProb() ;
		
		if( prob.toLowerCase().indexOf( "life" ) >= 0 ) {
			x.setSoln( "Call 1-800-273-8255 immediately." ) ;
			// x.setLvl( 0 ) ; // would be nice :( 
		}
		else if( prob.toLowerCase().indexOf( "money" ) >= 0 ) {
			x.setSoln( "Reach out to family. Start saving. Get a job or negotiate for higher salary." ) ;
		}
		else if( prob.toLowerCase().indexOf( "relationship" ) >= 0 ) {
			x.setSoln( "Hit the lawyer, delete the gym, Facebook up." ) ; // /r/relationships
		}
		else if( prob.toLowerCase().indexOf( "people" ) >= 0 ) {
			x.setSoln( "To to them about your problems." ) ;
		}
		else if( prob.toLowerCase().indexOf( "health" ) >= 0 ) {
			x.setSoln( "Seek a medical professional. Eat healthy, exercise, and sleep well." ) ;
		}
		else {
			x.setSoln( "Sorry, we cannot help you :(" ) ;
			x.setSolved( false ) ;
		}
	}
	
	// solves problem, prints soln, and dequeues ticket
	public void probDone() {
		
		Ticket curr = tickets.peekMin() ;
		findSoln( curr ) ; // soln var filled
		
		System.out.println(( curr.getName()) + "? Person " + ( curr.getID()) + "?" ) ;
		if( curr.isSolved()) {
			System.out.print( "Your problem has been solved.\nWe suggest that you... " ) ;
		}
		System.out.println( curr.getSoln() + "\nWe hope to see you again :).\n" ) ;
		
		tickets.removeMin() ;
	}
	
	public static void main( String[] args ) {
		
		HelpDesk hihello = new HelpDesk() ;
		
		// ( enqueue 5X, dequeue 5X ) X 5 or until Ctrl-C 
		// basically, take 5 requests, then solve them. take another 5 reqs and solve and again and again
		for( int i = 0 ; i < 5 ; i ++ ) {
			
			for( int n = 0 ; n < 5 ; n ++ ) {
				hihello.addTicket() ;
			}
			
			System.out.println( "\n\n" ) ;
			
			for( int n = 0 ; n < 5 ; n ++ ) {
				hihello.probDone() ;
			}
		}
	}
	
}