package meteo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService()
public class WebServicemeteo {

   @WebMethod(operationName = "getmeteo")
public String getmeteo(String ville) {
    String apiKey = "b48a04d7d50b27f9e2847010cc9bd220";
    String urlString = "http://localhost/meteo_proxy.php?city=" + ville;

    try {
        // System.setProperty inutile ici car ce n’est pas du HTTPS
        URL url = new URL(urlString);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        int responseCode = con.getResponseCode();
        System.out.println("Code réponse : " + responseCode);

        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        StringBuilder response = new StringBuilder();
        String inputLine;

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }

        in.close();
        return response.toString();

    } catch (Exception e) {
        e.printStackTrace();
        return "{\"error\":\"Exception: " + e.toString().replace("\"", "'") + "\"}";
    }
}

}

