package entities;

public class EquacaoSegundoGrau {
	// Faça um programa que receba os números de uma equação do segundo grau, retorne o valor de xI, e xII;
	public double numero1;
	public double numero2;
	public double numero3;
	public double bhaskara;

 public double calcularBhaskara() {
	 
	 bhaskara =(Math.pow(numero2, 2)-(4*numero1)*numero3);
	 return Math.sqrt(bhaskara);
 }
	
 public double calcularX1() {
	return ((-numero2)+ calcularBhaskara())/(2*numero1);
 } 
 public double calcularX2() {
		return ((-numero2)- calcularBhaskara())/(2*numero1);
	 } 
 
 
}