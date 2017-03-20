package learn.design.builder;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public abstract class StarbuckBuilder {

	protected Starbuck starbuck;

	public void create() {
		System.out.println("A drink is being made...........");
		starbuck = new Starbuck();
	}

	public Starbuck getStarbuck() {
		return starbuck;
	}

	public abstract void buildSize();

	public abstract void buildDrink();
}
