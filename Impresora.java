public class Impresora {
    private int toner;
    private int paginasimpresas;
    private boolean doblecara;

    public Impresora(int toner, boolean doblecara) {
        this.toner = toner;
        this.doblecara = doblecara;
        this.paginasimpresas=0;



    }

    public int addcantidad(int nuevotoner) {
        //Comprobar que el nuevotoner no sea mas grande que el toner inicial
        if (nuevotoner > this.toner) {
            return -1;
        } else {
            this.toner = nuevotoner + this.toner;
        }
        //Asegurar que el toner esté entre 0 y 100
        if (toner > 0 && toner <= 100) {
            return this.toner;
        } else {
            return -1;
        }
    }

    public int imprimirpaginas(int paginas) {

//Imprimir esas páginas y actualizar ese valor de páginas impresas,dependiendo si es par o impar
        if (doblecara) {
            if (paginas % 2 == 0) {

                paginasimpresas+=paginas/2;
                return paginas / 2;
            } else {
                paginasimpresas+=(paginas/2)+1;
                return (paginas / 2) + 1;

            }
        } else {
            paginasimpresas+=paginas;
            return paginas;
        }

    }
    //Obtener las páginas que se han imprimido
    public int getPaginasimpresas() {
        return paginasimpresas;
    }
}


