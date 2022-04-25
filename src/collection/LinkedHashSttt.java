package collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSttt {
	public static void main(String[] args) {
		LinkedHashSet<String> hs= new LinkedHashSet<String>();
		hs.add("kolkata");
		hs.add("bengal");
		hs.add("delhi");
		hs.add("pune");
		hs.add("pune");
		
		System.out.println(hs);
		
		String[] s= {"abc","def","bbb","ccc"};
		LinkedHashSet<String> hs1= new LinkedHashSet<String>(Arrays.asList(s));
		System.out.println(hs1);

}
}
