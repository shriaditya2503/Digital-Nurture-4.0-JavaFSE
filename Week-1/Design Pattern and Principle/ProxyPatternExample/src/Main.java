import com.aditya.Image;
import com.aditya.ProxyImage;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("img1.jpg");
        image1.display();

        Image image2 = new ProxyImage("img2.jpg");
        image2.display();

        System.out.println();

        image1.display();
        image2.display();
    }
}