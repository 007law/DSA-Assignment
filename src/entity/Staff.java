/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import adt.LList;
import adt.Node;
import static entity.StaticDataClass.staticStaffList;


/**
 *
 * @author ThomasLaw
 */
public class Staff implements StaffInterface<Staff>{
  private static int nextStaffID=5300;
  private String staffName;
  private int staffID;
  private LList staffRequest;
  private String staffTask;
  private String staffStatus;
  private String staffPosition;
  private String staffHomePhoneNo;
  private String staffMalaysiaResidentNRIC;
  private int age;
  private String zodiac;

  
  public Staff(){
       this.staffID=nextStaffID++;
  }
  public Staff(String staffName, LList staffRequest, String staffTask, String staffStatus, String staffPosition) {
    this.staffID=nextStaffID++;
    this.staffRequest=staffRequest;
    this.staffName=staffName;
    this.staffTask=staffTask;
    this.staffStatus=staffStatus;
    this.staffPosition=staffPosition;
    
  }

    public Staff(String staffName, int staffID, LList staffRequest, String staffTask, String staffStatus, String staffPosition, String staffTel, String staffIC) {
        this.staffName = staffName;
        this.staffID = staffID;
        this.staffRequest = staffRequest;
        this.staffTask = staffTask;
        this.staffStatus = staffStatus;
        this.staffPosition = staffPosition;
        this.staffHomePhoneNo = staffTel;
        this.staffMalaysiaResidentNRIC = staffIC;

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


    public LList getStaffRequest() {
        return staffRequest;
    }

    public void setStaffRequest(LList staffRequest) {
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
    
    public String toString(){
        return this.staffName;
         }
    
     public String toString(boolean getString){
         return "\n"+this.staffID+"\n"+this.staffName+"\n"+this.staffRequest.toString()+this.staffPosition+"\n"+this.staffTask+"\n"+this.staffStatus;
          
    }


    public void sortForStatus() {
       boolean sorted = false;
    for (int pass = 1; pass < staticStaffList.getNumberOfEntries() && !sorted; pass++) {
      sorted = true;
      for (int index = 0; index < staticStaffList.getNumberOfEntries() - pass; index++) {
        String status1=staticStaffList.getEntry(index+1).getStaffStatus();
        String status2=staticStaffList.getEntry(index+2).getStaffStatus();
        //System.out.println(tempName+"\n"+tempName2);
        if (status1.compareTo(status2)>0) {
          swap(index+1, index + 2); 
          sorted = false; 
        }
      } 																// trace statement
    } 
    
    }
    public static void swap(int first, int second) {
    staticStaffList.swap(first, second);
  }
    public void sortForName(){
     boolean sorted = false;
    for (int pass = 1; pass < staticStaffList.getNumberOfEntries() && !sorted; pass++) {
      sorted = true;
      for (int index = 0; index < staticStaffList.getNumberOfEntries() - pass; index++) {
        String tempName=staticStaffList.getEntry(index+1).getStaffName();
        String tempName2=staticStaffList.getEntry(index+2).getStaffName();
        //System.out.println(tempName+"\n"+tempName2);
        if (tempName.compareTo(tempName2)>0) {
          swap(index+1, index + 2); 
          sorted = false; 
        }
      } 																// trace statement
    } 
  
    }



  

    

   

}
