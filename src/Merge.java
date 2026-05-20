public class Merge {

    public void mergeSort(int[] array) {
            // Caso base
            if (array.length <= 1) {
                return;
            }
    
            // Mitad del arreglo
            int mid = array.length / 2;
    
            // Subarreglo izquierdo
            int[] left = new int[mid];
    
            // Subarreglo derecho
            int[] right = new int[array.length - mid];
    
            // Copiar datos al arreglo izquierdo
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
    
            // Copiar datos al arreglo derecho
            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }
    
            // Llamadas recursivas
            mergeSort(left);
            mergeSort(right);
    
            // Combinar arreglos
            merge(array, left, right);
        }
    
        public void merge(int[] array, int[] left, int[] right) {
            int i = 0; // índice izquierda
            int j = 0; // índice derecha
            int k = 0; // índice arreglo final
            
            // Comparar y combinar
            while (i < left.length && j < right.length) {
                if (left[i] <= right[j]) {
                    array[k] = left[i];
                    i++;
                } else {
                    array[k] = right[j];
                    j++;
                }
                k++;
            }
    
            // Copiar sobrantes izquierda
            while (i < left.length) {
                array[k] = left[i];
                i++;
                k++;
            }
    
            // Copiar sobrantes derecha
            while (j < right.length) {
                array[k] = right[j];
                j++;
                k++;
            }
        }
        public  void imprimirArreglo(int[] array) {
            for (int num : array) {
                System.out.print("[" + num + "] ");
            }
            System.out.println();
        }
        
    
    
}
