import java.util.*;
import java.util.Map.Entry;

public class Map4{

	public static void main(String[] args) {
		ContactList contactsList = new ContactList();
		
		contactsList.addContact("Musu", 962919);
		contactsList.addContact("Muskan", 100);
		contactsList.addContact("MusuAgarwal", 101);
				
		System.out.println("Muskan " + contactsList.doesContactNameExist("Police"));
		System.out.println("100 " + contactsList.doesContactNumberExist(98765432));
		
		System.out.println();
		contactsList.listAllContacts();
	}

}

class ContactList {
	HashMap<String, Integer> contacts = new HashMap<>();
	
	public void addContact(String name, Integer number) {
		contacts.put(name, number);
	}
	

	
	public boolean doesContactNameExist(String name) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			
			if (me.getKey().equals(name)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean doesContactNumberExist(Integer number) {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();

			if (me.getValue().intValue() == number) {
				
				return true;
			}
		}
		
		return false;
	}
	
	public void listAllContacts() {
		Set<Entry<String, Integer>> set = contacts.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, Integer> me = it.next();
			System.out.println(me);
		}

	}
}