package factoryPattern;

public class MyCharacter implements MyWrapper {

	@Override
	public void printType() {
		System.out.println("The value is of type: MyCharacter");
	}
}
