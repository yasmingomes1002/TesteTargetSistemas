import javax.swing.JOptionPane;

public class Questao4 {
	
	public static void main (String [] args) {
		
		//Declarando variáveis
		double sp = 67836.43, rj = 36678.66, 
				mg = 29229.88, es = 27165.48, 
				outros = 19849.53, soma = 0;
		double percentSP = 0, percentRJ = 0, percentMG = 0, percentES = 0, percentOutros = 0;
		
		//Somando o faturamento
		soma = sp + rj + mg + es + outros;
		
		//Calculando percentuais
		percentSP = (sp / soma) * 100;
		percentRJ = (rj / soma) * 100;
		percentMG = (mg / soma) * 100;
		percentES = (es / soma) * 100;
		percentOutros = (outros / soma) * 100;
		
		//Exibindo resultados
		JOptionPane.showMessageDialog(null, "*Percentual de Representação*\n\n" +
		"São Paulo: " + (int)percentSP + "%\n" + 
		"Rio de Janeiro: " + (int)percentRJ + "%\n" + 
		"Minas Gerais: " + (int)percentMG + "%\n" +
		"Espírito Santo: " + (int)percentES + "%\n" +
		"Outros estados: " + (int)percentOutros + "%");
	}

}
