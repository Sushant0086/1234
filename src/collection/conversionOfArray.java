package collection;
import java.util.ArrayList;
import java.util.Arrays;
public class conversionOfArray 

{
	
public static void main(String[] args)
{
ArrayList <String> al = new ArrayList <String>();	

al.add("abc");
al.add("cde");
System.out.println(al);

al.remove(0);
System.out.println(al);

al.add(0, "abc");
System.out.println(al);




ArrayList <String> al2 = new ArrayList <String>();	

al2.add("mumbai");
al2.add("delihi");al2.addAll(al);
System.out.println(al2);

boolean ispresent = al2.contains("abc");
System.out.println(ispresent);


//conversion of array to arraylist

String a[]= {"abc","def","gef"};
ArrayList<String> al3 = new ArrayList<String>(Arrays.asList(a));
System.out.println(al3);





//conversion from araraylist to array
int length = al3.size();
String[]ss=new String[length];
al3.toArray(ss);

for(String sss:ss)
{
System.out.println(sss);	
}
}

}

