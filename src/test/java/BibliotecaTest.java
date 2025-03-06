package test.java;

import main.java.Biblioteca;
import main.java.Libro;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BibliotecaTest {

    Biblioteca biblioteca = new Biblioteca();
    Libro libro;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Libro libro = new Libro("Narnia", "UrtziUgarte", 2025);
    }

    @org.junit.jupiter.api.Test
    void agregarLibro() {
        assertTrue(biblioteca.agregarLibro(this.libro));
    }
    private void assertTrue(boolean b) {
    }

    @org.junit.jupiter.api.Test
    void eliminarLibro() {
    }

    @org.junit.jupiter.api.Test
    void getLibros() {
    }

    @org.junit.jupiter.api.Test
    void encuentraLibroPorTitulo() {

    }

    @org.junit.jupiter.api.Test
    void encuentaLibroPorAutor() {
    }

    @org.junit.jupiter.api.Test
    void encuentraLibrosPorAutor() {
        List<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(libro);
        Biblioteca biblioteca = new Biblioteca(listaLibros);
        assertEquals(biblioteca.getLibros());
    }
}