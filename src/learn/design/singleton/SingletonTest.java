package learn.design.singleton;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class SingletonTest {

	public static void main(String[] args) {
		Singleton.getInstance().printMethod();
		Singleton.getInstance().printMethod();
	}
}
