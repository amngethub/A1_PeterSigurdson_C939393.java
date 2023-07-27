public class Manager{
	public static void main(String [] args){
			Driver Sarah = new Driver();
			Sarah.getGoing();
		}
}

class Car{

	public boolean startCar(){
		System.out.println("The car has started");
		return true;
	}
}

class Driver{
	
	public Car bmw;
	
	// let's use a Constructor to initialize this Variable
	
	public Driver(){
		bmw = new Car();
    }
	
	
	public void getGoing(){
		bmw.startCar();
	}
}