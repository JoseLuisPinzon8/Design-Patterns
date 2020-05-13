import Restaurant_example.Hamburger;
import Restaurant_example.FastFood;
import Restaurant_example.HotDog;
import Restaurant_example.Sandwich;

public class FastFoodFactory{
    public FastFood getFastFood( String type ){
        switch( type ){
            case "hamburger": return new Hamburger();
            case "sandwich": return new Sandwich();
            case "hot dog": return new HotDog();
            default: return null;
        }
    }
}