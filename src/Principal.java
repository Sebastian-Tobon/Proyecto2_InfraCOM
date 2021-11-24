import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String direcciónMACdestino = "0X ";
		String direcciónMACorigen = "0X ";
		String direcciónIPorigen = "";
		String direcciónIPdestino = "";
		String numeroPuertoOrigen = "";
		String numeroPuertoDestino = "";
		String longitudSegmentoUDP = "";
		String longitudMensajeDHCP = "";
		String tipoMensajeDHCP = "";
		String tipoHardwareRed = "";
		String tamañoDirecciónHardware = "";
		String identificadorTransacción = "";
		String direcciónIPCliente = "";
		String suDirecciónIP = "";
		String direcciónHardwareCliente = "";
		String opciones = "";
		
		//Variables auxiliares
		String[] varAuxiliar = new String[20];
		String[] varAuxiliar2 = new String[20];
		
		//String cadena = JOptionPane.showInputDialog ( "texto: " );
		String cadena = "ffffffffffff0008744f3623080045000148b310000"
				+ "08011869500000000ffffffff004400430134e97b01010600"
				+ "3e5e0ce300000000000000000000000000000000000000000"
				+ "008744f362300000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "00000000000000000000000638253633501017401013d0701"
				+ "0008744f36233204c0a801650c044e6f686f3c084d5346542"
				+ "0352e30370b010f03062c2e2f1f21f92bff000000000000000000";
		
		String texto = cadena.replaceAll("\\s", "");
		
		for(int i=0; i<texto.length();i++) {
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
			else if(i>67 && i<=71) {
				numeroPuertoOrigen+=texto.charAt(i);
			}
			else if(i>71 && i<=75) {
				numeroPuertoDestino+=texto.charAt(i);
			}
			else if(i>75 && i<=79) {
				longitudSegmentoUDP+=texto.charAt(i);
			}
			else if(i>83 && i<=85) {
				tipoMensajeDHCP+=texto.charAt(i);
			}
			else if(i>85 && i<=87) {
				tipoHardwareRed+=texto.charAt(i);
			}
			else if(i>87 && i<=89) {
				tamañoDirecciónHardware+=texto.charAt(i);
			}
			else if(i>91 && i<=99) {
				identificadorTransacción+=texto.charAt(i);
			}
			else if(i>107 && i<=115) {
				direcciónIPCliente+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=115)
					direcciónIPCliente+=",";
			}
			else if(i>115 && i<=123) {
				suDirecciónIP+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=123)
					suDirecciónIP+=",";
			}
			else if(i>139 && i<=171) {
				direcciónHardwareCliente+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=171)
					direcciónHardwareCliente+=" - ";
			}
			
		}
		
		varAuxiliar = direcciónIPorigen.split(",");
		direcciónIPorigen = "";
		for (int i = 0; i < varAuxiliar.length; i++) {
			direcciónIPorigen += ""+hexadecimalADecimal(varAuxiliar[i])+".";
		}
		varAuxiliar = direcciónIPdestino.split(",");
		direcciónIPdestino="";
		for (int i = 0; i < varAuxiliar.length; i++) {
			direcciónIPdestino += ""+hexadecimalADecimal(varAuxiliar[i])+".";
		}
		
		longitudMensajeDHCP = ""+(hexadecimalADecimal(longitudSegmentoUDP)-8);
		
		if(tipoMensajeDHCP.equalsIgnoreCase("01")) {
			tipoMensajeDHCP = "01 = 1 Mensaje de Solicitud";
		}else {
			tipoMensajeDHCP = "00 = 0 Mensaje de Respuesta";
		}
		
		if(tipoHardwareRed.equalsIgnoreCase("01")) {
			tipoHardwareRed = "01 = 1 El dispositivo es Ethernet";
		}else {
			tipoHardwareRed = "00 = 0 El dispositivo es 802.11";
		}
		
		varAuxiliar = direcciónIPCliente.split(",");
		direcciónIPCliente = "";
		for (int i = 0; i < varAuxiliar.length; i++) {
			direcciónIPCliente += ""+hexadecimalADecimal(varAuxiliar[i])+".";
		}
		
		varAuxiliar = suDirecciónIP.split(",");
		suDirecciónIP = "";
		for (int i = 0; i < varAuxiliar.length; i++) {
			suDirecciónIP += ""+hexadecimalADecimal(varAuxiliar[i])+".";
		}

		System.out.println("\n\nMAC Destino: " + direcciónMACdestino);
		System.out.println("MAC Origen: " + direcciónMACorigen);
		System.out.println("IP Origen: " + direcciónIPorigen);
		System.out.println("IP Destino: " + direcciónIPdestino);
		System.out.println("Número de puerto origen: 0x"+numeroPuertoOrigen +"  Equivale a: " + hexadecimalADecimal(numeroPuertoOrigen));
		System.out.println("Número de puerto destino: 0x"+numeroPuertoDestino +"  Equivale a: " + hexadecimalADecimal(numeroPuertoDestino));
		System.out.println("Longitud del segmento UDP: 0x"+longitudSegmentoUDP +"  Equivale a: " + hexadecimalADecimal(longitudSegmentoUDP));
		System.out.println("Longitud del mensaje DHCP: "+longitudMensajeDHCP);
		System.out.println("Tipo de mensaje DHCP: 0x"+tipoMensajeDHCP);
		System.out.println("Tipo de hardware de red: 0x"+tipoHardwareRed);
		System.out.println("Tamaño de la dirección de hardware: 0x"+tamañoDirecciónHardware);
		System.out.println("Identificador de la transacción: 0x"+identificadorTransacción);
		System.out.println("Identificador de la transacción: 0x"+direcciónIPCliente);
		System.out.println("Su dirección IP es: 0x"+suDirecciónIP);
		System.out.println("Dirección hardware del cliente: 0x"+direcciónHardwareCliente);
		
		long respuesta = hexadecimalADecimal(cadena);
		if(respuesta != -1) {
			
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
