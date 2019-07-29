package br.com.izl.service;

import java.util.ArrayList;
import java.util.List;

import br.com.izl.model.Usuario;

public class usuarioService {
	
	private static List<Usuario> usuarios = new ArrayList<>();
	
	
	//metodo cadastrar
	public void cadastrar(Usuario usuario) {
		
		usuarios.add(usuario);
	}
	
	
	//metodo pegar todos usuarios
	public List<Usuario> getTodosUsuarios(){
		return usuarios;
	}
	
	//metodo excluir
	public void excluir(int indice) {
		
		usuarios.remove(indice);
	}
	

	
}