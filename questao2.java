package atividade23_11;

import java.util.Scanner;

public class questao2 {

	public static void main(String[] args) {
	
		int matriz[][] = new int[10][3];
		int piorNota1 = 0, piorNota2 = 0, piorNota3 = 0,piorNota3e2Iguais = 0, piorNota2e1Iguais = 0, piorNota1e3Iguais = 0;
		
		Scanner teclado = new Scanner (System.in);
		
		for (int c = 0;c < 3;c++) {
			
			for (int l = 0; l < 10;l++) {
				
				if(c == 0) {
					
					System.out.print("\nInsira a nota da prova 1 do aluno " + l + ": ");
					matriz[l][c] = teclado.nextInt();
					
				}
				else if(c == 1) {
					
					System.out.print("\nInsira a nota da prova 2 do aluno " + l + ": ");
					matriz[l][c] = teclado.nextInt();
					
				}
				else if(c == 2) {
					
					System.out.print("\nInsira a nota da prova 3 do aluno " + l + ": ");
					matriz[l][c] = teclado.nextInt();
					
					if(matriz[l][c] < matriz[l][c-1] && matriz[l][c] < matriz[l][c-2] ) {
						
						piorNota3++;
					}
					else if(matriz[l][c-1] < matriz[l][c] && matriz[l][c-1] < matriz[l][c-2]) {
						
						piorNota2++;
					}
					else if(matriz[l][c-2] < matriz[l][c] && matriz[l][c-2] < matriz[l][c-1]) {
						
						piorNota3++;
					}
					else if(matriz[l][c] == matriz[l][c-1] && matriz[l][c] < matriz[l][c-2]) {
						
						piorNota3e2Iguais++;
					}
					else if(matriz[l][c-1] == matriz[l][c-2] && matriz[l][c] < matriz[l][c-2]) {
						
						piorNota2e1Iguais++;
					}
					else {
						
						piorNota1e3Iguais++;
					}
				}
				
			}
		}
		System.out.print("\nA quantia de alunos que a pior nota foi na prova 1 é: " + piorNota1);
		System.out.print("\n\nA quantia de alunos que a pior nota foi na prova 2 é: " + piorNota2);
		System.out.print("\n\nA quantia de alunos que a pior nota foi na prova 3 é: " + piorNota3);
		
		System.out.print("\n\nA quantia de alunos que a pior nota foi na prova 1 e 3 é: " + piorNota1e3Iguais);
		System.out.print("\n\nA quantia de alunos que a pior nota foi na prova 2 e 3 é: " + piorNota3e2Iguais);
		System.out.print("\n\nA quantia de alunos que a pior nota foi na prova 1 e 2 é: " + piorNota2e1Iguais);
	}

}
