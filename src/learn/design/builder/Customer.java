package learn.design.builder;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class Customer {

	public static void main(String[] args) {
		Waiter waiter = new Waiter();

		StarbuckBuilder builder = new CofeeBuilder();

		waiter.setStarbuckBuilder(builder);
		waiter.build();
		System.out.println(waiter.getStarbuck().getClass());
	}
}
