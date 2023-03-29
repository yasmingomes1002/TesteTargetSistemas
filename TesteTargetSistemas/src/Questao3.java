import javax.swing.JOptionPane;

public class Questao3 {
	
	//Função para calcular a média mensal de faturamento
	public static double calculaMedia(double vet[]) {
		
		//Declarando as variáveis
		double soma=0, media=0;
		
		//Percorrendo o vetor
		for (int i=0; i<30; i++) {
			
			//Calculando a soma dos faturamentos
			if(vet[i] != 0.0) {
			soma += vet[i];
			}
		}
		
		//Calculando a média mensal de faturamento
		media = soma / 21;
		
		return media;
	}
	
	//Função para comparar valores
	public static void comparaNum(double vet[], double med) {
		
		//Declarando as variáveis
		double menor=0, maior=0;
		int cont=0;
		
		//Percorrendo o vetor
		for (int i=0; i<30; i++) {
			
			//Armazenando o primeiro valor na variável menor
			if (i==0) {
				menor = vet[0];
			}
			
			//Comparando os valores do vetor entre si
			if (vet[i] != 0.0) {
			menor = Math.min(vet[i], menor);
			maior = Math.max(vet[i], maior);
			}
			
			//Comparando os valores do vetor com a média mensal
			if(vet[i] > med) {
			cont++;
			}
		}
		
		//Exibindo resultados
		JOptionPane.showMessageDialog(null, "Menor faturamento: " + menor + 
				"\nMaior faturamento: " + maior + 
				"\nMédia mensal: " + med + 
				"\n\nO faturamento diário superou a média mensal em " + cont + " dias.");
	}
	
	
	
	public static void main (String [] args) {
		
		//Declarando as variáveis
		
		double [] fat = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612,
				0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838,
				2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 
				18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 
				13220.495, 8414.61};
		double med=0;
		
		//Chamando a função para calcular a média passando o vetor de faturamento
		med = calculaMedia(fat);
		
		////Chamando a função para comparar os valores passando o vetor de faturamento e a média obtida pela função anterior
		comparaNum(fat, med);
		
	}
}