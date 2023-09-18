package linguagens;
import java.util.*;



public class terminal {
	public static void main(String[] args) {
		
		Linguagem ling = new Linguagem("Java", 1991, "IntelliJ");
		Linguagem ling2 = new Linguagem("Python", 1991, "Pycharm");
		Linguagem ling3 = new Linguagem("C#", 2000, "Visual Studio");
	
		HashSet <Linguagem> lingHash = new HashSet<Linguagem>();
	
		lingHash.add(ling);
		lingHash.add(ling2);
		lingHash.add(ling3);
		
		System.out.println(lingHash);
		
		lingHash.sort(Comparator.comparingDouble(Linguagem.getName()).thenComparing(ling2::getName));
		
	}

	
}


