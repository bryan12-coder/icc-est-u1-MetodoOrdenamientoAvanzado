public class App {
    public static void main(String[] args) throws Exception {
        Merge ordenador = new Merge();

        
        int[] miArreglo = {8, 3, 5, 1,9,6};

    

        
        System.out.println("Arreglo original:");
        ordenador.imprimirArreglo(miArreglo);

        
        ordenador.mergeSort(miArreglo);

       
        System.out.println("\nArreglo ordenado con Merge Sort:");
        ordenador.imprimirArreglo(miArreglo);
    }

   
    
    
}
