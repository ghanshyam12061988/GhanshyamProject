import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.Map;

class SortByValue implements Comparator<Map.Entry<Character, Integer>> {

	@Override
	public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
		return o1.getValue().compareTo(o2.getValue());
	}

}

public class MyArrayList {

	public static void main(String... s1) throws FileNotFoundException {
		Hashtable h=new Hashtable<>();
		;
		
	}

}
