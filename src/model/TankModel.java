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
public class TankModel {

    private String tankName;
    private String tankEngineer;
    private String tankDetails;
    private int maxDepth;

    public TankModel(String tankNmae, String tankEngineer, String tankDetails, int maxDepth) {
        this.tankName = tankNmae;
        this.tankEngineer = tankEngineer;
        this.tankDetails = tankDetails;
        this.maxDepth = maxDepth;
    }

    /**
     * @return the tankId
     */
    /**
     * @param tankId the tankId to set
     */
    /**
     * @return the tankNmae
     */
    public String getTankName() {
        return tankName;
    }

    /**
     * @param tankNmae the tankNmae to set
     */
    public void setTankName(String tankNmae) {
        this.tankName = tankNmae;
    }

    /**
     * @return the tankEngineer
     */
    public String getTankEngineer() {
        return tankEngineer;
    }

    /**
     * @param tankEngineer the tankEngineer to set
     */
    public void setTankEngineer(String tankEngineer) {
        this.tankEngineer = tankEngineer;
    }

    /**
     * @return the tankDetails
     */
    public String getTankDetails() {
        return tankDetails;
    }

    /**
     * @param tankDetails the tankDetails to set
     */
    public void setTankDetails(String tankDetails) {
        this.tankDetails = tankDetails;
    }

    /**
     * @return the maxDepth
     */
    public int getMaxDepth() {
        return maxDepth;
    }

    /**
     * @param maxDepth the maxDepth to set
     */
    public void setMaxDepth(int maxDepth) {
        this.maxDepth = maxDepth;
    }

}
