import java.util.Scanner;

public class LaboratorioBacterias extends ExperimentoBacterias{
        public LaboratorioBacterias() {
            super();
        }

        public static int opcionesLaboratorio() {
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

                }
            }    while (opcion!=9);
            scanner.close();
            return opcion;
        }
    }


