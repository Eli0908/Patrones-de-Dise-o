package PatronFactory;

public class Circulo extends Figura {

    private double radio;

    public Circulo() {
    }


public Circulo (double radio){
        this.radio=radio;
}

public double getRadio(){
    return radio;
}

public double calcularArea(){
    return Math.PI*Math.pow(radio, 2);
}
    @Override
    public double CalcularArea() {
        return 0;
        
    }

    void setRadio(int i) {
       
    }
}
