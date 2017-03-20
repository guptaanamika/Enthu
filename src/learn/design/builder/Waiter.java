package learn.design.builder;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class Waiter {

	private StarbuckBuilder starbuckBuilder;

	public void setStarbuckBuilder(StarbuckBuilder starbuckBuilder) {
		this.starbuckBuilder = starbuckBuilder;
	}

	public Starbuck getStarbuck() {
		return starbuckBuilder.getStarbuck();
	}

	public void build() {
		starbuckBuilder.create();
		starbuckBuilder.buildSize();
		starbuckBuilder.buildDrink();

	}
}
