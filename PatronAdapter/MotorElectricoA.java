
package PatronAdapter;

public class MotorElectricoA extends Motor{
    private MotorE motorE;
    
    public MotorElectricoA(){
        super();
        System.out.println("Creando Motor electrico adapter...");
        this.motorE=new MotorE();          
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor electrico adapter");
        this.motorE.conectar();
        this.motorE.activar();
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando motor electrico adapter");
        this.motorE.moverRapido();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor electrico adapter");
        this.motorE.detener();
        this.motorE.desconectar();
    }
    
    
}
