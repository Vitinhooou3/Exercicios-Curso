package formas;
import corpo.ShapeBase;

public class Square extends ShapeBase {
	private double side;
	
	public Square (double side) {
		this.side = side;
	}
	
	@Override
	public double calculoArea() {
		
		return side * side * side * side;
	}
	
	public double calculoPerimetro() {
		return side + side + side + side;
		
	}
}
