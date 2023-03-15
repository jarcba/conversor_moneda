
package challenge_Conversor;
import javax.swing.*;

public class Conversor_Monedas {

	public static void main(String[] args) {
		
		int conversor=0;
		
		do{
			conversor =Integer.parseInt(JOptionPane.showInputDialog(
					"CONVERSOR DE MONEDAS:\n"
					+ "1. Pesos Argentinos a Dolar\n"
					+ "2. Pesos Argentinos a Euros\n"
					+ "3. Pesos Argentinos a Libras Esterlinas\n"
					+ "4. Pesos Argentinos a Yen Japones\n"
					+ "5. Pesos Argentinos a Won Sul_Coreano\n"
					+ "6. Salir\n"
					+ "Elija una Opcion:"));
		
				switch(conversor) {
					case 1:
						Double pesosArg = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir a Dolares"));
						Double dolares = Math.floor(pesosArg / 375.00);
						JOptionPane.showMessageDialog(null, pesosArg + " Pesos Argentinos son: " + dolares + " Dolares");
						break;
					case 2:
						Double pesosArg2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir a Euros"));
						Double euros = Math.floor(pesosArg2 / 211.89);
						JOptionPane.showMessageDialog(null, pesosArg2 + " Pesos Argentinos son: " + euros + " Euros");
						break;
					case 3:
						Double pesosArg3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir a Libras Esterlinas"));
						Double libraEster = Math.floor(pesosArg3 / 238.76);
						JOptionPane.showMessageDialog(null, pesosArg3 + " Pesos Argentinos son: " + libraEster + " Libras Esterlinas");
						break;
					case 4:
						Double pesosArg4 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir a Yen Japones"));
						Double yenJap = Math.floor(pesosArg4 / 1.47055);
						JOptionPane.showMessageDialog(null, pesosArg4 + " Pesos Argentinos son: " + yenJap + " Yen Japones");
						break;
					case 5:
						Double pesosArg5 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad a convertir a Won Sur Coreano"));
						Double won = Math.floor(pesosArg5 / 0.15);
						JOptionPane.showMessageDialog(null, pesosArg5 + " Pesos Argentinos son: " + won + " Won Sur Coreano");
						break;
					case 6:
						JOptionPane.showMessageDialog(null, "Hasta Pronto");
						break;
						default: JOptionPane.showMessageDialog(null, "Opcion Incorrecta");
				}
		}while(conversor != 6);

	}

}
