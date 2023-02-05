public class TestDuck{
	public static void main(String[] args){
		int weight = 8;
		float density = 2.3f;
		String name = "Donald";
		long[] feathers = {1, 2, 3, 4, 5, 6};
		boolean canFly = true;
		int airspeed = 22;

		Duck[] d = new Duck[7];
		
		d[0] = new Duck();					// type 1
		d[1] = new Duck(density, weight);// type 5
		d[2] = new Duck(name, feathers);	// type 3 
		d[3] = new Duck(canFly);			// type 2
		d[4] = new Duck(3.3f, airspeed);	// type 5
		d[5] = new Duck(false);			// type 2 
		d[6] = new Duck(airspeed, density);// 4
	}
}

class Duck{
	int pounds = 6;
	float floatability = 2.1f;
	String name = "Generic";
	long[] feathers = {1, 2, 3, 4, 5, 6, 7};
	boolean canFly = true;
	int maxSpeed = 25;

	public Duck(){
		System.out.println("Type 1 Duck");
	}
	public Duck(boolean fly){
		canFly = fly;
		System.out.println("Type 2 Duck");
	}
	public Duck(String n, long[] f){
		name = n;
		feathers = f;
		System.out.println("Type 3 Duck");
	}
	public Duck(int w, float f){
		pounds = w;
		floatability = f;
		System.out.println("Type 4 Duck");
	}
	public Duck(float density, int max){
		floatability = density;
		maxSpeed = max;
		System.out.println("Type 5 Duck");
	}
}