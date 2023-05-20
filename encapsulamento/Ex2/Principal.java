/*
 * Aluno: Gustavo Ferreira dos Santos
 * Matrícula: 202201628
*/

public class Principal {
    public static void main(String[] args){
        Compositor c1 = new Compositor("Jotapê", "Brasil");
        String[] musicasC1 = { "Duas mandraka", "Ponta laranja" };

        c1.definirMusicas(musicasC1);

        Compositor c2 = new Compositor("Sidoka", "Brasil");
        String[] musicasC2 = { "Não me sinto mal mais", "07", "Lui'v" };

        c2.definirMusicas(musicasC2);

        c1.listarMusicas();
        System.out.println("------------------------------");
        c2.listarMusicas();
        System.out.println("------------------------------");
        System.out.println("Atualmente, existem " + Compositor.getTotalCompositores() + " compositores.");
    }
}
