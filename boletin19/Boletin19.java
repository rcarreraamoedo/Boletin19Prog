package boletin19;

import javax.swing.JOptionPane;

public class Boletin19 {
    
    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        String[] equipos = {"Real Madrid", "Barcelona", "Getafe", "Atlético", "Sevilla", "R.Sociedad", "Valencia", "Villarreal", "Athletic", "Granada", "Levante", "Osasuna", "Betis", "Alavés", "Valladolid", "Eibar", "Celta", "Mallorca","Leganés","Espanyol"};
        String[] xornada = {"X1", "X2", "X3", "X4", "X5", "X6", "X7", "X8", "X9", "X10", "X11", "X12", "X13", "X14" , "X15", "X16", "X17", "X18", "X19", "X20", "X21", "X22", "X23", "X23", "X24", "X25", "X26", "X27", "X28", "X29", "X30", "X31", "X32", "X33", "X34", "X35", "X36"};
        int opcion;
        Futbol obx = new Futbol();
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("****MENU****\n 1 --> Crear Matriz\n 2--> Amosar\n 3 Sair"));
            switch (opcion) {
                case 1:
                    matriz = obx.crearTabla(matriz);
                    break;
                case 2:
                    obx.amosar(matriz);
                    break;
                case 3:
                    obx.amosarTodo(matriz, equipos, xornada);
                    break;
                case 4:
                    obx.sair();
                    break;
            }
            
        } while (opcion < 3);
    }
    
}
