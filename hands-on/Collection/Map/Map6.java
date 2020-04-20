import java.util.*;
import java.util.Map.*;

public class Map6{
	public static void main(String args[]){
		Country c=new Country();
		c.saveCountryCapital("India","Delhi");
		c.saveCountryCapital("China","Beijing");
		c.saveCountryCapital("Nepal","Kathmandu");

		System.out.println(c.getCapital("India"));
		System.out.println(c.getCountry("Kathmandu"));
		System.out.println(c.convert());
		
		Hashtable<String, String> M2 = c.reverse();
		System.out.println(M2);

}}

class Country{
	Hashtable<String,String> m=new Hashtable<>();

	public Hashtable<String,String> saveCountryCapital(String CountryName,String Capital){
		m.put(CountryName,Capital);
		return m;
	}

	public String getCountry(String CapitalName){
		Set<Entry<String,String>> s=m.entrySet();
		Iterator<Entry<String,String>> i=s.iterator();

		while(i.hasNext()){
			Map.Entry<String,String> m1=i.next();
			if(m1.getValue().equals(CapitalName))
				return m1.getKey();
		}
		return null;
	}

	public String getCapital(String CountryName){
		return m.get(CountryName);
	}

	public Hashtable<String,String> reverse(){
		Hashtable<String,String> M2=new Hashtable<String,String>();
		Set<Entry<String,String>> ss=m.entrySet();
		Iterator<Entry<String,String>> i=ss.iterator();
		
		while(i.hasNext()){
			Map.Entry<String,String> m1=i.next();
			M2.put(m1.getValue(),m1.getKey());
		}

		return M2;
	}

	public ArrayList<String> convert(){
		ArrayList<String> l=new ArrayList<>();
		Set<Entry<String,String>> s=m.entrySet();
		Iterator<Entry<String,String>> i=s.iterator();

		while(i.hasNext()){
			Map.Entry<String,String> m1=i.next();
			l.add(m1.getKey());
		}
		return l;
	}
}
			

	

	