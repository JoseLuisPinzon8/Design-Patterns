import Restaurant_example.FastFood;
import Restaurant_example.Drink;


public abstract class RestaurantAbstractFactory{
    abstract public FastFood getFastFood( String type );
    abstract public Drink getDrink( String type );
}
