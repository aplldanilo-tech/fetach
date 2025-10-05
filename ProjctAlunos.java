import java.util.Scanner;
import java.lang.System;
import java.util.Arrays;
public class ProjctAlunos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        packageAlunos al = new packageAlunos();
        double usuario;
        System.out.println("Digite O Valor Total Das  Avaliaçoeis Ou Apenas  De uma ");
        al.professor = sc.nextDouble();
        al.valorDasAvaliaçoeis = new double[]{al.professor};
        if (al.professor < al.getNotasDosAlunos()) {
            for (int i = 0; i < al.professor; i++) {
                System.out.println("Prova Avaliada em : \n" + al.professor + " Questoeis \n Digite O Valor Que Voçe Atribuiu Para As Avaliacoeis ");

                for (int j = 0; j < al.professor; j++) {
                    usuario = sc.nextDouble();
                    System.out.println("Pontos Em Cada Questao  " + usuario / al.professor);
                    // aqui considerar a divisao que pode ser tanto pela quantidade de provas ou por pontos das questoeis//

                    for (int l = 0; l < usuario; l++) {
                        System.out.println("Digite O Nome Do Aluno");
                        al.alunos = new String[]{sc.nextLine()};
                        System.out.println(Arrays.toString(al.alunos) + " Suas Notas Nas Avalicoei(s) Pode Ter sido Em uma ou Mais Avaliaçoeis :"
                                + al.professor + " \n Quantidade De Avaliaçoeis Que Forao Realizadas: " + usuario);

                    }
                }return;
            }
        } else System.out.println("Voçe Digitou Um Valor Acima Do Permitido Valor Permitido " + al.getNotasDosAlunos());
    }
}
