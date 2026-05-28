package unrn.punto1;

public class Main {
    public static void main(String[] args) {
        MotorElectrico motorElectrico = new MotorElectrico();
        Motor motor1 = new MotorElectricoAdapter(motorElectrico);
        System.out.println(motor1.arrancar());
        System.out.println(motor1.acelerar());
        System.out.println(motor1.apagar());
        Motor motor2 = new MotorComun();
        System.out.println(motor2.arrancar());
        System.out.println(motor2.acelerar());
        System.out.println(motor2.apagar());
        Motor motor3 = new MotorEconomico();
        System.out.println(motor3.arrancar());
        System.out.println(motor3.acelerar());
        System.out.println(motor3.apagar());
    }
}

