package Library;

public class test {
	public static void main(String[] args) {
		
		KidUsers kidUsers = new KidUsers();
		
		kidUsers.setAge(10);
		kidUsers.setBookType("Kids");
		kidUsers.registerAccount();
		kidUsers.requestBook();
		
		kidUsers.setAge(18);	
		kidUsers.setBookType("Fiction");		
		kidUsers.registerAccount();
		kidUsers.requestBook();

		System.out.println();
		
		AdultUser adultUser = new AdultUser();
		
		adultUser.setAge(5);
		adultUser.setBookType("Kids");
		adultUser.registerAccount();
		adultUser.requestBook();
		
		adultUser.setAge(23);	
		adultUser.setBookType("Fiction");		
		adultUser.registerAccount();
		adultUser.requestBook();
		
	}
}
