package hashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UsoHashSet {
	public static void main(String[] args) {
	
		Set<String> CoresArcoIris = new LinkedHashSet<>();
	
		CoresArcoIris.add("Vermelho");
		CoresArcoIris.add("Laranja");
		CoresArcoIris.add("Amarelo");
		CoresArcoIris.add("Verde");
		CoresArcoIris.add("Azul");
		CoresArcoIris.add("Anil");
		CoresArcoIris.add("Violeta");
	
		System.out.println(CoresArcoIris.size());
		System.out.println(CoresArcoIris);
	

		
		Set <String>CoresArcoIris2 = new HashSet<>(CoresArcoIris);
		System.out.println(CoresArcoIris2);
		
		Set <String> CoresArcoIris3 = new TreeSet<>(CoresArcoIris);
		System.out.println(CoresArcoIris3);
		
		List<String> CoresList = new ArrayList<>(CoresArcoIris);
		Collections.reverse(CoresList);
		System.out.println(CoresList);
		
		for (String cor: CoresArcoIris ) {
			if (cor.startsWith("V")) {
				System.out.println(cor);
			}
		}
		
		for (String cor : CoresArcoIris) {
			if (cor.startsWith("V")) {
				CoresList.remove(cor);
				System.out.println(CoresList);
			}
		}
		
		
	
		}
	}

