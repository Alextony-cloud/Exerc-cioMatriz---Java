package principal;

import java.util.Arrays;
import java.util.Scanner;

public class GerenciadorMediaTurma {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int qtdAlunos, qtdNotas;
		int totalNotas = 0;

		System.out.println("--------------------M�DIA DA TURMA--------------------");

		System.out.print("quantos alunos tem na turma: ");
		qtdAlunos = ler.nextInt();

		System.out.print("quantas notas cada aluno tem: ");
		qtdNotas = ler.nextInt();

		double[][] notasDaTurma = new double[qtdAlunos][qtdNotas];

		for (int a = 0; a < notasDaTurma.length; a++) {
			for (int n = 0; n < notasDaTurma[a].length; n++) {
				System.out.print("Digite a " + (n + 1) + "� nota do aluno n�mero " + (a + 1) + ":\n");
				notasDaTurma[a][n] = ler.nextDouble();
				totalNotas += notasDaTurma[a][n];
			}

		}

		double media = totalNotas / (qtdAlunos * qtdNotas);
		System.out.println("\nA m�dia da turma � " + media);

		for (double[] notasDoAluno : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
			ler.close();
		}
	}

}
