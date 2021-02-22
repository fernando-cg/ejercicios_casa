package empresa;

public class Empleado {
	
	private String dni ;
	
	private double sueldoBase ;
	
	private double pagoHoras ;
	
	private int hExtras ;
	
	private double irpf ;
	
	private String estadoCivil ;
	
	private int cantHijos ;
	
	private double totalExtras ;
	
	private double sueldoBruto ;
	
	private double retenciones ;

	public Empleado(String dni, double sueldoBase, double pagoHoras, int hExtras, String estadoCivil,
			int cantHijos) {
		this.dni = dni;
		this.sueldoBase = sueldoBase;
		this.pagoHoras = pagoHoras;
		this.hExtras = hExtras;
		this.estadoCivil = estadoCivil;
		this.cantHijos = cantHijos;
	}

	public Empleado(double sueldoBase, double pagoHoras, int hExtras, String estadoCivil, int cantHijos) {
		this.sueldoBase = sueldoBase;
		this.pagoHoras = pagoHoras;
		this.hExtras = hExtras;
		this.estadoCivil = estadoCivil;
		this.cantHijos = cantHijos;
	}
	
	public void horasExtras() {
		
		this.totalExtras = this.pagoHoras * this.hExtras ;
		
	}
	
	public void sueldoBruto() {
		
		this.sueldoBruto = this.totalExtras + this.sueldoBase ;
		
	}
	
	public void retenciones() {
		
		double porcentaje = 0 ;
		
		if (this.sueldoBruto<= 12450 && this.sueldoBruto >= 0) {
			
			porcentaje = 19.0 ;
		}
		else if(this.sueldoBruto >12450 && this.sueldoBruto <= 20200) {
			
			porcentaje = 24.0 ;
		}
		else if(this.sueldoBruto >20200 && this.sueldoBruto <= 35200) {
		
			porcentaje = 30.0 ;
		}
		else if(this.sueldoBruto >35200 && this.sueldoBruto <= 60000) {
			
			porcentaje = 37.0 ;
		}
		else if(this.sueldoBruto >60000 && this.sueldoBruto <= 300000) {
			
			porcentaje = 45.0 ;
		}
		else if(this.sueldoBruto >300000) {
			
			porcentaje = 47.0 ;
		}
		
		if(this.estadoCivil.equals("Casado")) {
			
			porcentaje = porcentaje - 2 ;
		}
		
		if(this.cantHijos >0) {
			
			porcentaje = porcentaje - this.cantHijos ;
		}
		
		this.irpf = porcentaje ;
		
		this.retenciones = (this.sueldoBruto * this.irpf) / 100 ;
		
	}

	@Override
	public String toString() {
		return "DNI=" + dni + ", Sueldo Base=" + sueldoBase + ", Pago por Horas=" + pagoHoras + ", Horas extras="
				+ hExtras + ", IRPF=" + irpf + ", Estado Civil=" + estadoCivil + ", Cantidad Hijos=" + cantHijos + "\n";
	}
	
	
	
	
}


