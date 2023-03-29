import javax.swing.JOptionPane;

public class Questao2 {
	
	public static void main (String [] args) {
		
		//Declarando variáveis
		int num, fib1 = 0, fib2 = 1, fib3 = 0;
		
		//Interagindo com o usuário
		num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: "));
		
		//Calculando a sequência de Fibonacci
		while (num > fib3) {
			fib3 = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib3;
		}
		
		//Comparando o número digitado com a sequência e exibindo resultados
		if (num == fib3) {
			JOptionPane.showMessageDialog(null, "O número " + num + " pertence à sequência de Fibonacci");
		}
		
		else {
			JOptionPane.showMessageDialog(null, "O número " + num + " não pertence à sequência de Fibonacci");
		}
		
	}
}