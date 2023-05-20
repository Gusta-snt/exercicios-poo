/*
 * Aluno: Gustavo Ferreira dos Santos
 * Matrícula: 202201628
*/

public class Musica {
    private String titulo;
    private Compositor compositor;

    public Musica(String nome, Compositor compositor) {
        this.titulo = nome;
        this.compositor = compositor;
    }

    public void mostrarCompositor() {
        System.out.println("O compositor da música " + this.titulo + " é o " + this.compositor.getNome());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public void setCompositor(Compositor compositor) {
        this.compositor = compositor;
    }
}
