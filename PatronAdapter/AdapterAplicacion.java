
package PatronAdapter;

import java.util.Scanner;

public class AdapterAplicacion {
    private static Scanner S=new Scanner (System.in);
    private static Motor motor;
    
    public static void main(String[]args){
    int opcion;
    do{
        opcion= preguntarOpciones();
        switch (opcion){
            case 1:
                motor=new MotorComun();
                usarMotor();
                break;
            case 2:
                motor=new MotorEconomico();
                usarMotor();
                break;
            case 3:
                motor=new MotorElectricoA();
                usarMotor();
                break;
            case 4:
                System.out.println("Cerrando Porograma");    
                break;
                
            default:
                System.out.println("La opcion ingresada No es valida");
                break;
        }
        System.out.print("\n\n");
    }while (opcion!=4);
    }
    private static int preguntarOpcion(){
        System.out.print(
                
                "Menu de opciones\n"
                +"1. Encender motor comun\n"
                +"2. Encender motor economico\n"
                +"3. Encender motor electrico\n"
                +"4. salir"
                +"Elija una opcion"
        );
        return Integer.parseInt(S.nextLine());  
    }
    private static void usarMotor(){
        motor.encender();
        motor.acelerar();
        motor.apagar();
    }

    private static int preguntarOpciones() {
        return 0;
    }
}
    
