/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conroller;

import dbConnection.phpConnection;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import javax.swing.JTextField;
import model.TankModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Lahieu
 */
public class TankController {
    
    public static String addTank(TankModel model) throws IOException {
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/TankPHPfiles/InsertTank.php");
        String data = URLEncoder.encode("tankName", "UTF-8") + "=" + URLEncoder.encode(model.getTankName(), "UTF-8") + "&"
                + URLEncoder.encode("tankEngineer", "UTF-8") + "=" + URLEncoder.encode(model.getTankEngineer(), "UTF-8") + "&"
                + URLEncoder.encode("tankDetails", "UTF-8") + "=" + URLEncoder.encode(model.getTankDetails(), "UTF-8") + "&"
                + URLEncoder.encode("maxDepth", "UTF-8")+"="+URLEncoder.encode(Integer.toString(model.getMaxDepth()), "UTF-8");
        phpConnection.sendData(data);
        return phpConnection.readData();
        
    }

    public static ArrayList<TankModel> searchTank(String tankN) throws IOException, JSONException {
        String data=URLEncoder.encode("tankName","UTF-8")+"="+URLEncoder.encode(tankN,"UTF-8");
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/TankPHPfiles/SearchTankByTankId.php");
        phpConnection.sendData(data);
        String response=phpConnection.readData();
        
        if (response.equals("notExist")) {
           return null; 
        }else{
            return getJSONData(response);
        }
    }

    private static ArrayList<TankModel> getJSONData(String response) throws JSONException {
        String TankName,TankEnginner,TankDetails;
        int MaxDepth;
        ArrayList<TankModel> arrayList=new ArrayList<>();
        JSONObject jSONObject=new JSONObject(response);
        JSONArray array=jSONObject.getJSONArray("server_response");
        for (int i = 0; i < array.length(); i++) {
            JSONObject details=array.getJSONObject(i);
            try{
                TankName=String.valueOf(details.getString("tankName"));
            }catch(Exception ex){
                TankName=null;
            }
            try{
                TankEnginner=String.valueOf(details.getString("tankEngineer"));
            }catch(Exception ex){
                TankEnginner=null;
            }
            try{
                TankDetails=String.valueOf(details.getString("tankDetails"));
            }catch(Exception ex){
                TankDetails=null;
            }
            try{
                MaxDepth=Integer.parseInt(String.valueOf(details.getString("maxDepth")));
            }catch(Exception ex){
                MaxDepth=0;
            }
        TankModel model=new TankModel(TankName, TankEnginner, TankDetails, MaxDepth);  
        arrayList.add(model);
        }
        return arrayList;
    }



    public static String updateTank(TankModel model) throws IOException {
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/TankPHPfiles/UpdateTank.php");
        String data=URLEncoder.encode("tankName", "UTF-8")+"="+URLEncoder.encode(model.getTankName(), "UTF-8")+"&"
                +URLEncoder.encode("tankEngineer", "UTF-8")+"="+URLEncoder.encode(model.getTankEngineer(), "UTF-8")+"&"
                +URLEncoder.encode("tankDetails", "UTF-8")+"="+URLEncoder.encode(model.getTankDetails(), "UTF-8")+"&"
                +URLEncoder.encode("maxDepth", "UTF-8")+"="+URLEncoder.encode(Integer.toString(model.getMaxDepth()), "UTF-8");
        phpConnection.sendData(data);
        return phpConnection.readData();
        
    }

    public static ArrayList<TankModel> tankTable() throws IOException, JSONException {
        String TankName,TankEnginner,TankDetails;
        int MaxDepth;
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/TankPHPfiles/TankrGetView.php");
        ArrayList<TankModel> arrayList=new ArrayList<>();
        JSONObject jSONObject=new JSONObject(phpConnection.readData());
        JSONArray array=jSONObject.getJSONArray("server_response");
        for (int i = 0; i < array.length(); i++) {
            JSONObject details=array.getJSONObject(i);
            try{
                TankName=String.valueOf(details.getString("tankName"));
            }catch(Exception ex){
                TankName=null;
            }
            try{
                TankEnginner=String.valueOf(details.getString("tankEngineer"));
            }catch(Exception ex){
                TankEnginner=null;
            }
            try{
                TankDetails=String.valueOf(details.getString("tankDetails"));
            }catch(Exception ex){
                TankDetails=null;
            }
            try{
                MaxDepth=Integer.parseInt(String.valueOf(details.getString("maxDepth")));
            }catch(Exception ex){
                MaxDepth=0;
            }
            TankModel model=new TankModel(TankName, TankEnginner, TankDetails, MaxDepth);
            arrayList.add(model);
        }
        return arrayList;
    }

    public static ArrayList<TankModel> searchTank(JTextField tankName) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   public static String deleteTank(String TankN) throws IOException {
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/TankPHPfiles/DeleteTank.php");
        String data=URLEncoder.encode("TankName", "UTF-8")+"="+URLEncoder.encode(TankN, "UTF-8");
        phpConnection.sendData(data);
        return phpConnection.readData();
    } 
    
    
}
