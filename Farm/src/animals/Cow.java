package animals;

public class Cow {
	
	static int weight = 300; // greutatea la cow  |||| limit -- > 500kg
	static int age    = 7  ; // years old 
	static int speed  = 2  ; // kmh
	static int milk   = 0 ; // litres / day       |||| limit 10
	
	public static boolean eat (int food_kg){
		if ( weight < 500 && milk < 10 )
		{
			weight += 0.1 * food_kg;
			milk   += 0.2 * food_kg;
			return true;
		} else {
			return false;
		}
	}
	
	public static void sounds(){
		
		
	}
	
	public static boolean walk( int distance ){ //km
		if ( weight <= 350 && milk <= 3 && distance <= 5){
			System.out.println("I can walk only : " + distance);
			
		} 
		if ( (weight >= 350 && weight <=400 ) && (milk >= 3 && milk <= 6) && distance <= 2){
			System.out.println("I can walk only : " + distance);
			
		} 
		if ( weight >= 400 && milk >= 9){
			System.out.println("I can walk only : " + distance);
			
			return true;
		} else {
			System.out.println("I can't walk !");
			return false;
		}
		
	}
	
	public static void aging(){ //+1 an la virsta
		
		
	}
	
	public static void info(){
		System.out.println("    \t   -----  Cow -----");
		System.out.println( "\tCows weight is : " + weight + " kg ");
		System.out.println( "\tCows age is : " + age + " years old");
		System.out.println( "\tCows speed is : " + speed + " km/h");
		System.out.println( "\tCows make : " + weight + " liters of milk each day");
		
	}
	
}
