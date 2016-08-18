/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lahieu
 */
public class CommentModel {
    private String commentId;
    private String userName;
    private String typeOfUser;
    private String tankId;
    private String massage;

    public CommentModel(String commentId, String userName, String typeOfUser, String tankId, String massage) {
        this.commentId = commentId;
        this.userName = userName;
        this.typeOfUser = typeOfUser;
        this.tankId = tankId;
        this.massage = massage;
    }
    /**
     * @return the commentId
     */
    public String getCommentId() {
        return commentId;
    }

    /**
     * @param commentId the commentId to set
     */
    public void setCommentId(String commentId) {
        this.commentId = commentId;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getTypeOfUser() {
        return typeOfUser;
    }

    /**
     * @param userName the userName to set
     */
    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }

    /**
     * @return the tankId
     */
    public String getTankId() {
        return tankId;
    }

    /**
     * @param tankId the tankId to set
     */
    public void setTankId(String tankId) {
        this.tankId = tankId;
    }

    /**
     * @return the massage
     */
    public String getMassage() {
        return massage;
    }

    /**
     * @param massage the massage to set
     */
    public void setMassage(String massage) {
        this.massage = massage;
    }
    
    
    
}
