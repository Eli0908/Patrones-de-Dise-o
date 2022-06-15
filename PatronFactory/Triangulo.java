
package PatronFactory;
public class Triangulo extends Figura{
    private double altura;
    private double base;
    
    public Triangulo(){
    }
    
    public Triangulo (double altura,double base){
        this.altura=altura;
        this.base=base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(double altura){
        this.altura=altura;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(double base){
        this.base=base;
    }
    
    public double calcularArea(){
        return base*altura/2;
    }

    @Override
    public double CalcularArea() {
        return 0;
        
    }
}
