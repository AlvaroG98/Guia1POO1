/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1poo1;

/**
 *
 * @author GUILLERMO
 */
import javax.swing.JOptionPane;
public class Comparacion {
/**
* @param args the command line arguments
*/
public static void main(String[] args) {
// TODO code application logic here
String primernumero;
String segundonumero;
String resultado;
int numero1;
int numero2;
primernumero = JOptionPane.showInputDialog("Escriba el primer entero:");
segundonumero = JOptionPane.showInputDialog("Escriba el Segundo Entero:");
numero1= Integer.parseInt(primernumero);
numero2 = Integer.parseInt(segundonumero);
resultado= "";
if (numero1==numero2) {
resultado= resultado + numero1 + " == " + numero2;
}
if (numero1 != numero2) {
resultado= resultado + numero1 + " != " + numero2;
}
if (numero1 < numero2) {
resultado= resultado + "\n" + numero1 + " < " + numero2;
}
if (numero1 > numero2) {
resultado= resultado + "\n" + numero1 + " > " + numero2;
}
if (numero1 <= numero2) {
resultado= resultado + "\n" + numero1 + " <=" + numero2;
}
if (numero1 > numero2) {
resultado= resultado + "\n" + numero1 + " >= " + numero2;
}
JOptionPane.showConfirmDialog(null, resultado,"Resultado de la comparación",JOptionPane.INFORMATION_MESSAGE);
System.exit(0);
}
}