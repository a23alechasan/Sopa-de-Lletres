import java.util.Scanner;

public class SopaDeLLetres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        (Fer Funcio main) -Alex
        >demanar lletres (min max 100) -Iker (demanarLletres)
        >convertir-les a matriu 10x10 -Marc (lletresAMatriu)
        >imprimir matriu -Adrian (ImprimirMatriu)
        >solicitar paraules while (!true)
        -->descartar si la paraula introduida < 3 caracters i > 10 caracters
        -->detectar si la paraula introduida es troba (horitzontal)
        -->detectar si la paraula introduida es troba (vertical)
        -->pintar paraules de vermell quan son trobades
        -->identificar si les 5 paraules s'han trobat
        >while (!true) s'acaba*/


        char[][] matriu = {
                {'N', 'A', 'S', 'Q', 'Y', 'C', 'C', 'S', 'O', 'Z'},
                {'M', 'R', 'W', 'O', 'I', 'H', 'Z', 'N', 'F', 'R'},
                {'Z', 'U', 'I', 'F', 'E', 'U', 'W', 'B', 'Y', 'T'},
                {'P', 'B', 'F', 'P', 'C', 'S', 'F', 'Q', 'Q', 'I'},
                {'P', 'Y', 'T', 'H', 'O', 'N', 'B', 'G', 'V', 'I'},
                {'J', 'P', 'D', 'D', 'B', 'T', 'N', 'E', 'V', 'W'},
                {'G', 'G', 'E', 'S', 'O', 'Y', 'P', 'Y', 'T', 'U'},
                {'F', 'Y', 'U', 'I', 'L', 'E', 'C', 'H', 'A', 'V'},
                {'V', 'B', 'Z', 'S', 'H', 'X', 'T', 'A', 'J', 'T'},
                {'D', 'Z', 'X', 'L', 'Y', 'J', 'A', 'V', 'A', 'Q'}
        };
    }

    static void Buscarpalabra(char[][] matriu, String palabra) {
        for (int i = 0; i < matriu.length; i++) {
            String fila = new String(matriu[i]);
            if (fila.contains(palabra)) {
                System.out.println("La palabra " + palabra + "esta en la fila" + i);
                return;
            }
            for (int j = 0; j < matriu[0].length; j++) {
                String columna = "";
                for (int k = 0; k < matriu.length; k++) {
                    columna += matriu[i][j];
                }
                if (columna.contains(palabra)) {
                    System.out.println("La palabra " + palabra + "esta en la columa" + j);
                    return;
                }
            }
        }

    }

    public void mostrarMatriz(char[][] matriz2) {


        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}


