package biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa una biblioteca con una coleccion de libros
 * Permite agregar, eliminar y buscar libros por titulo y por autor
 *
 * @see Libro
 * @author Luis Juarez
 * @version 4.3.2025
 */

public class Biblioteca {

    // TODO: Documentar estos atributos
    /** Lista de Libros disponibles en La Biblioteca */
    private final List<Libro> libros;

    // TODO: Documentar este método
    /** Constructor por defecto de La Biblioteca sin libros */
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /** Constructor con parametros
     *
     * @param libros Lista de Libros con la que se inicializa La Biblioteca
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado

    /**
     * Agrega un Libro a La Biblioteca
     * @param libro Un libro para agregar
     *
     * @return {@code true} si el Libro se ha agregado correctamente o {@code false} si el Libro no se ha agregado correctamente
     */
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método

    /**
     * Devuelve la lista de Libros de la Biblioteca
     * @return Lista de Libros de la Biblioteca
     */
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     *
     * @param titulo
     * @return
     */
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

    /**
     * @deprecated Este metodo ha quedado obsoleto
     * Se recomienda usar {@link #encuentraLibroPorTitulo(String)} en su lugar
     * @param autor
     * @return
     */
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
    //  Test 01: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test 02: Comprobar la lista de libros que devuelve para un autor NO existente

    /**
     * Busca todos los libros de un autor determinado
     * @since V2.0
     * Sustituye al metodo {@link #encuentraLibrosPorAutor(String)}
     * @param autor
     * @return
     */
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