import java.util.*;

public class List4{
	public static void main(String args[]){
		IntegerList<Object> l=new IntegerList<>();

		try{
		   l.add(10);
		   l.add(1.11F);
		   l.add(2.3332D);
		   l.add("Musu");
		}
		catch(Exception e){
		   e.printStackTrace();
		}
		System.out.println(l);
}}


class IntegerList<e> extends ArrayList<e>{
	public boolean add(e E){
	if(E instanceof Integer || E instanceof Float|| E instanceof Double){
		super.add(E);
		return true;
	}	
	else{
	     throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
}
