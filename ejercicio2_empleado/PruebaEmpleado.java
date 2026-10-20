import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // datos del primer empleado
        String nombre1 = JOptionPane.showInputDialog("Empleado 1 - Primer nombre:");
        String apellido1 = JOptionPane.showInputDialog("Empleado 1 - Apellido paterno:");
        double salario1 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 1 - Salario mensual:"));

        // datos del segundo empleado
        String nombre2 = JOptionPane.showInputDialog("Empleado 2 - Primer nombre:");
        String apellido2 = JOptionPane.showInputDialog("Empleado 2 - Apellido paterno:");
        double salario2 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 2 - Salario mensual:"));

        Empleado empleado1 = new Empleado(nombre1, apellido1, salario1);
        Empleado empleado2 = new Empleado(nombre2, apellido2, salario2);

        String mensaje = empleado1.obtenerPrimerNombre() + " " + empleado1.obtenerApellidoPaterno()
                + ": $" + (empleado1.obtenerSalarioMensual() * 12) + "\n"
                + empleado2.obtenerPrimerNombre() + " " + empleado2.obtenerApellidoPaterno()
                + ": $" + (empleado2.obtenerSalarioMensual() * 12);
        JOptionPane.showMessageDialog(null, mensaje, "Salario anual", JOptionPane.INFORMATION_MESSAGE);

        // aumento del 10%
        empleado1.establecerSalarioMensual(empleado1.obtenerSalarioMensual() * 1.10);
        empleado2.establecerSalarioMensual(empleado2.obtenerSalarioMensual() * 1.10);

        mensaje = empleado1.obtenerPrimerNombre() + " " + empleado1.obtenerApellidoPaterno()
                + ": $" + (empleado1.obtenerSalarioMensual() * 12) + "\n"
                + empleado2.obtenerPrimerNombre() + " " + empleado2.obtenerApellidoPaterno()
                + ": $" + (empleado2.obtenerSalarioMensual() * 12);
        JOptionPane.showMessageDialog(null, mensaje, "Salario anual con aumento del 10%", JOptionPane.INFORMATION_MESSAGE);
    }
}