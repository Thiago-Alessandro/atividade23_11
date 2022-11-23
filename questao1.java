package atividade23_11;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		int matriz[][] = new int [5][4];
		int maiorNotaFinal = 0, somaNotaFinal = 0, mediaNotaFinal = 0, matriculaMaiorNotafinal = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0;c < 4;c++) {
			
			for (int l = 0; l < 5;l++) {
				
				if(c==0) {
					
					System.out.print("Insira o número da matricula do aluno: ");
					matriz[l][c] = teclado.nextInt();
				}
				else if(c==1) {
					
					System.out.print("Digite a média das provas do aluno: ");
					matriz[l][c] = teclado.nextInt();
				}
				else if (c==2) {
					
					System.out.print("Digite a média dos trabalhos do aluno");
					matriz[l][c] = teclado.nextInt();
				}
				else if(c==3) {
					
					matriz[l][c] = (matriz[l][c-1]+matriz[l][c-2])/2;
					somaNotaFinal += matriz[l][c];
					
					if(matriz[l][c] > maiorNotaFinal) {
						
						maiorNotaFinal = matriz[l][c];
						matriculaMaiorNotafinal = matriz[l][c-3];
					}
					
				}
				
			}
		}
		mediaNotaFinal = somaNotaFinal/5;
		
		System.out.print("\nA matricula do aluno que obteve a maior nota final é: " + matriculaMaiorNotafinal);
		System.out.print("\nA nota final mais alta é: " + maiorNotaFinal);
		System.out.print("\n\nA média das notas finais é: " + mediaNotaFinal);
	}

}
