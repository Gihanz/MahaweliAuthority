/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author Lahieu
 */
public class phpConnection {

    static URL u1l;
    static URLConnection uRLConnection;
    static BufferedReader in;
    static OutputStreamWriter outputStreamWriter;

    public static URLConnection setConnection(String set) throws MalformedURLException, IOException {
        u1l = new URL(set);
        return uRLConnection = u1l.openConnection();
    }
    public static void sendData(String data) throws IOException{
        uRLConnection.setDoOutput(true);
        outputStreamWriter=new OutputStreamWriter(uRLConnection.getOutputStream());
        outputStreamWriter.write(data);
        outputStreamWriter.flush();
    }

    public static String readData() throws IOException {
        String response = "", line;
        in = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
        while ((line = in.readLine()) != null) {
            response += line;
        }
        in.close();
        return response;
    }
    
}
