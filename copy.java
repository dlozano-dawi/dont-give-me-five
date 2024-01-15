public class copy{
    public static void main(String[] args) {
        System.out.println(dontGiveMeFive(1, 55));
    }
    
    public static int dontGiveMeFive(int start, int end){
        // String temporal que almacenará el numero del loop
        String temp = "";
        // Contador final
        int counter = 0;
        // Boolean del que depende que el contador aumente o no
        boolean state = true;
        // For entre el numero mas pequeño y el mas grande
        for (int i = start; i <= end; i++) {
            // Pasamos el numero a string
            temp = Integer.toString(i);
            // Comprobamos si el string contiene 5, 
            // Comprobamos si algun char es un 5
            for (int j = 0; j < temp.length(); j++) {
                // En caso de serlo, state pasa a false, asi que no aumentará el contador
                if (temp.charAt(j) == '5') {
                    state = false;
                }
            }
            // En caso de ser true, el contador aumenta
            if (state == true) {
                counter++;
            }
            // state vuelve a true para el siguiente numero
            state = true;
        }
        return counter;
    }
}