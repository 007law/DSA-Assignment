/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ThomasLaw
 */
public class Staff {
    private static int nextStaffID=1000;
  private String staffName;
  private int staffID;
  private String staffRequest;
  private String staffTask;
  private String staffStatus;
  private String staffPosition;
  
  public Staff(int staffID,String staffName, String staffRequest, String staffTask, String staffStatus, String staffPosition) {
    this.staffID=nextStaffID++;
    this.staffRequest=staffRequest;
    this.staffName=staffName;
    this.staffTask=staffTask;
    this.staffStatus=staffStatus;
    this.staffPosition=staffPosition;
    
  }

    public static int getNextStaffID() {
        return nextStaffID;
    }

    public static void setNextStaffID(int nextStaffID) {
        Staff.nextStaffID = nextStaffID;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public int getStaffID() {
        return staffID;
    }


    public String getStaffRequest() {
        return staffRequest;
    }

    public void setStaffRequest(String staffRequest) {
        this.staffRequest = staffRequest;
    }

    public String getStaffTask() {
        return staffTask;
    }

    public void setStaffTask(String staffTask) {
        this.staffTask = staffTask;
    }

    public String getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

}
