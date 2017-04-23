public class Ticket implements Comparable {
	private int ID ;
	private int VIPLevel ;
	private String problem ;
	private boolean solved ;
	private String name ;
	private String solution ;

	// constructor
	public Ticket( int id, int level, String prob, String cust ) {
		ID = id ;
		VIPLevel = level ;
		problem = prob ;
		solved = false ;
		name = cust ;
		solution = "" ;
	}
	
	public int compareTo( Ticket o ) {
		if( o.getLevel() > this.getLevel() ) {
			return -1 ;
		}
		else if( o.getLevel() == this.getLevel() ) {
			return 0 ;
		}
		else { // o > this
			return 1 ;
		}
	}
	
	// =================== ACCESSORS =====================
	
	public int getID() {
		return ID ;
	}
	
	public int getLevel() {
		return VIPLevel ;
	}
	
	public String getProb() {
		return problem ;
	}
	
	public boolean isSolved() {
		return solved ;
	}
	
	public String getName() {
		return name ;
	}
	
	public String getSoln() {
		return solution ;
	}
	
	// ================== MUTATORS ======================
	
	public void setSoln( String soln ) {
		solution = soln ;
	}
	
	public void setSolved( boolean x ) { // x should be true
		solved = x ;
	}
	
}