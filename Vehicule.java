public abstract class Vehicule {


	private String brand;
	private int kilometers;

	public Vehicule(String brand){
		this.brand = brand;
		this.kilometers = 0;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public void setKilometers(int kilometers){
		this.kilometers = kilometers;
	}

	public String getBrand(){
		return this.brand;
	}

	public int getKilometers(){
		return this.kilometers;
	}

	public abstract String doStuff();
}

