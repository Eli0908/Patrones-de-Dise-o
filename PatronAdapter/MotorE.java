package PatronAdapter;

public class MotorE {

    private boolean conectado = false;

    public MotorE() {
        System.out.println("Creando motor electrico...");
        this.conectado = false;
    }

    public void conectar() {
        System.out.println("Conectando motor electrico...");
        this.conectado = true;
    }

    public void activar() {
        if (!this.conectado) {
            System.out.println("No se puede activar, pues no esta conectado el motor Electrico");
        }
        else {
            System.out.println("Está conectado, activando motor electrico...");
    }
    }

    public void moverRapido(){
    if (!this.conectado)
        System.out.println("No se puede mover rapido el motor pues no esta conectado");
     else {
         System.out.println("Moviendo mas rapido, aumentando voltaje");

    }
    }

    void detener() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void desconectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}