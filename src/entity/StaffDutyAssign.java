/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import adt.LList;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

/**
 *
 * @author ThomasLaw
 */
public class StaffDutyAssign {
    private int nextStaffDutyID=1000;
    private int staffDutyID;
    private LList<Staff> staff=new LList();
    private Duty duty;
    private GregorianCalendar beginDay;
    private GregorianCalendar endDay;
    private String staffDutyStatus;
    
    public StaffDutyAssign(){
        this.staffDutyID=nextStaffDutyID++;
    }
    public StaffDutyAssign(LList staff,Duty duty,GregorianCalendar beginDay,GregorianCalendar endDay,String staffDutyStatus){
        this.staffDutyID=nextStaffDutyID++;
        this.staff=staff;
        this.duty=duty;
        this.beginDay=beginDay;
        this.endDay=endDay;
        this.staffDutyStatus=staffDutyStatus;
    }

    public int getNextStaffDutyID() {
        return nextStaffDutyID;
    }

    public void setNextStaffDutyID(int nextStaffDutyID) {
        this.nextStaffDutyID = nextStaffDutyID;
    }

    public int getStaffDutyID() {
        return staffDutyID;
    }

    public void setStaffDutyID(int staffDutyID) {
        this.staffDutyID = staffDutyID;
    }

    public LList getStaff() {
        return staff;
    }

    public void setStaff(LList staff) {
        this.staff = staff;
    }

    public Duty getduty() {
        return duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }

    public GregorianCalendar getBeginDay() {
        return beginDay;
    }

    public void setBeginDay(GregorianCalendar beginDay) {
        this.beginDay = beginDay;
    }

    public GregorianCalendar getEndDay() {
        return endDay;
    }

    public void setEndDay(GregorianCalendar endDay) {
        this.endDay = endDay;
    }

    public String getStaffDutyStatus() {
        return staffDutyStatus;
    }

    public void setStaffDutyStatus(String staffDutyStatus) {
        this.staffDutyStatus = staffDutyStatus;
    }
    
    public String toString(){
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
        String staffName="";
        for(int i=0;i<staff.getNumberOfEntries();i++){
            //System.out.println(staff.getNumberOfEntries());
            staffName=staffName+staff.getEntry(i+1).getStaffName()+" ";
        }
        return this.staffDutyID+"\n"+staffName+"\n"+this.duty.getDutyName()+"\n"+sdf.format(this.beginDay.getTime())+"\n"+sdf.format(this.endDay.getTime())+"\n"+this.staffDutyStatus;
    }
   
}
