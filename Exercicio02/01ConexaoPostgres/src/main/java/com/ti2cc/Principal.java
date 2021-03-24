package com.ti2cc;

public class Principal {
	
	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		dao.conectar();

		
		//Inserir um elemento na tabela
		Usuario usuario = new Usuario(11, "pablo",32,'M',"Porteiro");
		if(dao.inserirUsuario(usuario) == true) {
			System.out.println("Insercao com sucesso -> " + usuario.toString());
		}
		
		//Mostrar usuario do sexo masculino		
		System.out.println("==== Mostrar usuarios do sexo masculino === ");
		Usuario[] usuarios = dao.getUsuariosMasculinos();
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}

		//Atualizar usuario
		usuario.setIdade(13);
		dao.atualizarUsuario(usuario);

		//Mostrar usuarios do sexo masculino
		System.out.println("==== Mostrar usuarios === ");
		usuarios = dao.getUsuarios();
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
		//Excluir usuario
		dao.excluirUsuario(usuario.getNumero());
		
		//Mostrar usuario
		usuarios = dao.getUsuarios();
		System.out.println("==== Mostrar usuario === ");		
		for(int i = 0; i < usuarios.length; i++) {
			System.out.println(usuarios[i].toString());
		}
		
		dao.close();
	}
}
