package mapEstados;

import java.util.*;

public class MapEstados {
	public static void main(String[] args) {

	
		/*---------------Dando put na treeMap-----------*/
		
		Map<String, Integer> estadosBr2 = new TreeMap<>() {{
				put("Alagoas", 3351);
				put("Pernambuco", 9616);
				put("Ceará", 9187);
				
			}};
			
			System.out.println(estadosBr2);
			
		/*-------------Verificação de existência de uma chave----------------*/
			
		System.out.println("Vendo se a Paraíba está no map: " + estadosBr2.containsKey("Paraíba"));
		
			if (estadosBr2.containsKey("Paraíba") != true) {
				estadosBr2.put("Paraíba", 4039);
			}else {
				System.out.println("Já está!");
			}
		
		/*---------------Organizando por numero de população----------------*/	
			
			estadosBr2.entrySet().stream()
				.sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
				.limit(10)
				.forEach(System.out::println);
			
		/*------------------Soma e média das população com iterator----------------------*/	
			
			Iterator<Integer> iterator = estadosBr2.values().iterator();
			int soma = 0;
			while(iterator.hasNext()) {
				soma += iterator.next();
				
			}
			soma = soma/3;
			System.out.println(soma);
			
		/*----------------Removendo caso seja menos-------------------------*/	
			estadosBr2.entrySet().removeIf(a -> a.getValue() < 4000);
			System.out.println(estadosBr2);
			
			
		/*-----------------Usando o clear--------------------------*/	
			
			estadosBr2.clear();
			System.out.println(estadosBr2);
			
	}
}

		
		
		
	
	
