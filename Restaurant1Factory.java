import Restaurant_example.Hamburger;
import Restaurant_example.Sandwich;
import Restaurant_example.HotDog;
import Restaurant_example.Soda;
import Restaurant_example.Drink;
import Restaurant_example.FastFood;


public class Restaurant1Factory extends RestaurantAbstractFactory{

    @Override
    public FastFood getFastFood( String type ){
        switch( type ){
            case "hamburger": return new Hamburger();
            case "sandwich": return new Sandwich();
            case "hot dog": return new HotDog();
            default: return null;
        }
    }

    @Override
    public Drink getDrink( String type ){
        switch( type ){
            case "soda": return new Soda();
            default: return null;
        }
    }
}