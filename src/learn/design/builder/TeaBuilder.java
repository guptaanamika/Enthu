package learn.design.builder;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class TeaBuilder extends StarbuckBuilder {

	@Override
	public void buildSize() {
		starbuck.setSize("large");
		System.out.println("large tea Size added");

	}

	@Override
	public void buildDrink() {
		starbuck.setDrink("Tea");
		System.out.println("Tea added as drink");

	}
}
