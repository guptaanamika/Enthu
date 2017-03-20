package learn.design.decorator;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class ArtDecorator extends GirlDecorator {

	Girl girl;

	public ArtDecorator(Girl girl) {
		this.girl = girl;
	}

	@Override
	public void getDesc() {
		girl.getDesc();
		System.out.println("Art");
	}

}
