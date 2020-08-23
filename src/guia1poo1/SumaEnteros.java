/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1poo1;

import javax.swing.JOptionPane;// Paquete de Java
public class SumaEnteros {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
String primernumero;
String segundonumero;
int numero1;
int numero2;
int suma;
primernumero = JOptionPane.showInputDialog("Digite el primer numero");
segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
numero1 = Integer.parseInt(primernumero);
numero2 = Integer.parseInt(segundonumero);
suma = numero1 + numero2;
JOptionPane.showMessageDialog(null, "La suma es: " +
suma,"Resultado",JOptionPane.PLAIN_MESSAGE);
System.exit(0);
}
}