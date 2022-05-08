
/**
 * <b><h6>Rocco Mele</b></h6>
 * 
 * <u><h6>Titolo: Calcolo area del trapezio</u></h6>
 * 
 * @author Rocco
 *
 * non ci sono errori
 */
public class Trapezio {
	
	private float baseMaggiore, baseMinore, altezza;
	
	/**
	 * 
	 * @param baseMaggiore base maggiore del trapezio in cm
	 * @param baseMinore base minore del trapezio in cm 
	 * @param altezza altezza del trapezio in cm
	 */
	
	public Trapezio(float baseMaggiore, float baseMinore, float altezza) {
		
		this.baseMaggiore = baseMaggiore;
		this.baseMinore = baseMinore;
		this.altezza = altezza;
	}
	
	/**
	 * 
	 * @return area del trapezio in cm^2
	 */

	public float area() {
		
		return (baseMaggiore*baseMinore)*altezza/2;
	}
	
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Trapezio t = new Trapezio(2,3,4);
		System.out.println("Area del trapezio: " + t.area());

	}
}