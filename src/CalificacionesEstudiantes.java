public class CalificacionesEstudiantes {
    public static void main(String[] args) {
        // Definimos los datos de los estudiantes
        String[] estudiantes = {"Ana", "Carlos", "Sofía", "David", "Elena"};
        String[] materias = {"Matemáticas", "Física", "Química", "Literatura", "Historia"};
        double[][] notas = {
                {8.5, 7.0, 9.0, 8.0, 7.5},  // Notas de Ana
                {7.0, 6.5, 8.0, 9.0, 8.5},  // Notas de Carlos
                {9.5, 9.0, 9.5, 8.5, 9.0},  // Notas de Sofía
                {6.0, 7.0, 7.5, 8.0, 7.0},  // Notas de David
                {8.0, 8.5, 7.5, 9.0, 8.5}   // Notas de Elena
        };

        // Mostramos la información de los estudiantes
        mostrarInformacionEstudiantes(estudiantes, materias, notas);

        // Calculamos y mostramos los promedios de cada estudiante
        calcularPromedios(estudiantes, notas);

        // Encontramos y mostramos al estudiante con el promedio más alto
        encontrarMejorEstudiante(estudiantes, notas);

        // Encontramos y mostramos la materia con el promedio más alto
        encontrarMejorMateria(materias, notas);
    }

    public static void mostrarInformacionEstudiantes(String[] estudiantes, String[] materias, double[][] notas) {
        System.out.println("Información de los estudiantes:");
        // Implementa este método
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Estudiante: " + estudiantes[i]);
            for (int j = 0; j < materias.length; j++) {
                System.out.println("  " + materias[j] + ": " + notas[i][j]);
            }
        }

    }

    public static void calcularPromedios(String[] estudiantes, double[][] notas) {
        System.out.println("\nPromedios de los estudiantes:");
        // Implementa este método
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            System.out.println(estudiantes[i] + ": " + promedio);
        }
    }

    public static void encontrarMejorEstudiante(String[] estudiantes, double[][] notas) {
        // Implementa este método
        double mejorPromedio = 0;
        String mejorEstudiante = "";
        for (int i = 0; i < estudiantes.length; i++) {
            double suma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / notas[i].length;
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorEstudiante = estudiantes[i];
            }
        }
        System.out.println("\nEl estudiante con el mejor promedio es " + mejorEstudiante + " con un promedio de " + mejorPromedio);
    }

    public static void encontrarMejorMateria(String[] materias, double[][] notas) {
        // Implementa este método
        double[] promediosMaterias = new double[materias.length];
        for (int j = 0; j < materias.length; j++) {
            double suma = 0;
            for (int i = 0; i < notas.length; i++) {
                suma += notas[i][j];
            }
            promediosMaterias[j] = suma / notas.length;
        }

        double mejorPromedio = 0;
        String mejorMateria = "";
        for (int j = 0; j < materias.length; j++) {
            if (promediosMaterias[j] > mejorPromedio) {
                mejorPromedio = promediosMaterias[j];
                mejorMateria = materias[j];
            }
        }
        System.out.println("\nLa materia con el mejor promedio es " + mejorMateria + " con un promedio de " + mejorPromedio);
    }
    }
