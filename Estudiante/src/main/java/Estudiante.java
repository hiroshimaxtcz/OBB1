import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Estudiante {
    static class Alumno {
        private String nombre;
        private int anioIngreso;
        private double promedio;
        private List<Integer> notas;

        public Alumno(String nombre, int anioIngreso, double promedio, List<Integer> notas) {
            this.nombre = nombre;
            this.anioIngreso = anioIngreso;
            this.promedio = promedio;
            this.notas = notas;
        }

        public String getNombre() {
            return nombre;
        }

        public int getAnioIngreso() {
            return anioIngreso;
        }

        public double getPromedio() {
            return promedio;
        }

        public List<Integer> getNotas() {
            return notas;
        }

        @Override
        public String toString() {
            return nombre + " (Ingreso: " + anioIngreso + ", Promedio: " + promedio + ")";
        }
    }

    // 1. FILTER
    public List<Alumno> ingresantesEnAnio(List<Alumno> alumnos, int anio) {
        return alumnos.stream()
                .filter(alumno -> alumno.getAnioIngreso() == anio)
                .collect(Collectors.toList());
    }

    // 2. MAP
    public List<String> nombresAlumnos(List<Alumno> alumnos) {
        return alumnos.stream()
                .map(Alumno::getNombre)
                .collect(Collectors.toList());
    }

    // 3. MAPTODOUBLE | MAPTOINT
    public double promedioMasAlto(List<Alumno> alumnos) {
        return alumnos.stream()
                .mapToDouble(Alumno::getPromedio)
                .max()
                .orElse(0);
    }

    // 4. LIMIT
    public List<Alumno> primerosNAlumnos(List<Alumno> alumnos, int n) {
        return alumnos.stream()
                .limit(n)
                .collect(Collectors.toList());
    }

    // 5. ANYMATCH
    public boolean existeIngresanteAntesDe(List<Alumno> alumnos, int anio) {
        return alumnos.stream()
                .anyMatch(alumno -> alumno.getAnioIngreso() < anio);
    }

    // 6. ALLMATCH | NONEMATCH
    public boolean todosConPromedioMayorA(List<Alumno> alumnos, double nota) {
        return alumnos.stream()
                .allMatch(alumno -> alumno.getPromedio() > nota);
    }

    // 7. MAX | MIN
    public Alumno mejorPromedio(List<Alumno> alumnos) {
        return alumnos.stream()
                .max(Comparator.comparingDouble(Alumno::getPromedio))
                .orElse(null);
    }

    // 8. COUNT
    public long cantidadConPromedioMayorA(List<Alumno> alumnos, double nota) {
        return alumnos.stream()
                .filter(alumno -> alumno.getPromedio() > nota)
                .count();
    }

    // 9. SUM
    public int totalExamenesTomados(List<Alumno> alumnos) {
        return alumnos.stream()
                .mapToInt(alumno -> alumno.getNotas().size())
                .sum();
    }

    // 10. AVERAGE
    public double promedioGeneral(List<Alumno> alumnos) {
        return alumnos.stream()
                .mapToDouble(Alumno::getPromedio)
                .average()
                .orElse(0);
    }

    // 11. SORTED
    public List<Alumno> ordenarPorPromedioDescendente(List<Alumno> alumnos) {
        return alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getPromedio).reversed())
                .collect(Collectors.toList());
    }

    // 12. FINDFIRST | FINDANY
    public Alumno primerAlumnoCon(List<Alumno> alumnos, String letra) {
        return alumnos.stream()
                .filter(alumno -> alumno.getNombre().startsWith(letra))
                .findFirst()
                .orElse(null);
    }

    // Main para probar todos los métodos
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
                new Alumno("Juan Perez", 2020, 8.5, List.of(7, 8, 9)),
                new Alumno("Ana Gomez", 2021, 9.2, List.of(10, 9, 8)),
                new Alumno("Luis Martinez", 2019, 7.5, List.of(6, 7, 8))
        );

        Estudiante app = new Estudiante();

        System.out.println("Alumnos ingresantes en 2021: " + app.ingresantesEnAnio(alumnos, 2021));
        System.out.println("Nombres de los alumnos: " + app.nombresAlumnos(alumnos));
        System.out.println("Promedio más alto: " + app.promedioMasAlto(alumnos));
        System.out.println("Primeros 2 alumnos: " + app.primerosNAlumnos(alumnos, 2));
        System.out.println("¿Algún alumno ingresó antes de 2020? " + app.existeIngresanteAntesDe(alumnos, 2020));
        System.out.println("¿Todos tienen promedio mayor a 7? " + app.todosConPromedioMayorA(alumnos, 7));
        System.out.println("Alumno con mejor promedio: " + app.mejorPromedio(alumnos));
        System.out.println("Cantidad de alumnos con promedio > 8: " + app.cantidadConPromedioMayorA(alumnos, 8));
        System.out.println("Total de exámenes tomados: " + app.totalExamenesTomados(alumnos));
        System.out.println("Promedio general de los alumnos: " + app.promedioGeneral(alumnos));
        System.out.println("Alumnos ordenados por promedio descendente: " + app.ordenarPorPromedioDescendente(alumnos));
        System.out.println("Primer alumno cuyo nombre empieza con 'A': " + app.primerAlumnoCon(alumnos, "A"));
    }

}
