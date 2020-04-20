import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class IOStream3{
	public static void main(String args[]) throws IOException{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Input file name");
		String input=sc.nextLine();
		System.out.println("Enter the Output file name");
		String output=sc.nextLine();
		
		File in=new File(input);
		File out=new File(output);
		
		BufferedReader br=new BufferedReader(new FileReader(in));
		BufferedWriter bw=new BufferedWriter(new FileWriter(out));

		Map<String,Integer> map=new TreeMap<>();

		String str;
		while((str=br.readLine())!=null){
			str=str.trim();
			String[] words=str.split(" ");

			for(String word:words){
				if(!map.containsKey(word))	
					map.put(word,1);
				else
					map.put(word,map.get(word)+1);
			}
		};

		Set<Entry<String, Integer>> set = map.entrySet();
		Iterator<Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Entry<String, Integer> m = it.next();
			
			bw.write(m.getKey() + " : " + m.getValue() + "\n");
		}

		br.close();
		bw.close();
	}
}