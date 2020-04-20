import java.util.*;
import java.util.Map.*;

public class question5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Map<Character,ArrayList<Card>> m=new TreeMap<>();
		
		System.out.println("Enter the number of cards: ");
		int n=sc.nextInt();
		System.out.println();
		sc.nextLine();
		
		for(int i=1;i<=n;i++){
			System.out.println("Enter the card: "+n);
			char s=sc.nextLine().charAt(0);
			int number=sc.nextInt();
			
			Card card=new Card();
			card.setSymbol(s);
			card.setNumber(number);
			sc.nextLine();
			
			if(!m.containsKey(s)){
				ArrayList<Card> l=new ArrayList<>();
				l.add(card);
				m.put(s,l);
			}
			else{
				ArrayList<Card> l=m.get(s);
				l.add(card);
			}
		}

		System.out.println("Distinct symbols are: ");
		Set<Entry<Character,ArrayList<Card>>> set=m.entrySet();
		Iterator<Entry<Character,ArrayList<Card>>> i=set.iterator();
		while(i.hasNext()){
			System.out.println(i.next().getKey()+" ");
		}
		
		set=m.entrySet();
		i=set.iterator();

		while(i.hasNext()){
			int sum=0;
			Map.Entry<Character,ArrayList<Card>> me=i.next();
			ArrayList<Card> l=me.getValue();
		
			System.out.println("Cards in"+me.getKey()+"Symbol");
			for(Card c:l){
				System.out.println(c.getSymbol()+" "+c.getNumber());
				sum=sum+c.getNumber();
			}
			System.out.println("Number of cards : " + l.size());
			System.out.println("Sum of Numbers : " + sum);
		}			
		
	}

}


class Card implements Comparable<Card> {
	private char symbol;
	private int number;
	
	public Card() {}
	
	public Card(char symbol, int number) {
		super();
		this.symbol = symbol;
		this.number = number;
	}

	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String toString() {
		return "Card [symbol=" + symbol + ", number=" + number + "]";
	}

	public int compareTo(Card o) {
		if (this.symbol < o.symbol) return -1;
		else if (this.symbol > o.symbol) return 1;
		else return 1;
	}
}