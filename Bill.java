public class Bill {

  public static int coogie() {
		return -2001173632;
  }

  
  public static int noogie() {
		return 54900000;
  }

    
  public static void main(String[] args) {

		if (args.length < 1) {
	    System.out.println("Pass in filename as argument");
	    System.exit(1);
		}
	
		int bird = 0;
		for (int j = 0; j < 10000; j++) {
	    bird += j + coogie() + noogie();
	    if (j % 10 == 0) {
				System.out.print(".");
	    }
		}
		
		System.out.println("\nStart: " + bird);

		FileName fn = new FileName(args[0]);

		SomethingDoer sd = new SomethingDoer(fn);

		sd.doIt(fn);
  }   
}
