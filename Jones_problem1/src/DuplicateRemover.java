import java.io.File;
import java.util.Set;
import java.nio.*;
import java.io.*;
import java.util.HashSet;
import java.util.Scanner;
import java.io.PrintWriter;



public class DuplicateRemover {
	
	
	private Set<String> uniqueWords;
	
	
	public DuplicateRemover()
	{
		uniqueWords = new HashSet<>();
	}
	
	
	public void remove(String dataFile)
	{
		
		try {
		Scanner sc = new Scanner(new File(dataFile));
		
		while(sc.hasNext())
		{
			uniqueWords.add(sc.next());
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
			
			for(String string : uniqueWords)
			{
				pw.println(string);
			}
			pw.flush();
			pw.close();
		}
		
		catch(FileNotFoundException c){
			System.out.println(c);
			System.out.println("IO Event has occured");
			
		}
	}

	

}
