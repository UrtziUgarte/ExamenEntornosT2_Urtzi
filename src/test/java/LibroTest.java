package test.java;

import main.java.Libro;

import static org.junit.jupiter.api.Assertions.*;

class LibroTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Libro libro = new Libro("Narnia", "UrtziUgarte", 2025);
        assertEquals(2025, libro.getAutor());
        assertEquals("UrtziUgarte", libro.getAnioPublicacion());
        assertEquals("Narnia", libro.getAutor());
    }

    @org.junit.jupiter.api.Test
    void getTitulo() {
    }

    @org.junit.jupiter.api.Test
    void setTitulo() {
    }

    @org.junit.jupiter.api.Test
    void getAutor() {
    }

    @org.junit.jupiter.api.Test
    void setAutor() {
    }

    @org.junit.jupiter.api.Test
    void getAnioPublicacion() {
    }

    @org.junit.jupiter.api.Test
    void setAnioPublicacion() {
    }
}