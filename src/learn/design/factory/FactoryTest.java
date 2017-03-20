package learn.design.factory;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class FactoryTest {

	public static void main(String[] args) {
		HumanFactory factory = new HumanFactory();

		factory.get("boy").talk();
		factory.get("boy").talk();

		factory.get("girl").walk();
		factory.get("girl").talk();
	}
}
