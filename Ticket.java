public class Ticket implements Comparable {
	private int ID ;
	private int VIPLevel ;
	private String problem ;
	private boolean solved ;
	private String user ;
	private String solution ;

	// constructor
	public Ticket( int id, int leve, String prob, String username ) {
		ID = id ;
		VIPLevel = leve ;
		problem = prob ;
		solved = false ;
		user = username ;
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
		return user ;
	}
	
	public String getSoln() {
		return solution ;
	}
	
}