package com.laliga.models;

/**
 * Representação do Contato.
 * 
 * @author paulo
 *
 */
public class Contato {
	
	/**
	 * Nome do contato.
	 */
	private String nome;
	
	/**
	 * Telefone do contato.
	 */
	private String telefone;
	
	/**
	 * Gera uma nova instancia de Contato com o nome e o telefone.
	 * 
	 * @param nome Nome do contato.
	 * @param telefone Telefone do contato.
	 */
	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}
	
	/**
	 * Retorna o nome do Contato.
	 * 
	 * @return o nome do Contato
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * Retorna o telefone do Contato.
	 * 
	 * @return o telefone do Contato
	 */
	public String getTelefone() {
		return this.telefone;
	}
	
}
