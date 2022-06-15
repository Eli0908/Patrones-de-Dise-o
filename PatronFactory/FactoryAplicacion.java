
package PatronFactory;

public class FactoryAplicacion {
    public static void main(String [] args){
        Figura figura=FactoryFigura.crearFigura (TipoFigura.TRIANGULO);
        Triangulo triangulo=(Triangulo) figura;
        triangulo.setBase(10);
        triangulo.setAltura(6);
        System.out.println("Base:"+triangulo.getBase());
        System.out.println("Altura:"+triangulo.getAltura());
        System.out.println("Área: "+figura.CalcularArea());
        
        System.out.println();
        
        figura=FactoryFigura.crearFigura(TipoFigura.RECTANGULO);
        Rectangulo rectangulo=(Rectangulo) figura;
        rectangulo.setAncho(9);
        rectangulo.setAlto(15);
        System.out.println("Rectangulo:"+rectangulo.getAncho());
        System.out.println("Altura:"+rectangulo.getAlto());
        System.out.println("Área: "+figura.CalcularArea());
        
        System.out.println();
        
        figura=FactoryFigura.crearFigura(TipoFigura.CIRCULO);
        Circulo circulo=(Circulo) figura;
        circulo.setRadio(16);
        System.out.println("Circulo:");
        System.out.println("Altura:"+circulo.getRadio());
        System.out.println("Área: "+figura.CalcularArea());
    }
}
