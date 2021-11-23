import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String direcciónMACdestino = "";
		String direcciónMACorigen = "";
		String direcciónIPorigen = "";
		String direcciónIPdestino = "";
//		5. numeroPuertoOrigen
//		6. numeroPuertoDestino
//		7. longitudSegmentoUDP
//		8. longitudMensajeDHCP
//		9. tipoMensajeDHCP
//		10.tipoHardwareRed
//		11.tamañoDirecciónHardware
//		12.identificadorTransacción
//		13.direcciónIPCliente
//		14. direcciónIP
//		15. direcciónHardwareCliente

		String cadena = JOptionPane.showInputDialog ( "texto: " );
		//System.out.println("Su texto es: " + cadena);

		String texto = cadena.replaceAll(" ", "");
		System.out.println("Su texto es: " + texto);
		
		for(int i=0; i<texto.length();i++) {
			//Sacamos la MAC ORIGEN
			if(i<=11) {
				direcciónMACdestino+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=11)
					direcciónMACdestino+=" - ";
			}
			else if(i>11 && i<=23) {
				direcciónMACorigen+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=23)
					direcciónMACorigen+=" - ";
			}
			else if(i>51 && i<=59) {
				direcciónIPorigen+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=59)
					direcciónIPorigen+=",";
			}
			else if(i>59 && i<=67) {
				direcciónIPdestino+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=67)
					direcciónIPdestino+=",";
			}
			
		}
		System.out.println("\n\nMAC Origen: " + direcciónMACdestino);
		System.out.println("MAC Destino: " + direcciónMACorigen);
		System.out.println("IP Origen: " + direcciónIPorigen);
		System.out.println("IP Destino: " + direcciónIPdestino);
		
		
		long respuesta = hexadecimalADecimal(cadena);
		if(respuesta != -1) {
			
			String subCadena = cadena.substring(5,10);
			System.out.println(subCadena);
			
			long decimal = hexadecimalADecimal(cadena);
			String binario = binary(cadena);
			System.out.printf("El hexadecimal %s es %d en decimal \n", cadena, decimal);
			System.out.printf("El hexadecimal %s es %s en binario \n", cadena, binario);
		}else {
			System.out.println("Caracter No Reconocido");
		}
	}

	public static String binary(String hexa) {
		long numHex = hexadecimalADecimal(hexa);
		String binary = Integer.toBinaryString((int) numHex);
		return binary;
	}   

	public static int caracterHexadecimalADecimal(char caracter) {
		switch (caracter) {
		case 'a':
			return 10;
		case 'b':
			return 11;
		case 'c':
			return 12;
		case 'd':
			return 13;
		case 'e':
			return 14;
		case 'f':
			return 15;
		case '0':
			return 0;
		case '1':
			return 1;
		case '2':
			return 2;
		case '3':
			return 3;
		case '4':
			return 4;
		case '5':
			return 5;
		case '6':
			return 6;
		case '7':
			return 7;
		case '8':
			return 8;
		case '9':
			return 9;
		default:
			return -1;
		}
	}

	public static long hexadecimalADecimal(String hexadecimal) {
		long decimal = 0;
		// Saber en cuál posición de la cadena (de izquierda a derecha) vamos
		int potencia = 0;
		// Recorrer la cadena de derecha a izquierda
		
			for (int x = hexadecimal.length() - 1; x >= 0; x--) {
				int valor = caracterHexadecimalADecimal(hexadecimal.charAt(x));
				if(valor != -1){
				long elevado = (long) Math.pow(16, potencia) * valor;
				decimal += elevado;
				// Avanzar en la potencia
				potencia++;
				}else {
					return valor;
				}
			}
		
		return decimal;
	}

}
