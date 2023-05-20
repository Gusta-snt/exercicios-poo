/*
	Aluno: Gustavo Ferreira dos Santos
	Matrícula: 202201628
*/

import java.util.Scanner;

public class TesteCursos {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Curso[] cursos = new Curso[4];

        String nome, codigo;
        double notaCorte;
        int mesesDuracao, i;

        System.out.println("----- Universidade Federal de Goiás -----");

        for(i = 0; i < cursos.length; i++){
            if(i != 0){
                System.out.println("--------------------------------------------");
            }

            System.out.print("Digite o nome do curso: ");
            nome = scanner.nextLine();
            System.out.print("Digite o código do curso: ");
            codigo = scanner.nextLine();
            System.out.print("Digite a nota de corte do curso: ");
            notaCorte = scanner.nextDouble();
            System.out.print("Digite a duração do curso (meses): ");
            mesesDuracao = scanner.nextInt();

            cursos[i] = new Curso(nome, codigo, notaCorte, mesesDuracao);
            scanner.nextLine();
        }

        System.out.print(">>\n");

        for(i = 0; i < cursos.length; i++){
            System.out.printf("\nCurso %d ====================================\n\n", i + 1);

            System.out.println("Nome: " + cursos[i].nome);
            System.out.println("Código: " + cursos[i].codigo);
            System.out.println("Nota de corte: " + cursos[i].notaCorte);
            System.out.println("Duração: " + cursos[i].mesesDuracao + " meses");
        }

        scanner.close();
    }
}
