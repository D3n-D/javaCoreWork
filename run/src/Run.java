
public class Run {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		MyRunner r = new MyRunner();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		
		

	}
	
	

}
