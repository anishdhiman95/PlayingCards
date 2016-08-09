import java.util.HashMap;

public class Suite {

	private String suite;
	private final int SPADE = 1;
	private final int DIAMOND = 3;
	private final int CLUB = 4;
	
	private static HashMap<String, Integer> suiteList = new HashMap<String, Integer>(){{
		put("S", 1);
		put("C", 4);
		put("D", 3);
		put("H", 2);
	}};
	public Suite(){
		this.suite=null;
	}
	
	public Suite(String suite){
		this.suite = suite.toUpperCase();	
		
	}

	public String getSuite() {
		return suite;
	}

	public void setSuite(String suite) {
		this.suite = suite.toUpperCase();
	}
	
	public String toString(){
		return "Suite: " + this.getSuite();
	}
	
	public boolean isEqual(Suite suite2) {
		if(this.getSuite().equals(suite2.getSuite()))
			return true;
		else
			return false;
	}
	
	public boolean isGreater(Suite suite2) {
		if(suiteList.get(this.getSuite()) > suiteList.get(suite2.getSuite()))
			return true;
		else
			return false;
	}
	
}
