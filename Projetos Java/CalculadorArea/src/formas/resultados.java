package formas;



public class resultados {
	public static void main(String[] args) {
		circle bola = new circle(30.0);	
		Square quadrado = new Square(3.0);
		Triangle triangulo = new Triangle(10.0, 8.0, 5.0, 5.0, 5.0);
		
		
		
		System.out.println("Área do circulo: " + bola.calculoArea());
		System.out.println("Área do quadrado: " + quadrado.calculoArea());
		System.out.println("Área de triangulo: " + triangulo.calculoArea());
		System.out.println("Permetro do círculo: " + bola.calculoPerimetro());
		System.out.println("Perímetro do quadrado: " + quadrado.calculoPerimetro());
		System.out.println("Perímetro do triangulo: " + triangulo.calculoPerimetro());
		
		
	}
}
