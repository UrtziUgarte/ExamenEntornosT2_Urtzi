package main.java;

/**Clase que representa un libro
 * * Se puede ver el titulo, y el autor del libro. Tambien el año de publicaicon.
 *  *
 *  * @autor Urtzi Ugarte Pampin
 *  * @version 4.3.2025
 *  */
public class Libro {

    // TODO: Documentar estos atributos
    /** Los atributos del libro, que seran titulo, autor y año de publicacion
     * */
    private String titulo;
    private String autor;
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método
    /**El metodo donde un libro tendra un titulo, un autor y un int de año de publicacion.
     * */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /** El get del autor del libro. Para poder conseguir el nombre del autor.
     * @return
     *  */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /** El get del año de publicacion del libro. Para poder conseguir el año de publicacion.
     * @return
     * */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
