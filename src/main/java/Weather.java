import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by Sergey
 */
public class Weather {
    
    public  static String getWeather(String message,Model model) throws IOException {
        URL url =new URL("http://api.openweathermap.org/data/2.5/weather?q="+ message +"&units=metric&appid=80ff418199a1234f3b8b603774b65b45");
        Scanner in =new Scanner((InputStream) url.getContent());
        String result ="";
        while (in.hasNext()){
            result +=in.nextLine();
        }
        return result;
    }

}
