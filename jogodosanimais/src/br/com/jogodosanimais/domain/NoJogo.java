package br.com.jogodosanimais.domain;

/**
 * 
 * @author Hugo Vieira email(vieirahugo587@gmail.com)
 *
 */

/** Essa classe � o n� onde orienta a dire��o das decis�es*/

public class NoJogo {
	
	public int unidade;
	public NoJogo noEsquerdo;
	public NoJogo noDireito;
	public String valor;
	
	
	/** m�todo construtor onde seta os valores necess�rios */
	public NoJogo(int unidade, String valor){
		this.unidade = unidade;
		this.valor = valor;
	}
	
	public NoJogo(){
		
	}

}
