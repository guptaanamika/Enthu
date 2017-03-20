package learn.design.singleton;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public enum SingletonEnum {

	INSTANCE;

	public void printMethod() {
		System.out.println("Yeah I am in method of singleton enum.");
	}
}
