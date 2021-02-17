package edu.escuelaing.arep.app;


import java.io.*;
import java.net.*;

import static spark.Spark.*;
/**
 * @author Gullermo CAstro
 */

public class App {
    /**
     * Method that does the connection and takes data
     * @param args
     */
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
     * @param agent
     * @return
     */
    public static String readURL(String city,String agent) throws IOException {
        String sitetoread = "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid=b334d625411f5b37adfabafe3783cafa";
        URL obj = new URL(sitetoread);
        HttpURLConnection conexion = (HttpURLConnection) obj.openConnection();
        int  Respuesta= conexion.getResponseCode();
        conexion.setRequestProperty("User-Agent", agent);
        conexion.setRequestMethod("GET");
        if (Respuesta == HttpURLConnection.HTTP_OK) {
            StringBuffer repuestaS = new StringBuffer();
            String ingreso;
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    conexion.getInputStream()));

            while ((ingreso = in.readLine()) != null) {
                repuestaS.append(ingreso);
            }
            in.close();
            return repuestaS.toString();
        } else {
            return null;
        }
    }
    /**
     * Method that returns port service
     * @return
     */
    public static int getPort() {
        if (System.getenv("PORT") != null)
        {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }
}