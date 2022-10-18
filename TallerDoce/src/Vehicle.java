
public class Vehicle {
	// ii. Cree las variables static de la siguiente forma.
	public static String MAKE = "Augur";
	public static int numVehicles = 0;
	
	// iii. Cree sus variables de instancia de la siguiente forma.
	private String ChassisNo;
	private String model;
	
	// iv. Cree un constructor que tome un único parámetro formal de tipo String llamado "model".
	public Vehicle(String model) {
		numVehicles += 1;
		this.ChassisNo = "ch" + Integer.toString(numVehicles);
		this.model = model;
		System.out.println("Vehicle manufactured");
		//System.out.println("The vehicle is manufactured by: " + MAKE);
	}
	// v. Implante dos pares de métodos getter y setter que le permitan obtener y definir los valores de las dos variables de instancia.
	public String getChassisNo() {
		return ChassisNo;
	}

	public void setChassisNo(String chassisNo) {
		ChassisNo = chassisNo;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public static int totalVehicles() {
		return numVehicles;
	}
	
	public static String getMAKE() {
		return MAKE;
	}

	public static void setMAKE(String mAKE) {
		MAKE = mAKE;
	}
//La salida del programa para cada vehículo se debe parecer ahora a la siguiente
	@Override
	public String toString() {
		return "The vehicle manufactured by: " + Vehicle.MAKE + "\n" + 
				"The model type is: " + this.model + "\n" + 
				"The chassis number is: " + this.ChassisNo + "\n" + 
				"The engine make is: " + Engine.MAKE + "\n" +
				"The engine capacity is: " + Engine.CAPACITY + "\n" ;
	}
	
	
	// STATIC CLASS
	
	//4. a. La salida del programa para cada vehículo se debe parecer ahora a la siguiente
	public static class Engine extends Vehicle {
		
		private static final String MAKE  ="Predicter";
		private static final int CAPACITY = 1600;
		
		public Engine(String model) {
			super(model);
		}

		public static String getMake() {
			return MAKE;
		}
		public static int getCapacity() {
			return CAPACITY;
		}		
	} 
} 