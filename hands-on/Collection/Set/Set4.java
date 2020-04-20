import java.util.*;

public class Set4{
	public static void main(String args[]){
		Country c=new Country();
		c.saveCountryNames("India");
		c.saveCountryNames("Pakistan");
		c.saveCountryNames("China");
		c.saveCountryNames("Nepal");
		c.saveCountryNames("Bhutan");
		System.out.println(c.getCountry("India"));
		System.out.println(c.getCountry("USA"));		
}}

class Country{
	TreeSet<String> h=new TreeSet<>();

	public TreeSet<String> saveCountryNames(String CountryName){
		h.add(CountryName);
		return h;
	}

	public String getCountry(String CountryName){
		Iterator<String> i=h.iterator();

		while(i.hasNext()){
			if(i.next().equals(CountryName))
				return CountryName;
		}
	
		return null;
	}
}