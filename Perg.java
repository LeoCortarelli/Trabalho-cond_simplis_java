package Trabalho;

import java.util.Scanner;

public class Perg {

	public static void main(String[] args) {
		
		double aulas;
		double porc_aulas;
		double faltas;
		char scrLetra;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de aulas: ");
		aulas = ler.nextDouble();
		
		System.out.println("Informe o numero de faltas: ");
		faltas = ler.nextDouble();
		
		ler.nextLine();
		
		porc_aulas = aulas * 0.75;
		
		if (faltas >= porc_aulas) {
			System.out.println("REPROVADO");
			System.out.println("Deseja realizar a matrícula para o próximo semestre (S)sim (N)não: ");
			scrLetra = ler.nextLine().charAt(0);
				if(scrLetra == 's') {
					System.out.println("A matrícula deverá ser realizada até o dia 10");
				}
				else{
				System.out.println("Sua matrícula será trancada");
				}
		}
		else{
			System.out.println("Aprovado");
		}

	}

}
