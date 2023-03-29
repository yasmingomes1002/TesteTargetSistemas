import javax.swing.JOptionPane;

public class Questao5 {
	
	public static void main (String [] args) {
		
		//Declarando variáveis
		String nome = "", nomeInverso = "";
		
		//Recebendo String do usuário
		nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");
		
		//Invertendo a String
		for(int i = nome.length() - 1; i >= 0; i--) {
			nomeInverso += nome.charAt(i);
		}
		
		//Exibindo resultados
		JOptionPane.showMessageDialog(null, "O inverso de " + nome + " é: " + nomeInverso);
	}

}
