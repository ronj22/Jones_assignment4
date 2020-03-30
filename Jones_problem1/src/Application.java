
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateRemover rm = new DuplicateRemover();
		
		rm.remove("problem1.txt");
		rm.write("unique_words.txt");

	}

}
