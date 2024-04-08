public class Persona {
    private String nombre;
    private int edad;
    private double salario;
    private static final double SALARIO_MINIMO = 1000.0; // Suponiendo un salario mínimo de 1000

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = calcularSalario();
    }

    // Getter para salario
    public double getSalario() {
        return salario;
    }

    // Setter para salario (si es necesario)
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Método privado para calcular el salario basado en la edad
    private double calcularSalario() {
        return (double) this.edad * SALARIO_MINIMO / 3;
    }

    // Otros getters y setters para nombre y edad
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
        this.salario = calcularSalario(); // Recalcular el salario cuando se actualiza la edad
    }
}