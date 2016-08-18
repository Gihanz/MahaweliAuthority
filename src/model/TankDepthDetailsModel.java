/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author GIHANZ
 */
public class TankDepthDetailsModel {
   
    private String time;
    private String day;
    private String tankName;
    private String tankLevel;
    private String predict;

    public TankDepthDetailsModel(String time, String day, String tankName, String tankLevel, String predict) {
        this.time = time;
        this.day = day;
        this.tankName = tankName;
        this.tankLevel = tankLevel;
        this.predict = predict;
    }

    /**
     * @return the tankId
     */
    /**
     * @param tankId the tankId to set
     */
    /**
     * @return the time
     */
    public String getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * @return the day
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the tankName
     */
    public String getTankName() {
        return tankName;
    }

    /**
     * @param tankName the tankName to set
     */
    public void setTankName(String tankName) {
        this.tankName = tankName;
    }

    /**
     * @return the tankLevel
     */
    public String getTankLevel() {
        return tankLevel;
    }

    /**
     * @param tankLevel the tankLevel to set
     */
    public void setTankLevel(String tankLevel) {
        this.tankLevel = tankLevel;
    }
    
    public String getPredict() {
        return predict;
    }

    /**
     * @param predict the predict to set
     */
    public void setPredict(String predict) {
        this.predict = predict;
    }

}
