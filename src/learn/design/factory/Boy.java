package learn.design.factory;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class Boy implements Human {

	@Override
	public void talk() {
		System.out.println("Boy is talking");

	}

	@Override
	public void walk() {
		System.out.println("Boy is walking");
	}

}
