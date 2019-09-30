public class Hangar{


	public static void main(String[] args) {

		Car car1 = new Car("Clio");
		Boat boat1 = new Boat("Titanic");

		System.out.println(car1.doStuff());
		System.out.println(boat1.doStuff());
	}
}
