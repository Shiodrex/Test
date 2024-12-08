package prueba.examen.pkgfinal;

import java.util.ArrayList;

public class PruebaExamenFinal {
    
    public static void main(String[] args) {
        //INSERTAR
        Lista L1 = new Lista(10);
        L1.frecuencia();
        //Frecuencia

        L1.insertarLugarAsc(3);
        L1.insertarLugarAsc(1);
        L1.insertarLugarAsc(2);

       
        System.out.println(L1);
        
        //ARRAYLIST
        
//         ArrayList<Integer> L1 = new ArrayList<>();
//        
//        // Pruebas
        L1.add(2);
        L1.add(2);
        L1.add(2);
        L1.add(1);

//        System.out.println(frecuencia(L1, 2));
//
//        insertarLugarAsc(L1, 3);
//        System.out.println(L1);
//
//        insertarIesimo(L1, 5, 2);
//        System.out.println(L1);
//
//        
//        System.out.println(L1);
//
//        insertarUlt(L1, 10);
//        System.out.println(L1);
//
//        eliminarIesimo(L1, 2);
//        System.out.println(L1);
//
//        eliminarPrim(L1);
//        System.out.println(L1);
//
//        eliminarUlt(L1);
//        System.out.println(L1);
//
//        eliminarTodo(L1, 2);
//        System.out.println(L1);
//
        L1.add(7);
        L1.add(3);
        L1.add(1);
//        eliminarPares(L1);
//        System.out.println(L1);
    }
     public static int frecuencia(ArrayList<Integer> L1, int x) {
        int contador = 0;
        for (int num : L1) {
            if (num == x) {
                contador++;
            }
        }
        return contador;
    }

    public static boolean insertarLugarAsc(ArrayList<Integer> L1, int x) {
        int i = 0;
        while (i < L1.size() && L1.get(i) < x) {
            i++;
        }
        L1.add(i, x);
        return true;
    }

    public static boolean insertarIesimo(ArrayList<Integer> L1, int x, int i) {
        if (i < 0 || i > L1.size()) {
            return false;
        }
        L1.add(i, x);
        return true;
    }

    public static boolean insertarPrim(ArrayList<Integer> L1, int x) {
        L1.add(0, x);
        return true;
    }

    public static boolean insertarUlt(ArrayList<Integer> L1, int x) {
        L1.add(x);
        return true;
    }

    public static boolean eliminarIesimo(ArrayList<Integer> L1, int i) {
        if (i < 0 || i >= L1.size()) {
            return false;
        }
        L1.remove(i);
        return true;
    }

    public static boolean eliminarPrim(ArrayList<Integer> L1) {
        if (L1.isEmpty()) {
            return false;
        }
        L1.remove(0);
        return true;
    }

    public static boolean eliminarUlt(ArrayList<Integer> L1) {
        if (L1.isEmpty()) {
            return false;
        }
        L1.remove(L1.size() - 1);
        return true;
    }

    public static boolean eliminarTodo(ArrayList<Integer> L1, int x) {
        boolean eliminado = false;
        while (L1.contains(x)) {
            L1.remove((Integer) x);
            eliminado = true;
        }
        return eliminado;
    }

    public static boolean eliminarPares(ArrayList<Integer> L1) {
        boolean eliminado = false;
        for (int i = 0; i < L1.size(); i++) {
            if (L1.get(i) % 2 == 0) {
                L1.remove(i);
                i--; // Ajustar el índice tras eliminar
                eliminado = true;
            }
        }
        return eliminado;
    }
}