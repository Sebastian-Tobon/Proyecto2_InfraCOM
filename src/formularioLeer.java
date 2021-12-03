
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 * 2 Proyecto de Infraestructura Computacional 
 *
 * @author Sebastian Tobon Alcaraz
 * @author Sebastian Londoño Valencia
 * @author Rodrigo Acosta Restrepo
 */
public class formularioLeer extends javax.swing.JFrame {

    /**
     * Creates new form formularioLeer
     */
    public formularioLeer() {
        initComponents();
        txaArchivo.setLineWrap(true);this.getContentPane().setBackground(Color.LIGHT_GRAY);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaArchivo = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaRes = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnEnviar = new javax.swing.JButton();
        jtTexto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("PROTOCOLO DHCP");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Seleccionar Archivo:");

        btnSel.setText("Seleccionar");
        btnSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelActionPerformed(evt);
            }
        });

        txaArchivo.setBackground(new java.awt.Color(204, 255, 255));
        txaArchivo.setColumns(20);
        txaArchivo.setRows(5);
        jScrollPane1.setViewportView(txaArchivo);

        txaRes.setBackground(new java.awt.Color(204, 255, 255));
        txaRes.setColumns(20);
        txaRes.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        txaRes.setRows(5);
        jScrollPane2.setViewportView(txaRes);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Mensaje DHCP");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Contenido del Frame Ethernet");

        btnEnviar.setText("Enviar");
        btnEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnviarActionPerformed(evt);
            }
        });

        jtTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtTextoActionPerformed(evt);
            }
        });
        jtTexto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTextoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 308, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addComponent(btnSel, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTexto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEnviar)
                    .addComponent(btnSel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 523, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void protocoloDHCP(String tex){
        
        //Variables 
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
        
    //Eliminar los espacio y saltos de linea del texto 
                String texto = tex.replaceAll("\\s", "");
        
                //--- Recorrer el texto---
                //Dirección MAC destino
                for(int i=0; i<texto.length();i++) {
			if(i<=11) {
				direcciónMACdestino+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=11)
					direcciónMACdestino+=" - ";
			}
                        //Dirección MAC origen
			else if(i>11 && i<=23) {
				direcciónMACorigen+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=23)
					direcciónMACorigen+=" - ";
			}
                        //Dirección IP origen
			else if(i>51 && i<=59) {
				direcciónIPorigen+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=59)
					direcciónIPorigen+=",";
			}
                        //Dirección IP destino
			else if(i>59 && i<=67) {
				direcciónIPdestino+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=67)
					direcciónIPdestino+=",";
			}
                        //Número de puerto origen
			else if(i>67 && i<=71) {
				numeroPuertoOrigen+=texto.charAt(i);
			}
                         //Número de puerto destino
			else if(i>71 && i<=75) {
				numeroPuertoDestino+=texto.charAt(i);
			}
                        //Longitud del segmento UDP
			else if(i>75 && i<=79) {
				longitudSegmentoUDP+=texto.charAt(i);
			}
                        //Tipo de mensaje DHCP
			else if(i>83 && i<=85) {
				tipoMensajeDHCP+=texto.charAt(i);
			}
                        //Tipo de Hardware de Red
			else if(i>85 && i<=87) {
				tipoHardwareRed+=texto.charAt(i);
			}
                        //Tamaño de la dirección del Hardware
			else if(i>87 && i<=89) {
				tamañoDirecciónHardware+=texto.charAt(i);
			}
                        //Identificador de Transacción
			else if(i>91 && i<=99) {
				identificadorTransacción+=texto.charAt(i);
			}
                        //Dirección IP del Cliente
			else if(i>107 && i<=115) {
				direcciónIPCliente+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=115)
					direcciónIPCliente+=",";
			}
                        //Su Dirección IP 
			else if(i>115 && i<=123) {
				suDirecciónIP+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=123)
					suDirecciónIP+=",";
			}
                        //Dirección Hardware del Cliente
			else if(i>139 && i<=171) {
				direcciónHardwareCliente+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=171)
					direcciónHardwareCliente+=" - ";
			}
                        //Opción 53
			else if(i>563 && i<=569) {
				opcion53+=texto.charAt(i);
				aux53+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=569)
					opcion53+=",";
			}
                        //Opción 61
			else if(i>575 && i<=593) {
				opcion61+=texto.charAt(i);
				aux61+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=593)
					opcion61+=",";
			}
                        //Opción 55, 1, 3 y 6
			else if(i>637 && i<=661) {
				opcion55+=texto.charAt(i);
				aux55+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=661)
					opcion55+=",";
			}
                        //Opción 51
			else if(i>661 && i<=665) {
				opcion51+=texto.charAt(i);
				aux51+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=665)
					opcion51+=",";
			}
                        //Opción 54
			else if(i>673 && i<=677) {
				opcion54+=texto.charAt(i);
				aux54+=texto.charAt(i);
				if(i%2==1 && i!=0 && i!=679)
					opcion54+=",";
			}
			
		}
                //--- FIN Recorrido del texto ---
		
                // conversión de hex a dec y validaciones
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
			tipoMensajeDHCP = "02 = 2 Mensaje de Respuesta";
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
		}else{
                    opcion61 = aux61+" No tiene opción 61";
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
				opcion55 = "0x"+aux55+" (Opcion "+hexadecimalADecimal(auxOpcion)+", Longitud "+hexadecimalADecimal(auxLongitud)+")\n"+
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
			opcion55 = "0x"+aux55+" No tiene Opción 55, 1, 3 y 6";
		}
		
		aux= opcion51.split(",");
		auxOpcion =  aux[0];
		String auxTiempo = opcion51.replaceAll(",", "");
		if(hexadecimalADecimal(auxOpcion) == 51) {
				opcion51 = " Tiempo de conexión de la deirección IP asignada(lease time)\n0x"+
						auxTiempo+" cuatro bytes (representa el tiempo en segundos)";
		}else {
			opcion51 = "0x"+aux51+" No tiene Opción 51";
		}
		
		aux= opcion54.split(",");
		auxOpcion =  aux[0];
		String auxIdentificador = opcion54.replaceAll(",", "");
		if(hexadecimalADecimal(auxOpcion) == 54) {
				opcion54 = " Identificador del Servidor DHCP\n0x"+
						auxIdentificador+" cuatro bytes dela dirección IP del servidor DHCP";
		}else {
			opcion54 = "0x"+aux54+" No tiene Opción 54 ";
		}
                //--- FIN Conversiones y Vaidaciones ----
                
                //--- Area de Texto Resultado ----
                txaRes.setText("MAC Destino:"+direcciónMACdestino+"\n\nMAC Origen:"+direcciónMACorigen+"\n\nIP Origen: " + direcciónIPorigen+
                        "\n\nIP Destino: " + direcciónIPdestino+"\n\nNúmero de puerto origen: 0x"+numeroPuertoOrigen +"  Equivale a: " + hexadecimalADecimal(numeroPuertoOrigen)+
                        "\n\nNúmero de puerto destino: 0x"+numeroPuertoDestino +"  Equivale a: " + hexadecimalADecimal(numeroPuertoDestino)+
                        "\n\nLongitud del segmento UDP: 0x"+longitudSegmentoUDP +"  Equivale a: " + hexadecimalADecimal(longitudSegmentoUDP)+
                        "\n\nLongitud del mensaje DHCP: "+longitudMensajeDHCP+"\n\nTipo de mensaje DHCP: 0x"+tipoMensajeDHCP+"\n\nTipo de hardware de red: 0x"+tipoHardwareRed+
                        "\n\nTamaño de la dirección de hardware: 0x"+tamañoDirecciónHardware+" La dirección de hardware ocupa 6 bytes." +
                        "\n\nIdentificador de la transacción: 0x"+identificadorTransacción+"\n\nDirección IP del cliente: 0x"+direcciónIPCliente+
                        "\n\nSu dirección IP es: 0x"+suDirecciónIP+"\n\nDirección hardware del cliente: 0x"+direcciónHardwareCliente+"\n\nOpción 53: 0x"+opcion53+
                        "\n\nOpción 61: 0x"+opcion61+"\n\nOpción 55: "+opcion55+"\n\nOpción 51: "+opcion51+"\n\nOpción 54: "+opcion54);
                //--- FIN ---
                
                //--- sout de pruebas
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
    //Metodo que lee un archivo seleccionado de la PC
    public void leearArchivo() {
        
        String tex = "";
        JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        File archivo = fc.getSelectedFile();
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            while (((linea = br.readLine()) != null)) {
                tex += linea + "\n";
            }
            txaArchivo.setText(tex);
            JOptionPane.showMessageDialog(null, "Archivo leido Correctamente");
            protocoloDHCP(tex);
        } catch (Exception e) {

        }     
    }
    
    //Metodo para tomar un caracter y verificar si pértence a hexadecimal
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

        //Metodo que realiza la conversión de hexadecial a decinmal
	public static long hexadecimalADecimal(String hexadecimal) {
		long decimal = 0;
		// Saber en cuál posición de la cadena (de izquierda a derecha) vamos
		int potencia = 0;
		// Recorrer la cadena de derecha a izquierda
			for (int x = hexadecimal.length() - 1; x >= 0; x--) {
				int valor = caracterHexadecimalADecimal(hexadecimal.charAt(x));
				long elevado = (long) Math.pow(16, potencia) * valor;
				decimal += elevado;
				// Avanzar en la potencia
				potencia++;
			}
		return decimal;
	}
        
        public void tomarTexto(String msj){
            String rMsj = msj;
            txaArchivo.setText(rMsj);
            protocoloDHCP(rMsj);
        }
        
    private void btnSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelActionPerformed
        // TODO add your handling code here:
       leearArchivo();
    }//GEN-LAST:event_btnSelActionPerformed

    private void btnEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnviarActionPerformed
        if (jtTexto.getText().length() > 0) {
            tomarTexto(jtTexto.getText());
        } else {
        }
    }//GEN-LAST:event_btnEnviarActionPerformed

    private void jtTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtTextoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtTextoActionPerformed

    private void jtTextoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTextoKeyTyped
        if (jtTexto.getText().length() > 2000) {
            evt.consume();
        }
    }//GEN-LAST:event_jtTextoKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formularioLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formularioLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formularioLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formularioLeer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formularioLeer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnviar;
    private javax.swing.JButton btnSel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jtTexto;
    private javax.swing.JTextArea txaArchivo;
    private javax.swing.JTextArea txaRes;
    // End of variables declaration//GEN-END:variables
}
