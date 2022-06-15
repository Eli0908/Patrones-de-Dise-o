
package PatronBuilder;

public class AplicacionBuilder {
    public static void main(String[]args){
        
    Cocina cocina=new Cocina();
    PizzaB hawaiana_PizzaB= new PizzaHawaiana();
    PizzaB picante_PizzaB=new PizzaPicante();
    
    cocina.setPizzaB(hawaiana_PizzaB);
    cocina.construirPizza();
    
    Pizza pizza=cocina.getPizza();
    
}
}
