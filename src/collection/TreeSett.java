package collection;
import java.util.Arrays;
import java.util.TreeSet;

public class TreeSett 
{
	public static void main(String[] args) {
		TreeSet<String> hs= new TreeSet<String>();
		hs.add("kolkata");
		hs.add("bengal");
		hs.add("delhi");
		hs.add("pune");
		hs.add("pune");
		
		System.out.println(hs);
		
		String[] s= {"abc","def","bbb","ccc"};
		TreeSet<String> hs1= new TreeSet<String>(Arrays.asList(s));
		System.out.println(hs1);
		
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(15);
		ts.add(25);
		ts.add(5);
		System.out.println(ts);

}
}
