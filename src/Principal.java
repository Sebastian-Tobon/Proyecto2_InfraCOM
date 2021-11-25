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
		String opcion53 = "";
		String aux53 = "";
		String opcion61 = "";
		String aux61 = "";
		String opcion55 = "";
		String aux55 = "";
		String opcion51 = "";
		String aux51 = "";
		String opcion54 = "";
		String aux54 = "";
		
		//Variables auxiliares
		String[] varAuxiliar = new String[20];
		String[] aux = new String[20];
		String auxOpcion = "";
		String auxLongitud = "";
		String auxTipo = "";
		
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
		
		/*String cadena = "ffffffffffff000625daaf730800450002400108000"
				+ "096115ffcc0a80101ffffffff00430044022c722302010600"
				+ "3e5e0ce30000000000000000c0a8016500000000000000000"
				+ "008744f362300000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "0000000000000000000000000000000000000000000000000"
				+ "00000000000000000000000638253633501020104ffffff00"
				+ "0304c0a8010106083ff04c13cc7fc6130f166e65322e636c6"
				+ "9656e74322e61747462692e636f6d003304000151803604c0"
				+ "a80101ff00000000000000000000000000000000000000000"
				+ "00000000000000000000000000000000000000000000000000000";*/
		
		String texto = cadena.replaceAll("\\s", "");
		System.out.println(texto);
		
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
			else if(i>563 && i<=569) {
				opcion53+=texto.charAt(i);
				aux53+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=569)
					opcion53+=",";
			}
			else if(i>575 && i<=593) {
				opcion61+=texto.charAt(i);
				aux61+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=593)
					opcion61+=",";
			}
			else if(i>637 && i<=661) {
				opcion55+=texto.charAt(i);
				aux55+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=661)
					opcion55+=",";
			}
			else if(i>661 && i<=665) {
				opcion51+=texto.charAt(i);
				aux51+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=665)
					opcion51+=",";
			}
			else if(i>673 && i<=677) {
				opcion54+=texto.charAt(i);
				aux54+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=679)
					opcion54+=",";
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
		
		aux= opcion53.split(",");
		auxOpcion =  aux[0];
		auxLongitud = aux[1];
		auxTipo =  aux[2];
		if(hexadecimalADecimal(auxOpcion) == 53) {
			if(hexadecimalADecimal(auxTipo) == 1) {
				opcion53 = aux53+": Opcion 0x"+auxOpcion+" = "+hexadecimalADecimal(auxOpcion)+", Longitud 0x"+auxLongitud+
						" = "+hexadecimalADecimal(auxLongitud) +" Tipo: 0x"+auxTipo+" = "+hexadecimalADecimal(auxTipo)+
						" (DHCP Discover)";
			}else {
				opcion53 = aux53+": Opcion 0x"+auxOpcion+" = "+hexadecimalADecimal(auxOpcion)+", Longitud 0x"+auxLongitud+
						" = "+hexadecimalADecimal(auxLongitud) +" Tipo: 0x"+auxTipo+" = "+hexadecimalADecimal(auxTipo)+
						" (DHCP Request)";
			}
		}
		
		aux= opcion61.split(",");
		auxOpcion =  aux[0];
		auxLongitud = aux[1];
		auxTipo =  aux[2];
		String auxMAC = opcion61.replaceAll(",", "");
		String mac = auxMAC.substring(6,18);
		if(hexadecimalADecimal(auxOpcion) == 61) {
				opcion61 = aux61+": Opcion 0x"+auxOpcion+" = "+hexadecimalADecimal(auxOpcion)+", Longitud 0x"+auxLongitud+
						" = "+hexadecimalADecimal(auxLongitud) +", Tipo de hardware Ethernet ("+auxTipo+")"+
						", Dirección MAC "+mac;
		}
		
		aux= opcion55.split(",");
		auxOpcion =  aux[0];
		auxLongitud = aux[1];
		String ms =  aux[2];
		String nd =  aux[3];
		String ro =  aux[4];
		String sd =  aux[5];
		String nsn =  aux[6];
		String tns =  aux[7];
		String ans =  aux[8];
		String prd =  aux[9];
		String sr =  aux[10];
		String psr =  aux[11];
		if(hexadecimalADecimal(auxOpcion) == 55) {
				opcion55 = "0x"+aux55+" (Opcion "+hexadecimalADecimal(auxOpcion)+", Longitud"+hexadecimalADecimal(auxLongitud)+")\n"+
						hexadecimalADecimal(ms)+": Máscara de subred\n"+
						hexadecimalADecimal(nd)+": Nombre de dominio\n"+
						hexadecimalADecimal(ro)+": Router (puerta de enlace)\n"+
						hexadecimalADecimal(sd)+": Servidor DNS\n"+
						hexadecimalADecimal(nsn)+": Nombre del servidor NetBios sobre TCP/IP\n"+
						hexadecimalADecimal(tns)+": Tipo de nodo NetBios sobre TCP/IP\n"+
						hexadecimalADecimal(ans)+": Alcance de NetBios sobre TCP/IP\n"+
						hexadecimalADecimal(prd)+": Perform Router Discover\n"+
						hexadecimalADecimal(sr)+": Static Route\n"+
						hexadecimalADecimal(psr)+": Private/Classless Static Route (Microsoft)\n";
		}
		else {
			opcion55 = " No tiene Opción 55";
		}
		
		aux= opcion51.split(",");
		auxOpcion =  aux[0];
		String auxTiempo = opcion51.replaceAll(",", "");
		if(hexadecimalADecimal(auxOpcion) == 51) {
				opcion51 = " Tiempo de consesión de la deirección IP asignada(lease time)\n0x"+
						auxTiempo+" cuatro bytes (representa el tiempo en segundos)";
		}else {
			opcion51 = " No tiene Opción 51";
		}
		
		aux= opcion54.split(",");
		auxOpcion =  aux[0];
		String auxIdentificador = opcion54.replaceAll(",", "");
		if(hexadecimalADecimal(auxOpcion) == 54) {
				opcion54 = " Identificador del Servidor DHCP\n0x"+
						auxIdentificador+" cuatro bytes dela dirección IP del servidor DHCP";
		}else {
			opcion54 = " No tiene Opción 54 "+aux54;
		}

		System.out.println("\n\nMAC Destino: " + direcciónMACdestino);
		System.out.println("\nMAC Origen: " + direcciónMACorigen);
		System.out.println("\nIP Origen: " + direcciónIPorigen);
		System.out.println("\nIP Destino: " + direcciónIPdestino);
		System.out.println("\nNúmero de puerto origen: 0x"+numeroPuertoOrigen +"  Equivale a: " + hexadecimalADecimal(numeroPuertoOrigen));
		System.out.println("\nNúmero de puerto destino: 0x"+numeroPuertoDestino +"  Equivale a: " + hexadecimalADecimal(numeroPuertoDestino));
		System.out.println("\nLongitud del segmento UDP: 0x"+longitudSegmentoUDP +"  Equivale a: " + hexadecimalADecimal(longitudSegmentoUDP));
		System.out.println("\nLongitud del mensaje DHCP: "+longitudMensajeDHCP);
		System.out.println("\nTipo de mensaje DHCP: 0x"+tipoMensajeDHCP);
		System.out.println("\nTipo de hardware de red: 0x"+tipoHardwareRed);
		System.out.println("\nTamaño de la dirección de hardware: 0x"+tamañoDirecciónHardware);
		System.out.println("\nIdentificador de la transacción: 0x"+identificadorTransacción);
		System.out.println("\nDirección IP del cliente: 0x"+direcciónIPCliente);
		System.out.println("\nSu dirección IP es: 0x"+suDirecciónIP);
		System.out.println("\nDirección hardware del cliente: 0x"+direcciónHardwareCliente);
		System.out.println("\nOpción 53: 0x"+opcion53);
		System.out.println("\nOpción 61: 0x"+opcion61);
		System.out.println("\nOpción 55: "+opcion55);
		System.out.println("\nOpción 51: "+opcion51);
		System.out.println("\nOpción 54: "+opcion54);
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
