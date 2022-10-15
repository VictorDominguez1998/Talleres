import java.util.Scanner;

public class Persona {

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
        
        Persona0 individuo = new Persona0(nombre, edad, sexo, peso, altura);
 
        System.out.println("Paciente: ");
        MuestraMensajePeso(individuo);
        MuestraMayorDeEdad(individuo);
        System.out.println(individuo.toString());
    }
 
 

	public static void MuestraMensajePeso(Persona0 p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona0.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona0.INFRAPESO:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona0.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(Persona0 p) {
 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }	
    }

}

class Persona0 { 
   
    private final static char SEXO_DEF = 'H';     
    public static final int INFRAPESO = -1;     
    public static final int PESO_IDEAL = 0;      
    public static final int SOBREPESO = 1;
 
  
    private String nombre;   
    private int edad;   
    private String DNI;  
    private char sexo;
    private double peso;    
    private double altura;
 
    
    public Persona0(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        cedula();
        this.sexo = sexo;
        comprobarSexo();
    }
 
    
    private void comprobarSexo() { 
        
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEF;
        }
    }
 
    private void cedula() {
        final int divisor = 23; 
       
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor); 
        
        char letraDNI = letraCedula(res);
         DNI = Integer.toString(numDNI) + letraDNI;
    }
 
    private char letraCedula(int res) {
        char letras[] = {'B', 'N', 'J', 'Z',
                         'S', 'Q', 'V', 'H', 'L', 
                         'C', 'K', 'E','T', 'R', 'W', 
                         'A', 'G', 'M', 'Y',
                         'F', 'P', 'D', 'X', };
        return letras[res];
    } 
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    } 
    
    public void setEdad(int edad) {
        this.edad = edad;
    } 
   
    public void setSexo(char sexo) {
        this.sexo = sexo;
    } 
  
    public void setPeso(double peso) {
        this.peso = peso;
    } 
    
    public void setAltura(double altura) {
        this.altura = altura;
    } 
    
    public int calcularIMC() {
       
        double pesoActual = peso / (Math.pow(altura, 2));
     
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }

    public boolean esMayorDeEdad() {
        boolean mayor = false;
        if (edad >= 18) {
            mayor = true;
        }
        return mayor;
    }
 
 
    @Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + DNI + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
}
	     
	     	     
	    


