import java.util.StringTokenizer;

public class Stringclass8 {

    public static void main(String[] args) {
        String input = "key1=value1;key2=value2;key3=value3";
        StringTokenizer st = new StringTokenizer(input, ";");
        while (st.hasMoreTokens()) {
            String pair = st.nextToken();
            String[] keyValue = pair.split("=");
            String key = keyValue[0];
            String value = keyValue[1];
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

}
