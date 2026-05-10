package unrn.punto1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmpleadoTest {

    @Test
    void calcularSalarioJefeDosEmpleados() {
        EmpleadoRegular empleado1 = new EmpleadoRegular(1000);
        EmpleadoRegular empleado2 = new EmpleadoRegular(1500);
        EmpleadoJerarquico jefe = new EmpleadoJerarquico(2000);
        jefe.agregarEmpleado(empleado1);
        jefe.agregarEmpleado(empleado2);

        double salarioTotal = jefe.calcularSalario();
        assertEquals(4500, salarioTotal, 0.001);
    }

    @Test
    void calcularSalarioCadenaCompleta() {
        EmpleadoRegular empleado1 = new EmpleadoRegular(1000);
        EmpleadoRegular empleado2 = new EmpleadoRegular(2000);
        EmpleadoJerarquico liderProyecto = new EmpleadoJerarquico(3000);
        liderProyecto.agregarEmpleado(empleado1);
        liderProyecto.agregarEmpleado(empleado2);
        EmpleadoJerarquico mandoMedio = new EmpleadoJerarquico(4000);
        mandoMedio.agregarEmpleado(liderProyecto);
        EmpleadoJerarquico gerente = new EmpleadoJerarquico(5000);
        gerente.agregarEmpleado(mandoMedio);
        EmpleadoJerarquico director = new EmpleadoJerarquico(6000);
        director.agregarEmpleado(gerente);


        double salarioTotal = director.calcularSalario();
        assertEquals(21000, salarioTotal, 0.001);
    }
}