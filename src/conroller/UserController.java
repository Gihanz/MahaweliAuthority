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
import model.UserModel;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Lahieu
 */
public class UserController {

    public static ArrayList<UserModel> userDetailsTable() throws IOException, JSONException {
        String userName, fullName, email, address, gender, telNo, password, typeOfUser;
        ArrayList<UserModel> arrayList = new ArrayList<>();
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/userPHPfiles/UserGetView.php");
        JSONObject jSONObject = new JSONObject(phpConnection.readData());
        JSONArray array = jSONObject.getJSONArray("server_response");
        for (int i = 0; i < array.length(); i++) {
            JSONObject details = array.getJSONObject(i);
            try {
                userName = String.valueOf(details.getString("userName"));
            } catch (Exception e) {
                userName = null;
            }
            try {
                fullName = String.valueOf(details.getString("fullName"));
            } catch (Exception e) {
                fullName = null;
            }
            try {
                email = String.valueOf(details.getString("email"));
            } catch (Exception e) {
                email = null;
            }
            try {
                address = String.valueOf(details.getString("address"));
            } catch (Exception e) {
                address = null;
            }
            try {
                gender = String.valueOf(details.getString("gender"));
            } catch (Exception e) {
                gender = null;
            }
            try {
                telNo = String.valueOf(details.getString("telNo"));
            } catch (Exception e) {
                telNo = null;
            }
            try {
                password = String.valueOf(details.getString("password"));
            } catch (Exception e) {
                password = null;
            }
            try {
                typeOfUser = String.valueOf(details.getString("typeOfUser"));
            } catch (Exception e) {
                typeOfUser = null;
            }
            UserModel data = new UserModel(userName, fullName, email, address, gender, telNo, password, typeOfUser);
            arrayList.add(data);
        }
        return arrayList;
    }

    public static String addUser(UserModel model) throws IOException {
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/userPHPfiles/InsertUserData.php");
        String data = URLEncoder.encode("userName", "UTF-8") + "=" + URLEncoder.encode(model.getUserName(), "UTF-8") + "&"
                + URLEncoder.encode("fullName", "UTF-8") + "=" + URLEncoder.encode(model.getFullName(), "UTF-8") + "&"
                + URLEncoder.encode("email", "UTF-8") + "=" + URLEncoder.encode(model.getEmail(), "UTF-8") + "&"
                + URLEncoder.encode("address", "UTF-8") + "=" + URLEncoder.encode(model.getAddress(), "UTF-8") + "&"
                + URLEncoder.encode("gender", "UTF-8") + "=" + URLEncoder.encode(model.getGender(), "UTF-8") + "&"
                + URLEncoder.encode("telNo", "UTF-8") + "=" + URLEncoder.encode(model.getTelNo(), "UTF-8") + "&"
                + URLEncoder.encode("password", "UTF-8") + "=" + URLEncoder.encode(model.getPassword(), "UTF-8") + "&"
                + URLEncoder.encode("typeOfUser", "UTF-8") + "=" + URLEncoder.encode(model.getTypeOfUser(), "UTF-8");
        phpConnection.sendData(data);
        return phpConnection.readData();
        
    }

    public static ArrayList<UserModel> searchUser(String UserName) throws IOException, JSONException {
        String data=URLEncoder.encode("userName", "UTF-8")+"="+URLEncoder.encode(UserName, "UTF-8");
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/userPHPfiles/SearchUserByUserName.php");
        phpConnection.sendData(data);
        String response=phpConnection.readData();
        if (response.equals("notExist")) {
            return null;
        }else{
            return getJSONData(response);
        }
    }

    private static ArrayList<UserModel> getJSONData(String response) throws IOException, JSONException {
        String userName, fullName, email, address, gender, telNo, password, typeOfUser;
        ArrayList<UserModel> arrayList=new ArrayList<>();
        final JSONObject jSONObject=new JSONObject(response);
        final JSONArray array=jSONObject.getJSONArray("server_response");
        for (int i = 0; i < array.length(); i++) {
            final JSONObject details=array.getJSONObject(i);
            try{
                userName=String.valueOf(details.getString("userName"));
            }catch(Exception ex ){
                 userName=null;
            }
            try {
                fullName = String.valueOf(details.getString("fullName"));
            } catch (Exception e) {
                fullName = null;
            }
            try {
                email = String.valueOf(details.getString("email"));
            } catch (Exception e) {
                email = null;
            }
            try {
                address = String.valueOf(details.getString("address"));
            } catch (Exception e) {
                address = null;
            }
            try {
                gender = String.valueOf(details.getString("gender"));
            } catch (Exception e) {
                gender = null;
            }
            try {
                telNo = String.valueOf(details.getString("telNo"));
            } catch (Exception e) {
                telNo = null;
            }
            try {
                password = String.valueOf(details.getString("password"));
            } catch (Exception e) {
                password = null;
            }
            try {
                typeOfUser = String.valueOf(details.getString("typeOfUser"));
            } catch (Exception e) {
                typeOfUser = null;
            }
            UserModel model=new UserModel(userName, fullName, email, address, gender, telNo, password, typeOfUser);
            arrayList.add(model);
        }
        return arrayList;
    }

    public static String deleteUser(String user) throws IOException {
        phpConnection.setConnection("http://itmahaweliauthority.net23.net/MahaweliAuthority/userPHPfiles/DeleteUser.php");
        String data=URLEncoder.encode("userName", "UTF-8")+"="+URLEncoder.encode(user, "UTF-8");
        phpConnection.sendData(data);
        return phpConnection.readData();
    }

    
}
