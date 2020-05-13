import Restaurant_example.*;

public class Restaurant {
    
    public static void main(String[] args){
        RestaurantFactoryProducer restaurantFactoryProducer = new RestaurantFactoryProducer();
        int numRestaurant = 2;
        RestaurantAbstractFactory restaurantAbstractFactory = restaurantFactoryProducer.getRestaurantAbstractFactory( numRestaurant );
        
        Drink beer = restaurantAbstractFactory.getDrink("beer");
        FastFood pizza = restaurantAbstractFactory.getFastFood("pizza");

        beer.pour();
        pizza.serve();
    }
}