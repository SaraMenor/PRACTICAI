import java.util.Scanner;

public class Aplicacion {
    public static void main(String[]args){
        PoblacionBacterias poblacion=new PoblacionBacterias();
        ExperimentoBacterias experimentoBacterias=new ExperimentoBacterias();
        Scanner scanner=new Scanner((System.in));

        int opcion;
        do {
            System.out.println("Opciones:");
            System.out.println(("1. Abrir archivo experimento"));
            System.out.println("2. Crear experimento");
            System.out.println("3. Crear poblacion de baterias");
            System.out.println("4. Ver poblacion de bacterias");
            System.out.println("5. Borrar poblacion");
            System.out.println("6. Ver informacion detalladad de una poblacion");
            System.out.println("7. Guardar");
            System.out.println(("8. Guardar como"));
            System.out.println("9. Salir");
            System.out.println("Seleccione una opcion");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch ((opcion)) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.out.println("");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
            while (opcion!=9);
            scanner.close();
        }
    }

