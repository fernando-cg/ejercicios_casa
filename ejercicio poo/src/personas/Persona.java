package personas;

public class Persona {

	//attributes
	
	private String nombre = "" ;
	private int edad = 0;
	private String dni ;
	private char sexo = 'M' ; // M o H
	private double peso = 0.0 ; // en kg
	private double altura = 0.0; // en m
	
	//builder
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	//methods
	
	//calcular IMC
	
	public int calcularIMC() {
		
		int assessment = 0 ;
		
		double result ;
		
		result = (peso / (Math.pow(altura, 2)));
		
		if(result < 20) {
			
			assessment = -1 ;
		}
		else if(result >= 20 && result <= 25) {
			
			assessment = 0 ;
		}
		else if(result > 25) {
			
			assessment = 1 ;
		}
		
		return assessment ;
	}
	
	//comprobar edad 
	public boolean esMayorDeEdad() {
		 
		if(edad>=18) {
			
			return true ;
		}
		else {
			
			return false ;
		}
	}
	
	//comprobar Sexo
	private void comprobarSexo() {
		
		if(!(sexo == 'M' && sexo == 'H')) {
			
			sexo = 'M' ;
		}
	}
	
	
	//Generar DNI
	
	public int generardni() {
		
		int id = (int) (Math.random() * 100000000) ;
		
		return id ;
	}

	//tostring
	
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso
				+ ", altura=" + altura + "]";
	}
	
	
	
	
}