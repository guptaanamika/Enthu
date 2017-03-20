package learn.design.singleton;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class Singleton {

	public static Singleton INSTANCE = null;

	private Singleton() {

	}

	public static Singleton getInstance() {

		if (null == INSTANCE) {
			synchronized (Singleton.class) {
				INSTANCE = new Singleton();
				System.out.println("Intialising Singleton class.....");
			}
		}
		return INSTANCE;
	}

	public void printMethod() {
		System.out.println("Yeah I am in Singleton class");
	}
}
