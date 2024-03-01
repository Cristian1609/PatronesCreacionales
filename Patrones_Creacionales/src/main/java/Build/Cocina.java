
package Build;


public class Cocina {
    
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public PizzaBuilder getPizzaBuilder() {
        return pizzaBuilder;
    }
    
    public Pizza getPizza(){
        return pizzaBuilder.getPizza();
    }
    
    public void ConstruirPizza(){
        pizzaBuilder.crearPizza();
        pizzaBuilder.buildMasa();
        pizzaBuilder.buildSalsa();
        pizzaBuilder.buildRelleno();
    }
    
    
}
