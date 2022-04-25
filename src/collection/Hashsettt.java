package collection;

import java.util.Arrays;
import java.util.HashSet;

public class Hashsettt
{
public static void main(String[] args) {
	HashSet<String> hs= new HashSet<String>();
	hs.add("kolkata");
	hs.add("bengal");
	hs.add("delhi");
	hs.add("pune");
	hs.add("pune");
	
	System.out.println(hs);
	
	String[] s= {"abc","def","bbb","ccc"};
	HashSet<String> hs1= new HashSet<String>(Arrays.asList(s));
	System.out.println(hs1);
	
	
	
	
	
	
}
}
