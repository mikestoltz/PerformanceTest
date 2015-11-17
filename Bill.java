public class Bill {

    public static int coogie() {
	int bird = 0;
	for (int l=0; l <100000; l++) {
	    
	    for (int m = 0; m < 10000; m++) {
		bird += (l + m + 2);
	    }

	}
	return bird;
    }

    
    public static int noogie() {
	int bird = 0;
	for (int l=0; l <100000; l++) {
	    for (int m = 0; m < 10000; m++) {
		bird += (l + m);
	    }
	}
	return bird;
    }

    
    public static void main(String[] args) {

	if (args.length < 1) {
	    System.out.println("Pass in filename as argument");
	    System.exit(1);
	}
	
	int bird = 0;
	for (int j = 0; j < 100000; j++) {
	    bird += j + coogie() + noogie();
	}

	System.out.println("Start: " + bird);

	
	// FileName fn = new FileName(args[0]);

	// SomethingDoer sd = new SomethingDoer(fn);

	// sd.doIt(fn);

	
    }
    
}
