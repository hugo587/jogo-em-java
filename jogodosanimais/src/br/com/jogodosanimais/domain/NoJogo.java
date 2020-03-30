package br.com.jogodosanimais.domain;

/**
 * 
 * @author Hugo Vieira email(vieirahugo587@gmail.com)
 *
 */

/** Essa classe é o nó onde orienta a direção das decisões*/

public class NoJogo {
	
	public int unidade;
	public NoJogo noEsquerdo;
	public NoJogo noDireito;
	public String valor;
	
	
	/** método construtor onde seta os valores necessários */
	public NoJogo(int unidade, String valor){
		this.unidade = unidade;
		this.valor = valor;
	}
	
	public NoJogo(){
		
	}

}
