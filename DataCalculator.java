import java.util.*;

public class DataCalculator {
  public DataCalculator() {
  }
  
  private int getSize(String[] arr) {
  	return arr.length;
  }
  
  public int[] calculate(StrategyInterface strategy, String[] strings) {
  	int size = getSize(strings);
  	int[] toReturn = new int[size];
  	for (int j = 0; j < strings.length; j++) {
	    int calced = strategy.calculate(strings[j]);
	    toReturn[j] = calced;
  	}

    return toReturn;
  }
    
}
