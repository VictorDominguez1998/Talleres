
public class Fish {
	static String typeOfFish;
	static int friendliness;
	static String fishName;
	static String typeFish;
	static int kindFish;
	
	public Fish() {
		typeOfFish = null;
		friendliness = 3;
	} 
	
	public Fish(String t, int f) {
		typeOfFish = t;
		friendliness = f;
	} 

	public Fish(String name, String type, int kind ) {
		fishName = name;
		typeOfFish = type;
		friendliness = kind;
	} 
	
	public int getFriendliness() {
		return Fish.friendliness;		
	} 
	
	public String getFishName() {
		return fishName;
	} 

	public String getTypeFish(int dNI) {
		return typeOfFish;
	} 

	public static Fish[] comparative() {		
		Fish fishArray[] = new Fish[25];
		fishArray[1] = new Fish("Amber", "AngelFish (Pez Ángel)", 5);	
		fishArray[2] = new Fish("James", "Guppy (Olomina)", 3);
		return fishArray;
	}
	
	public void nicestFish() {
		Fish a[] = new Fish[2];
		a = comparative();
		System.out.println(a[1].getFriendliness());
	}
	
	public static void index() {
	}	
}