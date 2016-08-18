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
import model.TankDepthDetailsModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author GIHANZ
 */
public class TankDepthDetailsController {
    
    public static String addTankDepthDetails(TankDepthDetailsModel model) throws IOException {
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/TankLevel/InsertTankDepthDetails.php");
        String data = URLEncoder.encode("time", "UTF-8") + "=" + URLEncoder.encode(model.getTime(), "UTF-8") + "&"
                + URLEncoder.encode("day", "UTF-8") + "=" + URLEncoder.encode(model.getDay(), "UTF-8") + "&"
                + URLEncoder.encode("tankName", "UTF-8") + "=" + URLEncoder.encode(model.getTankName(), "UTF-8") + "&"
                + URLEncoder.encode("tankLevel", "UTF-8")+"="+URLEncoder.encode(model.getTankLevel(), "UTF-8") + "&"
                + URLEncoder.encode("predict", "UTF-8") + "=" + URLEncoder.encode(model.getPredict(), "UTF-8");
        phpConnection.sendData(data);
        return phpConnection.readData();
        
    }
    
    private static ArrayList<TankDepthDetailsModel> getJSONData(String response) throws JSONException {
        String time,day,tankName,tankLevel,predict;
        ArrayList<TankDepthDetailsModel> arrayList=new ArrayList<>();
        JSONObject jSONObject=new JSONObject(response);
        JSONArray array=jSONObject.getJSONArray("server_response");
        for (int i = 0; i < array.length(); i++) {
            JSONObject details=array.getJSONObject(i);
            try{
                time=String.valueOf(details.getString("time"));
            }catch(Exception ex){
                time=null;
            }
            try{
                day=String.valueOf(details.getString("day"));
            }catch(Exception ex){
                day=null;
            }
            try{
                tankName=String.valueOf(details.getString("tankName"));
            }catch(Exception ex){
                tankName=null;
            }
            try{
                tankLevel=String.valueOf(details.getString("tankLevel"));
            }catch(Exception ex){
                tankLevel=null;
            }
            try{
                predict=String.valueOf(details.getString("predict"));
            }catch(Exception ex){
                predict=null;
            }
        TankDepthDetailsModel model=new TankDepthDetailsModel(time, day, tankName, tankLevel, predict);  
        arrayList.add(model);
        }
        return arrayList;
    }
    
    public static ArrayList<TankDepthDetailsModel> tankDepthDetailsTable() throws IOException, JSONException {
        String time,day,tankName,tankLevel,predict;
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/TankLevel/TankLevelGetView.php");
        ArrayList<TankDepthDetailsModel> arrayList=new ArrayList<>();
        JSONObject jSONObject=new JSONObject(phpConnection.readData());
        JSONArray array=jSONObject.getJSONArray("server_response");
        for (int i = 0; i < array.length(); i++) {
            JSONObject details=array.getJSONObject(i);
            try{
                time=String.valueOf(details.getString("time"));
            }catch(Exception ex){
                time=null;
            }
            try{
                day=String.valueOf(details.getString("day"));
            }catch(Exception ex){
                day=null;
            }
            try{
                tankName=String.valueOf(details.getString("tankName"));
            }catch(Exception ex){
                tankName=null;
            }
            try{
                tankLevel=String.valueOf(details.getString("tankLevel"));
            }catch(Exception ex){
                tankLevel=null;
            }
            try{
                predict=String.valueOf(details.getString("predict"));
            }catch(Exception ex){
                predict=null;
            }
        TankDepthDetailsModel model=new TankDepthDetailsModel(time, day, tankName, tankLevel, predict);  
        arrayList.add(model);
        }
        return arrayList;
    }
}
