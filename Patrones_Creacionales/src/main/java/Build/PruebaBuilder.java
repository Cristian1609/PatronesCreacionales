package Build;



public class PruebaBuilder {

    public static void main(String[] args) {
        
        Cocina cocina = new Cocina();
        PizzaBuilder  hawaiPizza = new HawaiPizzaBuilder();
        PizzaBuilder picantePizza = new PicantePizzaBuilder();
        
        cocina.setPizzaBuilder(picantePizza);
        cocina.setPizzaBuilder(hawaiPizza);
        cocina.ConstruirPizza();
        
        Pizza pizza = cocina.getPizza();
        
        System.out.println(pizza);
    }

}
