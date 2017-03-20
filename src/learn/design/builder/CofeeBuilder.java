package learn.design.builder;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class CofeeBuilder extends StarbuckBuilder {

	@Override
	public void buildSize() {
		starbuck.setSize("large");
		System.out.println("large Size added");

	}

	@Override
	public void buildDrink() {
		starbuck.setDrink("cofee");
		System.out.println("Coffee added as drink");

	}

}
