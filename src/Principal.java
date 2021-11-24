import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		String direcci�nMACdestino = "0X ";
		String direcci�nMACorigen = "0X ";
		String direcci�nIPorigen = "";
		String direcci�nIPdestino = "";
		String numeroPuertoOrigen = "";
		String numeroPuertoDestino = "";
		String longitudSegmentoUDP = "";
		String longitudMensajeDHCP = "";
		String tipoMensajeDHCP = "";
		String tipoHardwareRed = "";
		String tama�oDirecci�nHardware = "";
		String identificadorTransacci�n = "";
		String direcci�nIPCliente = "";
		String suDirecci�nIP = "";
		String direcci�nHardwareCliente = "";
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
				direcci�nMACdestino+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=11)
					direcci�nMACdestino+=" - ";
			}
			else if(i>11 && i<=23) {
				direcci�nMACorigen+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=23)
					direcci�nMACorigen+=" - ";
			}
			else if(i>51 && i<=59) {
				direcci�nIPorigen+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=59)
					direcci�nIPorigen+=",";
			}
			else if(i>59 && i<=67) {
				direcci�nIPdestino+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=67)
					direcci�nIPdestino+=",";
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
				tama�oDirecci�nHardware+=texto.charAt(i);
			}
			else if(i>91 && i<=99) {
				identificadorTransacci�n+=texto.charAt(i);
			}
			else if(i>107 && i<=115) {
				direcci�nIPCliente+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=115)
					direcci�nIPCliente+=",";
			}
			else if(i>115 && i<=123) {
				suDirecci�nIP+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=123)
					suDirecci�nIP+=",";
			}
			else if(i>139 && i<=171) {
				direcci�nHardwareCliente+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=171)
					direcci�nHardwareCliente+=" - ";
			}
			
		}
		
		varAuxiliar = direcci�nIPorigen.split(",");
		direcci�nIPorigen = "";
		for (int i = 0; i < varAuxiliar.length; i++) {
			direcci�nIPorigen += ""+hexadecimalADecimal(varAuxiliar[i])+".";
		}
		varAuxiliar = direcci�nIPdestino.split(",");
		direcci�nIPdestino="";
		for (int i = 0; i < varAuxiliar.length; i++) {
			direcci�nIPdestino += ""+hexadecimalADecimal(varAuxiliar[i])+".";
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
		
		varAuxiliar = direcci�nIPCliente.split(",");
		direcci�nIPCliente = "";
		for (int i = 0; i < varAuxiliar.length; i++) {
			direcci�nIPCliente += ""+hexadecimalADecimal(varAuxiliar[i])+".";
		}
		
		varAuxiliar = suDirecci�nIP.split(",");
		suDirecci�nIP = "";
		for (int i = 0; i < varAuxiliar.length; i++) {
			suDirecci�nIP += ""+hexadecimalADecimal(varAuxiliar[i])+".";
		}

		System.out.println("\n\nMAC Destino: " + direcci�nMACdestino);
		System.out.println("MAC Origen: " + direcci�nMACorigen);
		System.out.println("IP Origen: " + direcci�nIPorigen);
		System.out.println("IP Destino: " + direcci�nIPdestino);
		System.out.println("N�mero de puerto origen: 0x"+numeroPuertoOrigen +"  Equivale a: " + hexadecimalADecimal(numeroPuertoOrigen));
		System.out.println("N�mero de puerto destino: 0x"+numeroPuertoDestino +"  Equivale a: " + hexadecimalADecimal(numeroPuertoDestino));
		System.out.println("Longitud del segmento UDP: 0x"+longitudSegmentoUDP +"  Equivale a: " + hexadecimalADecimal(longitudSegmentoUDP));
		System.out.println("Longitud del mensaje DHCP: "+longitudMensajeDHCP);
		System.out.println("Tipo de mensaje DHCP: 0x"+tipoMensajeDHCP);
		System.out.println("Tipo de hardware de red: 0x"+tipoHardwareRed);
		System.out.println("Tama�o de la direcci�n de hardware: 0x"+tama�oDirecci�nHardware);
		System.out.println("Identificador de la transacci�n: 0x"+identificadorTransacci�n);
		System.out.println("Identificador de la transacci�n: 0x"+direcci�nIPCliente);
		System.out.println("Su direcci�n IP es: 0x"+suDirecci�nIP);
		System.out.println("Direcci�n hardware del cliente: 0x"+direcci�nHardwareCliente);
		
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
		// Saber en cu�l posici�n de la cadena (de izquierda a derecha) vamos
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
