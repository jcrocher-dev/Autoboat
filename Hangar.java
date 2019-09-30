public class Hangar{


	public static void main(String[] args) {

		Car car1 = new Car("Clio");
		Boat boat1 = new Boat("Titanic");

		System.out.println("je suis " + car1.getBrand() + " et je fais " + car1.doStuff());
		System.out.println("je suis " + boat1.getBrand() + " et je fais " + boat1.doStuff());
	}
}
