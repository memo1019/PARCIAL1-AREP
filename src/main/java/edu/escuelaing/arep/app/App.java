package edu.escuelaing.arep.app;


import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.commons.io.FileUtils;

import java.io.*;
import java.net.*;

import static spark.Spark.*;
/**
 * @author Gullermo CAstro
 */

public class App {
    /**
     *Es la clase principal que llama la pagina web y pone a correr el servicio en esta pagina
     * @param args argumentos para correr
     * */
    public static void main (String[] args) {
        port (getPort());
        get("/clima", (req, res) -> {
            res.type("application/json");
            String function = req.queryParams("lugar");
            String USER_AGENT = "Mozilla/5.0";
            return readURL(function,USER_AGENT);
        });
    }
    /**
     * Methos that reads url input
     * @param agent es el agente del servicio que vamos a correr
     * @param city es la ciudad que se nescesita para saber el clima
     * @return String
     */
    public static String readURL(String city,String agent) throws IOException {
        String sitetoread = "http://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=b334d625411f5b37adfabafe3783cafa";
        URL obj = new URL(sitetoread);
        HttpURLConnection conexion = (HttpURLConnection) obj.openConnection();
        conexion.setRequestMethod("GET");
        conexion.setRequestProperty("User-Agent", agent);

        int Respuesta = conexion.getResponseCode();

        if (Respuesta == HttpURLConnection.HTTP_OK) { // success
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    conexion.getInputStream()));
            String linea;
            StringBuffer repuestaS = new StringBuffer();

            while ((linea = in.readLine()) != null) {
                repuestaS.append(linea);
            }
            in.close();

            return repuestaS.toString();
        } else {
            return null;
        }
    }
    /**
     * Method that returns port service
     * @return int obtiene el intero del puerto que se corre

     */
    public static int getPort() {
        if (System.getenv("PORT") != null)
        {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}