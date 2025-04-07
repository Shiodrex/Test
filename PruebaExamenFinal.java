TEST TOTAL
public static void main(String[] args) {
        Lista L1 = new Lista(10);
//        //INSERTAR
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.frecuencia();
       

//        L1.insertarLugarAsc(3);
//        L1.insertarLugarAsc(1);
//        L1.insertarLugarAsc(2);

//        L1.insertarIesimo(0, 1);
//        L1.insertarIesimo(1, 4);

//        L1.insertarPrim(3);
//        L1.insertarPrim(1);

//        L1.insertarUlt(9);
//        L1.insertarUlt(5);

        //ELIMINAR
//        L1.eliminarIesimo(5);
//        L1.eliminarIesimo(2);

//        L1.eliminarPrim();
//
//        L1.eliminarUlt();

//        L1.eliminarPares();

//        L1.eliminarTodo(1);
//        System.out.println(L1);
         
        //ARRAYLIST
        
//         ArrayList<Integer> L1 = new ArrayList<>();
        
       // Pruebas
//        L1.add(1);
//        L1.add(2);
//        L1.add(3);
//        L1.add(4);
//
//        System.out.println(frecuencia(L1, 2));

////        insertarLugarAsc(L1, 3);

////        insertarIesimo(L1, 5, 2);

////        insertarPrim(L1, 2); 

////        insertarUlt(L1, 10);

////        eliminarIesimo(L1, 2);

////        eliminarPrim(L1);

////        eliminarUlt(L1);

////        eliminarTodo(L1, 2);

//        eliminarPares(L1);
//        
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
