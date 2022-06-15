
package PatronBuilder;

public class Cocina {
    private PizzaB pizzaB;
    
    public void setPizzaB(PizzaB pb){
        pizzaB=pb;
    }
    public Pizza getPizza(){
        return pizzaB.getPizza();
    }
    
    public void construirPizza(){
        pizzaB.crearNuevaPizza();
        pizzaB.buildMasa();
        pizzaB.buildRelleno();
        pizzaB.buildSalsa();
    } 
}
