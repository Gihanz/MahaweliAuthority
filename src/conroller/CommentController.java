/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conroller;

import dbConnection.phpConnection;
import java.io.IOException;
import java.util.ArrayList;
import model.CommentModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Lahieu
 */
public class CommentController {

    public static ArrayList<CommentModel> viewComment() throws IOException, JSONException {
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/CommentPHPfiles/CommentGetView.php");
        String feedbackId,userName,typeOfUser,tankName,massage;
        ArrayList<CommentModel> arrayList=new ArrayList<>();
        JSONObject jSONObject=new JSONObject(phpConnection.readData());
        JSONArray array=jSONObject.getJSONArray("server_response");
        for (int i = 0; i < array.length(); i++) {
            JSONObject details=array.getJSONObject(i);
            try{
                feedbackId=String.valueOf(details.getString("feedbackId"));
            }catch(Exception ex){
                feedbackId=null;
            }
            try{
                userName=String.valueOf(details.getString("userName"));
            }catch(Exception ex){
                userName=null;
            }
            try{
                typeOfUser=String.valueOf(details.getString("typeOfUser"));
            }catch(Exception ex){
                typeOfUser=null;
            }
            try{
                tankName=String.valueOf(details.getString("tankName"));
            }catch(Exception ex){
                tankName=null;
            }
            try{
                massage=String.valueOf(details.getString("massage"));
            }catch(Exception ex){
                massage=null;
            }
            CommentModel model=new CommentModel(feedbackId, userName, typeOfUser, tankName, massage);
            arrayList.add(model);
        }
        return arrayList;
    }
    
}
