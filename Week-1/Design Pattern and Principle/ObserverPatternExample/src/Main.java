import com.aditya.MobileApp;
import com.aditya.Observer;
import com.aditya.StockMarket;
import com.aditya.WebApp;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobile1 = new MobileApp("Android");
        Observer mobile2 = new MobileApp("iOS");
        Observer web1 = new WebApp("Browser");

        market.registerObserver(mobile1);
        market.registerObserver(mobile2);
        market.registerObserver(web1);

        market.setStockPrice(150.25);
        market.setStockPrice(155.75);

        market.removeObserver(mobile2);

        market.setStockPrice(160.10);
    }
}