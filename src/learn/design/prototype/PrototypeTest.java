package learn.design.prototype;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Prototype p = new Prototype(10);

		Prototype q = p.clone();
		q.setA(20);

		System.out.println(p.getA());
		System.out.println(q.getA());
	}
}
