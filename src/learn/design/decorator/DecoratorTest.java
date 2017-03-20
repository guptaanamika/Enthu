package learn.design.decorator;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class DecoratorTest {

	public static void main(String[] args) {
		IndianGirl indian = new IndianGirl();

		indian.getDesc();
		System.out.println("---------------------------------------");
		GirlDecorator d = new ArtDecorator(indian);
		d.getDesc();

		System.out.println("---------------------------------------");
		GirlDecorator e = new ScienceDecorator(d);
		e.getDesc();
	}
}
