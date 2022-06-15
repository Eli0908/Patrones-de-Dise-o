package PatronFactory;

public class FactoryFigura {

    public static Figura crearFigura(TipoFigura tipoFigura) {
        switch (tipoFigura) {
            case TRIANGULO:
                return new Triangulo();
            case RECTANGULO:
                return new Rectangulo();
            default:
                return new Circulo();
        }

    }
}
