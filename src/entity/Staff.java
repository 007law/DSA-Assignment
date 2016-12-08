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

}
