package src;

public class ListaDoble {
    //Nodos
    private NodoLibros cabeza;
    private NodoLibros cola;
    private int size; //Tamaño de la lista
    //Constructor
    public ListaDoble() {
        cabeza = null;
        cola = null;
        size = 0;
    }
    //Obtener tamaño
    public int getSize(){
        return size;
    }
    //Agregar Libro a la lista
    public void agregar(Libro libro) {
        NodoLibros nuevo = new NodoLibros(libro);

        if (cabeza == null) {
            cabeza = nuevo;
            cola = nuevo;
        } else {
            nuevo.setSiguiente(cabeza);
            cabeza.setAnterior(nuevo);
            cabeza = nuevo;
        }

        size++;
    }
    //Obtener libros en un arreglo de objectos
    public Object[][] getLibros(){
        Object[][] libros = new Object[size][5];
        NodoLibros temp = cabeza;
        int i = 0;
        while(temp != null){
            Libro act = temp.getLibro();
            libros[i][0] = act.getCodigo();
            libros[i][1] = act.getNombre();
            libros[i][2] = act.getAutor();
            libros[i][3] = act.getMateria();
            libros[i][4]=act.getNumeroPaginas();
            temp= temp.getSiguiente();
            i++;
        }
        return libros;
    }
    //Editar libro 
    public void editar(int index, Libro libro) {
        if (index < 0 || index >= size) {
            System.out.println("Índice fuera de rango.");
            return;
        }
        //Obtener libro por el indice
        NodoLibros temporal = cabeza;
        for (int i = 0; i < index; i++) {
            temporal = temporal.getSiguiente();
        }
        //Cambiar valores
        temporal.editar(libro);
    }
    //Buscar indice segun el codigo 
    public int buscarCodigo(String code){
        NodoLibros temporal = cabeza;
        for (int i = 0; i < size; i++) {
            if(code.equalsIgnoreCase(temporal.getLibro().getCodigo())){
                return i;
            }else{temporal = temporal.getSiguiente();}
        }
        return -1;
    }
    //Obtener libro por inidice
    public Libro obtenerLibro(int index){
        NodoLibros temporal = cabeza;
        for (int i = 0; i < index; i++) {
            temporal = temporal.getSiguiente();
        }
        return temporal.getLibro();
    }
    //Eliminar libro (Cambia los punteros al siguiente y anterior del que sedea borrar)
    public void eliminar(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Índice fuera de rango.");
            return;
        }
        NodoLibros temporal = cabeza;
        for (int i = 0; i < index; i++) {
            temporal = temporal.getSiguiente();
        }
        //nodos anteriores y siguientes al indicado 
        NodoLibros nodoAnterior = temporal.getAnterior();
        NodoLibros nodoSiguiente = temporal.getSiguiente();

        if (nodoAnterior != null) {
            nodoAnterior.setSiguiente(nodoSiguiente);
        } else {
            cabeza = nodoSiguiente;
        }

        if (nodoSiguiente != null) {
            nodoSiguiente.setAnterior(nodoAnterior);
        } else {
            cola = nodoAnterior;
        }

        size--;
    }
    public boolean isNull (){
        return (cabeza==null)?true:false;
    }
}
