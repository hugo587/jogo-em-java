package br.com.jogodosanimais.interfaces;
/**
 * 
 * @author Hugo Vieira email(vieirahugo587@gmail.com)
 *
 */

/** Essa interface cont�m m�todos necess�rios para funcionamento das decis�es do jogo*/
public interface JogoInterface <P> {
	
	public void inserirAnimal(P x);

	public void perguntar(P x);

	public P getPlay();

	public void setPlay(P x);

}
