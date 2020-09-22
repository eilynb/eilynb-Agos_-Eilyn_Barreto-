package Clase5;

public class Libro {
    //Atributos
    private int isbn;
    private String titulo;
    private int numeroPaginas;
    private String autor;

    //Constructores

    public Libro() {
        this.isbn = 0;
        this.titulo = "Sin título";
        this.numeroPaginas = 0;
        this.autor = "Desconocido";
    }

    public Libro(int conIsbn, String conTitulo, int conNumeroPag,String conAutor) {
        this.isbn = conIsbn;
        this.titulo = conTitulo;
        this.numeroPaginas = conNumeroPag;
        this.autor = conAutor;
    }

    public void setIsbn(int conIsbn) {
        this.isbn = conIsbn;
    }

    public int getIsbn() {
        return this.isbn;
    }

    public void setTitulo(String conTitulo){
        this.titulo=conTitulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setNumeroPaginas(int conNumeroPag){
        this.numeroPaginas=conNumeroPag;
    }
    public int getNumeroPaginas(){
        return this.numeroPaginas;
    }

    public void setAutor(String conAutor){
        this.autor= conAutor;
    }
    public String getAutor(){
        return this.autor;
    }

    //Metodos
    public String toString() {
        String resumen = "El libro con ISBN " + this.isbn + ", con el nombre " + this.titulo + " y creado por el autor ";

        if (this.autor == null ) {
            resumen += "Desconocido"+ ", tiene " + this.numeroPaginas + " páginas.";
        } else {
            resumen += this.autor + ", y además, tiene " + this.numeroPaginas + " páginas.";
        }
        return resumen;
    }

}

