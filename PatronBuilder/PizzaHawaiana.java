
package PatronBuilder;

public class PizzaHawaiana extends PizzaB{

    @Override
    public void buildMasa() {
        pizza.setMasa("Gruesa");
    }

    @Override
    public void buildSalsa() {
       pizza.setSalsa("Dulce");
    }

    @Override
    public void buildRelleno() {
      pizza.setRelleno("Piña+Jamon");
    }
    
}
