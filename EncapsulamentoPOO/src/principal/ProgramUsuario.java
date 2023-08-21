package principal;

import java.util.Scanner;

import entities.Usuario;

public class ProgramUsuario {

	public static void main(String[] args) {
		//crie um programa que receba o nome, o e-mail e a senha do usuário,
		//o usuário só poderá alterar a senha através de um método e
		//a senha não pode ser mostrada na tela principal do programa;
		
		
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
