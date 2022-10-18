
public class TestVehicle {
	
	@SuppressWarnings("static-access")
	public static void main(String args[]) {
		// a. El uso del valor de la variable estática "MAKE".
		System.out.println("Manufacturer: " + Vehicle.MAKE);
		
		// b. El uso del valor de la variable estática "numVehicles"
		System.out.println("Number of vehicles manufactured: " + Vehicle.numVehicles);
		
		System.out.println();
		System.out.println();
		
		//v. Ejecute el programa. Verá que el programa no se ejecutará. Esto es porque todavía no hemos creado una instancia (objeto) de la clase Vehicle.
		//vi. En el método main, cree un objeto vehicle denominado vehicle1 por encima de la sentencia de salida para el número de chasis.
		Vehicle vehicle1 = new Vehicle("Ford Mustang");
		//iv.	En el método main use la variable "chassisNo" 
		System.out.println("The chassis number is: " + vehicle1.getChassisNo());
		System.out.println("The model type is: " + vehicle1.getModel());
		System.out.println();
		// a.	En el método main, por encima de la línea que muestra el número total de coches fabricados, agregue la siguiente línea de código:
		Vehicle.setMAKE("Seer");
		Vehicle vehicle2 = new Vehicle("Edict");
		System.out.println("The chassis number is: " + vehicle2.getChassisNo());
		System.out.println("The model type is: " + vehicle2.getModel());
		System.out.println();
		
		System.out.println("Number of vehicles manufactured: " + Vehicle.totalVehicles());
		System.out.println();
		System.out.println();
		
		System.out.println("USING TOSTRING() METHOD");
		System.out.println(vehicle1.toString());
		System.out.println(vehicle2.toString());
		System.out.println();
		System.out.println();
		
		
		//Vaya a su método main y cree un objeto Engine denominado vehicle3 por encima de la línea de código que muestra el
		//número total de coches fabricados. Para ello, tendrá que seguir estas directrices:

		Vehicle.Engine vehicle3 = new Vehicle.Engine("Fortune");
		
		System.out.println("OUTERCLASS - INNERCLASS FROM VEHICLE 3 OBJECT");
		System.out.println(vehicle3.toString());
		
		System.out.println("Vehicle number " + vehicle3.getChassisNo() + " is a " + vehicle3.getModel() + " model and has an engine"
				+ " capacity of " + vehicle3.getCapacity() + "cc");		
		
		//* PUNTO 4. F. (no funciona ya que no tienen acceso a los trabajos internos de la clase estática Engine).

	}
}