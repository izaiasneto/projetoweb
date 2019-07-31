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
	
	public List<Usuario> getAtivos(){
		
		List<Usuario> ativos = new ArrayList<>();
	
		for (Usuario usuario : usuarios) {
			
			if( usuario.getStatus().equals("ativo")) {
				ativos.add(usuario);
			}
			
		}
		
		return ativos;
	
	}
	
	public List<Usuario> getInativos(){
		
		List<Usuario> inativos = new ArrayList<>();
		
		for (Usuario usuario : usuarios) {
			
			if( usuario.getStatus().equals("inativo")) {
				inativos.add(usuario);
			}
			
		}
		
		return inativos;
		
		
	}
	
}