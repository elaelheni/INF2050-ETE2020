import net.sf.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Principale {

    public static void main (String args[]){
        int x = 5;
        int y = 76;
        System.out.printf("Avant permutation : %n x:%d y:%d %n",x ,y);
        int temp = x;
        x = y;
        y = temp;
        System.out.printf("Apres permutation : %n x:%d y:%d %n",x ,y);

    }

    //méthode qui utilise la librairie json-lib
    public static JSONObject fromStringToJSON (String json) throws ParseException {
        JSONParser parser = new JSONParser();
        JSONObject object = (JSONObject)parser.parse(json);
        return object;

    }

}
