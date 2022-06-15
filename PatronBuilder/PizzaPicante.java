
package PatronBuilder;

public class PizzaPicante extends PizzaB{

    @Override
    public void buildMasa() {
       pizza.setMasa("Delgada");
    }

    @Override
    public void buildSalsa() {
        pizza.setSalsa("Picante");
    }

    @Override
    public void buildRelleno() {
        pizza.setRelleno("Salami+Champiñon");
    }
    
}
