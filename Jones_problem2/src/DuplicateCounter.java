import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class DuplicateCounter {
	
	private Map<String, Integer> wordCounter = new HashMap<>();
	
	
	public void count(String dataFile)
	{
		try
		{
			Scanner sc = new Scanner(new File(dataFile));
			
			while(sc.hasNext())
			{
				String word = sc.next();
				if(wordCounter.containsKey(word))
				{
				wordCounter.put(word, wordCounter.get(word)+1);
				}
				
				else
				{
					wordCounter.put(word,0);
				}
				
			}
			sc.close();
		}
		catch(FileNotFoundException c){
			System.out.println("IO Events has occured");
			System.out.println(c);
		}
	}
	

	public void write(String outputFile)
	{
		try
		{
			PrintWriter pw = new PrintWriter(new File(outputFile));
			
			for(Map.Entry<String, Integer> en : wordCounter.entrySet())
			{
				pw.printf("%s %d\n",en.getKey(),en.getValue());
			}
			
			pw.flush();
			pw.close();
		}
		catch(FileNotFoundException c)
		{
			System.out.println("IO Events has occured");
			System.out.println(c);
		}
	}

}
