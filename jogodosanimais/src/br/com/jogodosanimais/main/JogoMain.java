package br.com.jogodosanimais.main;

import javax.swing.JOptionPane;

import br.com.jogodosanimais.domain.NoJogo;
import br.com.jogodosanimais.interfaces.JogoInterface;

/**
 * 
 * @author Hugo Vieira email(vieirahugo587@gmail.com)
 *
 */

public class JogoMain implements JogoInterface<NoJogo> {
	
	public static int index = 1;
	public static NoJogo ts;
	

	/**
	 * m�todo inserirAnimal, pertencente da interface. Respons�vel por capturar
	 * um valor do tipo string inserido pelo usu�rio.
	 */
	@Override
	public void inserirAnimal(NoJogo noPrim) {
		
		String animal = JOptionPane
					.showInputDialog(null, " Qual animal que voc� pensou? ");
		
		String eleFaz = JOptionPane.showInputDialog("Um(a)" + animal + "___ mas um(a)" + 
		noPrim.valor +
		"n�o");
		
		String aux = noPrim.valor;
		noPrim.valor = eleFaz;
		noPrim.noDireito = new NoJogo(++index, animal);
		noPrim.noEsquerdo = new NoJogo(++index, aux);
		
	}
	
	/**
	 * m�todo perguntar, pertencente da interface. Respons�vel por tentar advinhar 
	 * o animal que o usu�rio pensou.
	 */
	@Override
	public void perguntar(NoJogo noPrim) {
		
		int pergunta = JOptionPane.showConfirmDialog(null," O animal que voc� pensou "  +
						noPrim.valor, "Jogo dos Animais",
						JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
		
		if(pergunta == 0){
			
			if(noPrim.noDireito == null)
				JOptionPane.showMessageDialog(null, "Acertei outra vez!");
			
			else{
				
				perguntar(noPrim.noDireito);
			}
			
		}else{
			if(noPrim.noEsquerdo == null)
				inserirAnimal(noPrim);
			else{
				perguntar(noPrim.noEsquerdo);
			}
		}
		
	}
	
	/**
	 * m�todo getPlay gerado a partir da interface JogoInterface
	 */
	@Override
	public NoJogo getPlay() {
		
		return ts;
	}
	
	/**
	 * m�todo setPlay gerado a partir da interface JogoInterface
	 */
	@Override
	public void setPlay(NoJogo play) {
		
		ts = play;
		
	}
	
	public static void main(String[] args) {
		
		JogoMain main = new JogoMain();
		JOptionPane.showOptionDialog(
	            null, 
	            "Pense em um Animal", 
	            "Jogo dos Animais", 
	            JOptionPane.OK_CANCEL_OPTION, 
	            JOptionPane.QUESTION_MESSAGE, 
	            null, null, null
	        );
		//Observa se o conjunto est� vazio para ser inicializado
		if(main.getPlay() == null){
			main.setPlay(new NoJogo(index, " Vive na �gua? "));
			main.getPlay().noEsquerdo = new NoJogo(++index, " � o Macaco ");
			main.getPlay().noDireito = new NoJogo(++index, " � o Tubar�o ");
		}
		
		int sair = 1;
		 
		
		do{
			int resposta = JOptionPane.showConfirmDialog(null, " O animal que voc� pensou " + 
			main.getPlay().valor, "Jogo dos Animais", JOptionPane.YES_OPTION, 
			JOptionPane.QUESTION_MESSAGE);
			
			if(resposta == 0){
				main.perguntar(main.getPlay().noDireito);
			} else{
				main.perguntar(main.getPlay().noEsquerdo);
			}
			if(resposta == JOptionPane.CLOSED_OPTION){
				sair = 0;
			}
		} while(sair == 1);
		
	}

}
