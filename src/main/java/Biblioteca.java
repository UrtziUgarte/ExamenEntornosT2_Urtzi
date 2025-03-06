package main.java;

import java.util.ArrayList;
import java.util.List;
/**Clase que representa una biblioteca como coleccion de libros
 * Se pueden agregar, eliminar y encontrar libros por autor.
 *
 * @autor Urtzi Ugarte Pampin
 * @version 4.3.2025
 * */
public class Biblioteca {

    // TODO: Documentar estos atributos
    /**Lista de libros que estan accesibles en la biblioteca*/
    private final List<Libro> libros;

    // TODO: Documentar este método
    /**Constructor por defecto sin libros*/
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO
    /**Constructor con parametros
     * @param libros Lista de libros con la que se inicializara la biblioteca
     * */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    /**Agrega libros a la biblioteca
     * @param libro Un libro que se agregara a la biblioteca
     * @return
     * */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    /**
     * @param libro El libro que se va a elimibar
     * @return
     * */
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método
    /**Conseguir los libros de la lista
     * @return
     * */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.
    /** Encuentra el libro usando su titulo
     * @param titulo el titulo del libro que queremos
     * @return
     * */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo
    /**Encontrar el libro por el autor del libro
     * @param autor
     * @return
     * @deprecated esta obsoleto. {@link #encuentraLibrosPorAutor(String)} el nuevo que no esta obsoleto
     * */
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente
    /** Encuentra los libros por autor, como el anterior, pero este no esta obsoleto
     * @param autor
     * @return
     * {@link #encuentaLibroPorAutor(String)} Es la sustitucion de esta
     * @since version 2.0.
     *
     * */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
