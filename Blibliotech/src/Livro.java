import java.util.Date;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;
    private Integer anopubli;
    private Integer isbn;

    public Livro(String titulo, String autor, String editora, Integer anopubli, Integer isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
        this.anopubli = anopubli;
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getAnopubli() {
        return anopubli;
    }

    public void setAnopubli(Integer anopubli) {
        this.anopubli = anopubli;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }
    public void consultarLivro(){
        System.out.println("Titúlo:" + this.titulo);
        System.out.println("Autor:" + this.autor);
        System.out.println("Editora:" + this.editora);
        System.out.println("Ano de publicação:"+ this.anopubli);
        System.out.println("ISBN:" + this.isbn);
    }
}
