package boletin19;

public class Futbol {

    public int[][] crearTabla(int[][] taboa) {
        for (int f = 0; f < taboa.length; f++) {
            for (int c = 0; c < taboa[f].length; c++) {
                taboa[f][c] = PedirDatos.pedirInt("Teclea valores para la tabla: ");
            }
        }
        return taboa;
    }

    public void amosar(int[][] taboa) {
        for (int f = 0; f < taboa.length; f++) {
            System.out.println("\n");
            for (int c = 0; c < taboa[f].length; c++) {
                System.out.print(taboa[f][c] + " ");
            }
        }
    }

    public void sair() {
        System.exit(0);
    }

    public String[] arrayFila(int[][] taboa) {
        String[] filas = new String[taboa.length];
        for (int i = 0; i < filas.length; i++) {
            filas[i] = PedirDatos.pedirString("nome filas ");
        }
        return filas;
    }

    public String[] arrayColumnas(int[][] taboa) {
        String[] columnas = new String[taboa[0].length];
        for (int i = 0; i < columnas.length; i++) {
            columnas[i] = PedirDatos.pedirString("nome columnas ");
        }
        return columnas;
    }

    public void amosarTodo(int[][] taboa, String[] equipos, String[] xornada) {
        for (int i = 0; i < xornada.length; i++) {
            System.out.print("   " + xornada[i] + " ");
        }
        for (int f = 0; f < taboa.length; f++) {
            System.out.print("\n" + equipos[f]);
            for (int c = 0; c < taboa[f].length; c++) {
                System.out.print(taboa[f][c] + " ");
            }
        }
    }
}
