package animais;

public class SonsAnimais {
	public static void main(String[] args) {
		
		Cachorro auau = new Cachorro();
		Passarinho piu = new Passarinho();
		Peixe glub = new Peixe();
		
		glub.emitSound();
		glub.move();
		
		piu.emitSound();
		piu.move();
		
		
		auau.emitSound();
		auau.move();
		
		
	}
}
