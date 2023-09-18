import animais.Cachorro;
import animais.Passaro;
import animais.Peixe;
import metodos.Animal;

public class AnimalSimulator{
	public static void main(String[] args) {
		Animal cachorro = new Cachorro();
		Animal passaro = new Passaro();
		Animal peixe = new Peixe();
		
		TodoAnimal(cachorro);
		TodoAnimal(passaro);
		TodoAnimal(peixe);
	}	
		public static void TodoAnimal(Animal animal){
			animal.emitSound();
			animal.move();
			System.out.println();
		
	}
	
}
