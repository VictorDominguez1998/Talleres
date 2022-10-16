import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);		
        
        System.out.println("Introduce el nombre: ");
        String nombre = read.next();
 
        System.out.println("Introduce la edad: ");
        int edad = read.nextInt();
 
        System.out.println("Introduce el sexo: ");
        char sexo = read.next().charAt(0);
        
        System.out.println("Introduce el peso: ");
        double peso = read.nextDouble();        
 
        System.out.println("Introduce la altura: ");
        double altura = read.nextDouble();         
        
        Persona individuo1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona individuo2 = new Persona(nombre, edad, sexo);
        Persona individuo3 = new Persona ();
 
        System.out.println("individuo1 : ");
        MuestraMensajePeso(individuo1);
        MuestraMayorDeEdad(individuo1);
        System.out.println(individuo1.toString());
        
        System.out.println();
        
        System.out.println("individuo2 : ");
        MuestraMayorDeEdad(individuo2);
        System.out.println(individuo2.toString());
        
        
        System.out.println();
        
        System.out.println("individuo3 : ");
        individuo3.setNombre("Manuel");
        individuo3.setEdad(35);
        individuo3.setSexo('H');
        individuo3.setPeso(85);
        individuo3.setAltura(1.95);
        MuestraMensajePeso(individuo3);
        MuestraMayorDeEdad(individuo3);
        System.out.println(individuo3.toString());
    }	
    
 
	public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.INFRAPESO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(Persona p) {
 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }	
    }

}

	    