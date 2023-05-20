/*
 * Aluno: Gustavo Ferreira dos Santos
 * Matrícula: 202201628
*/

public class Compositor {
    private String nome;
    private String pais;
    private Musica[] musicas;
    private static int totalCompositores;

    public Compositor(String nome, String pais) {
        this.nome = nome;
        this.pais = pais;
        Compositor.totalCompositores++;
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
            System.out.println("-> " + this.musicas[i].getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public static int getTotalCompositores() {
        return Compositor.totalCompositores;
    }
}
