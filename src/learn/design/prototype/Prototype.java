package learn.design.prototype;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class Prototype implements Cloneable {

	int a;

	public Prototype(int a) {
		this.a = a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getA() {
		return a;
	}

	@Override
	public Prototype clone() throws CloneNotSupportedException {
		return (Prototype) super.clone();
	}
}
