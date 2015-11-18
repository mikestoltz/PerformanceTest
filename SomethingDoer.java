import java.util.*;
import java.io.*;

public class SomethingDoer {

  FileName _fileName;

  public SomethingDoer(FileName f) {
		_fileName = f;
  }
  
  private ArrayList<String> getNewArrayList() {
		ArrayList<String> toReturn = new ArrayList<String>();
		return toReturn;
  }

	private ArrayList<String> clearOutArrayList(ArrayList<String> arr) {
		ArrayList<String> toReturn = new ArrayList<String>();
		return toReturn;
	}

  public String[] convertToStringArray(Object[] objs) {
		String[] toReturn = new String[objs.length];

		int count = 0;
		for (Object obj : objs) {
		    toReturn[count++] = (String) obj;
		}
		
		return toReturn;
  }
    
  public void doIt(FileName f) {
		_fileName = f;
		
		ArrayList<String> strings = getNewArrayList();

		FileAccess fa = new FileAccess();
		strings = fa.readFile(f.name);

		DataCalculator dc = new DataCalculator();

		Object[] strings2 = strings.toArray();

		String[] strings3 = convertToStringArray(strings2);
		
		int[] calculated = dc.calculate((new StrategyOne()), strings3);

		int total = 0;
		for (int line : calculated) {
		    total += line;
		}

		OutputControl oc = new OutputControl(System.out);
		oc.print("" + (total % 100));

  }
    
}
