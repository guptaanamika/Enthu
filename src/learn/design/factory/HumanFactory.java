package learn.design.factory;

/**
 * @author anamika.gupta created_on : 11-Feb-2017
 **/
public class HumanFactory {

	public Human get(String type) {
		switch (type) {
		case "boy":
			return new Boy();
		case "girl":
			return new Girl();
		}
		return null;
	}
}
