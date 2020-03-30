package br.com.jogodosanimais.interfaces;
/**
 * 
 * @author Hugo Vieira email(vieirahugo587@gmail.com)
 *
 */

/** Essa interface contêm métodos necessários para funcionamento das decisões do jogo*/
public interface JogoInterface <P> {
	
	public void inserirAnimal(P x);

	public void perguntar(P x);

	public P getPlay();

	public void setPlay(P x);

}
