package prueba.examen.pkgfinal;
public class Lista {
    private int max;
    private int[] elem;
    private int cantElem;
     
    public Lista(int max) {
        this.max = max;
        this.cantElem = 0;
        this.elem = new int[max];
        
    }
    public String toString() {
        String s = "[";
        for(int i = 0; i < this.cantElem; i++) {
            s = s + this.elem[i];
            if(i < this.cantElem - 1) {
                s = s + ", ";
            }
        }
        s = s + "]";
        return s;
    }

    // Método para agregar un elemento
    public void add(int x) {
        if (cantElem < elem.length) {
            elem[cantElem++] = x;
        }
    }

    //INSERTAR ELEMENTOS A UNA LISTA
    //1 
    public void frecuencia() {
        int t = elem[0], c = 1;
        for (int i = 1; i < cantElem; i++) {
            if (elem[i] == t) {
                c++;
            } else {
                System.out.println(t + " tiene frecuencia " + c);
                t = elem[i];
                c = 1;
            }
        }
        System.out.println(t + " tiene frecuencia " + c);
    }
    //2
    public void insertarLugarAsc(int x) {
        if(cantElem == max) {
            return;
        }
        int i = cantElem - 1;
        while(i >= 0 && elem[i] > x) {
            elem[i + 1] = elem[i];
            i--;
        }
        elem[i + 1] = x;
        cantElem++;
    }
    //3
    public void insertarIesimo(int x, int i) {
        if(i < 0 || i > cantElem || cantElem >= max) {
            return;
        }
        for(int j = cantElem; j > i; j--) {
            this.elem[j] = this.elem[j - 1];
        }
        this.elem[i] = x;
        this.cantElem++;
    }
    //4
    public void insertarPrim(int x) {
        insertarIesimo(x, 0);
    }
    //5
    public void insertarUlt(int x) {
        if(cantElem < max) {
            this.elem[cantElem] = x;
            this.cantElem++;
        }
    }
//ELIMINAR ELEMENTOS DE UNA LISTA
    //1 
    public void eliminarIesimo(int i) {
        if(i < 0 || i >= cantElem) {
            return;
        }
        for(int j = i; j < cantElem - 1; j++) {
            this.elem[j] = this.elem[j + 1];
        }
        cantElem--;
    }
    //2
    public void eliminarPrim() {
        eliminarIesimo(0);
    }
    //3
    public void eliminarUlt() {
        if(cantElem > 0) {
            cantElem--;
        }
    }
    //4
    public void eliminarTodo(int x) {
        for(int i = 0; i < cantElem; i++) {
            if(elem[i] == x) {
                eliminarIesimo(i);
                i--;
            }
        }
    }
    //5
    public void eliminarPares() {
        for(int i = 0; i < cantElem; i++) {
            if(elem[i] % 2 == 0) {
                eliminarIesimo(i);
                i--;
            }
        }
    }
}
     
