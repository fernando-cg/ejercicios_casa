package empresa;

import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Main {
	
	public static void crearempleado(ArrayList empleado) {
		
		String dni = JOptionPane.showInputDialog(null, "Introduzca el DNI del empleado:", "DNI", JOptionPane.QUESTION_MESSAGE);
		
		double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el sueldo base del empleado:", "Sueldo base", JOptionPane.QUESTION_MESSAGE));
	
		double pagoHora = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduzca el pago por hora extra:", "Horas extra", JOptionPane.QUESTION_MESSAGE));

		int horasExtra = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el numero de horas extra que ha realizado el empleado", "Horas extras", JOptionPane.QUESTION_MESSAGE));
		
		String[] estadoCivil = {"Soltero", "Casado", "Divorciado", "Separación en proceso", "Viudo", "Concubinato"};
		
		int menu = JOptionPane.showOptionDialog(null, "Seleccione un estado civil", "Estado civil", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, estadoCivil, estadoCivil[0]);
		
		String estado = estadoCivil[menu] ;
		
		int cantHijos = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la cantidad de hijos del empleado:", "Hijos", JOptionPane.QUESTION_MESSAGE));
		
		empleado.add(new Empleado(dni,sueldoBase,pagoHora,horasExtra,estado,cantHijos)) ;
	}

	public static void main(String[] args) {

		ArrayList<Empleado> empleado = new ArrayList<Empleado>() ;
		JPanel panel = new JPanel(new GridBagLayout());
		
		JOptionPane.showMessageDialog(null, "Bienvenido a este programa pulse aceptar y seleccione una opcción");
		do {
			String[] options = {"Añadir empleado", "Ver informacion avanzada", "ver informacion simple", "Salir"};
			
			int menu = JOptionPane.showOptionDialog(null, "Seleccione una opcción", "Menu", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			switch (menu) {
			case 0:
				
				crearempleado(empleado) ;
				
				break;
	
			case 1:
				
				JComboBox box3 = new JComboBox(empleado.toArray());
				box3.setSelectedIndex(0);
				JOptionPane.showMessageDialog(null, box3, "Información Completa",JOptionPane.DEFAULT_OPTION);
				panel.add(box3);
				
				break;
				
			case 2:
				
				JOptionPane.showMessageDialog(null,empleado.toString(), "Información", JOptionPane.DEFAULT_OPTION);
				
				break;
				
			case 3:
				
				System.exit(0);
				
				break;
			}
		}while(true) ;
	}
	

}
