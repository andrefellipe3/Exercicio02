package com.ti2cc;
import java.util.Scanner;

public class Principal {
	
	public static void parar()
	{
		
	}
	
	//Mostrar a lista de usuarios no DB
	public static void listar ()
	{
		DAO dao = new DAO();
		dao.conectar();
		//Mostrar usuarios atualizados
				System.out.println("==== Mostrar usuarios === ");
				Usuario[] usuarios = dao.getUsuarios();
				for(int i = 0; i < usuarios.length; i++) {
					System.out.println(usuarios[i].toString());
				}
				dao.close();
	}
	
	//Inserir um usuario no DB
	public static void inserir ()
	{
		DAO dao = new DAO();
		dao.conectar();
		//Inserir um elemento na tabela
				Usuario usuario = new Usuario(16, "shrek",19,'M',"ator");
				if(dao.inserirUsuario(usuario) == true) {
					System.out.println("Insercao com sucesso -> " + usuario.toString());
				}		
				dao.close();
	}
	
	//Excluir um usuario no DB
		public static void excluir ()
		{
			int n;
			Scanner ler = new Scanner(System.in);
			DAO dao = new DAO();
			dao.conectar();
			System.out.printf("Informe o ID do usuario que deseja excluir:\n");
			n = ler.nextInt();
			//Excluir usuario
			dao.excluirUsuario(n);	
					dao.close();
					System.out.println("Usuario Excluido!");
		}
		
		//Atualizar a idade no DB
				public static void atualizar ()
				{
					DAO dao = new DAO();
					dao.conectar();
					Usuario usuario = new Usuario(17, "Teste",59,'M',"Testador");
					usuario.setIdade(55);
					dao.atualizarUsuario(usuario);
						
							dao.close();
							System.out.println("Atualizado!");
				}
	
	
	
	
	public static void main(String[] args) {
		int numero = 0;
		Scanner ler = new Scanner(System.in);
		do {
		System.out.println(" ");
		System.out.println("0 - Listar");
		System.out.println("1 - Inserir");
		System.out.println("2 - Excluir");
		System.out.println("3 - Atualizar");
		System.out.println("4 - Sair");
		System.out.println(" ");
		System.out.print("Escolha uma opçao: ");
		numero = ler.nextInt();
		
		switch (numero)
	      {
	         case 0:
	            listar();
	            break;
	         case 1:
	            inserir();
	            break;
	         case 2:
	            excluir();
	            break;
	         case 3:
	            atualizar();
	            break;
	         case 4:
	        	 parar();
	        	 System.out.println("FIM");
	        	 break;
	         default:
	            System.out.println( "ERRO: Valor invalido." );
	      } // fim escolher
	   }
	   while ( numero != 4 );


		
	}
		
		
}
