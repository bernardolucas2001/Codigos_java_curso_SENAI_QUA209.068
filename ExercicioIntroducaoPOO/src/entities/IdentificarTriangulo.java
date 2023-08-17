package entities;

public class IdentificarTriangulo {
	//Faça um programa que receba 3 valores e indique/retorne que tipo de triangulo ele pode ser;
	
	public double medida1;
	public double medida2;
	public double medida3;
	
	
	public String identificacaoTriangulo() {
		String resultado;
		if(medida1 == medida2 && medida2 == medida3) {
			  resultado = "Triângulo equilátero. ";
		} else if(medida1 == medida2 || medida2 == medida3 || medida1 == medida3) {
			 resultado ="Triângulo isósceles. ";
		} else {
			 resultado ="Triângulo escaleno. ";
		}
		return resultado;
		
	}
	

} 
