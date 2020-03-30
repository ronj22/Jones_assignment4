
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DuplicateCounter vr = new DuplicateCounter();
		
		vr.count("problem2.txt");
		vr.write("unique_word_count.txt");

	}

}
