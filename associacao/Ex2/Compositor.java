/*
 * Aluno: Gustavo Ferreira dos Santos
 * Matrícula: 202201628
*/

public class Compositor {
    public String nome;
    public String pais;
    public Musica[] musicas;

    public Compositor(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public void definirMusicas(String[] titulosDasMusicas) {
        musicas = new Musica[titulosDasMusicas.length];

        for (int i = 0; i < musicas.length; i++) {
            musicas[i] = new Musica(titulosDasMusicas[i], this);
        }
    }

    public void listarMusicas() {
        System.out.println("Essas são as músicas de " + this.nome + ":");
        for (int i = 0; i < this.musicas.length; i++) {
            System.out.println("-> " + this.musicas[i].titulo);
        }
    }
}
