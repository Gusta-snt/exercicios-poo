/*
 * Aluno: Gustavo Ferreira dos Santos
 * Matrícula: 202201628
*/

public class Musica {
    public String titulo;
    public Compositor compositor;

    public Musica(String nome, Compositor compositor) {
        this.titulo = nome;
        this.compositor = compositor;
    }

    public void mostrarCompositor() {
        System.out.println("O compositor da música " + this.titulo + " é o " + this.compositor.nome);
    }
}
