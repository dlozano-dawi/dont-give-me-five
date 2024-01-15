public class five{
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(-500, 15));
    }
    
    public static int dontGiveMeFive(int start, int end){
        // String temporal que almacenará el numero del loop
        String temp = "";
        // Contador final
        int counter = 0;
        // For entre el numero mas pequeño y el mas grande
        for (int i = start; i <= end; i++) {
            // Pasamos el numero a string
            temp = Integer.toString(i);
            // Comprobamos si el string contiene 5, 
            // en caso de que si, pasamos al siguiente loop sin aumentar el contador
            if (temp.contains("5")) {
                continue;
            }
            // Aumentamos el contador
            counter++;
        }
        return counter;
    }
}