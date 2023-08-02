package formas;
import corpo.ShapeBase;
public class circle extends ShapeBase{
	
	private double radius;
	
	public circle (double radius) {
		this.radius = radius;
	}
	@Override
	public double calculoArea() {
		return Math.PI * radius * radius;
	}
	@Override
	public double calculoPerimetro() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	

}
