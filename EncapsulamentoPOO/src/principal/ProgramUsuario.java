package principal;

import java.util.Scanner;

import entities.Usuario;

public class ProgramUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lendo = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		System.out.println("Digite o seu nome:");
		usuario.setNome(lendo.next());
		
		System.out.println("Digite o seu email:");
		usuario.setEmail(lendo.next());
		
		System.out.println("Digite a sua senha:");
		usuario.setSenha(lendo.next());
		
		
		
		lendo.close();
		
		usuario.exibirDados();
		
		
		usuario.mudarSenha("bernardo123");// metodo para mudar a senha
		
		
		//System.out.println(usuario.getSenha); não funciona

	}

}
