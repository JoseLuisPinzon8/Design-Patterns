import Restaurant_example.Pizza;
import Restaurant_example.Beer;
import Restaurant_example.Juice;
import Restaurant_example.Drink;
import Restaurant_example.FastFood;


public class Restaurant2Factory extends RestaurantAbstractFactory{

    @Override
    public FastFood getFastFood( String type ){
        switch( type ){
            case "pizza": return new Pizza();
            default: return null;
        }
    }

    public Drink getDrink( String type ){
        switch( type ){
            case "juice": return new Juice();
            case "beer": return new Beer();
            default: return null;
        }
    }
}