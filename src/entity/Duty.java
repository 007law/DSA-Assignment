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
public class Duty {
    private static int nextDutyID=4400;
    private int dutyID;
    private String dutyName;
    private int dutyPriority;

    public Duty(){
        this.dutyID=nextDutyID++;
    }
    public Duty(String dutyName,int dutyPriority){
        this.dutyID=nextDutyID++;
        this.dutyName=dutyName;
        this.dutyPriority=dutyPriority;
    }
    
     public int getDutyPriority() {
        return dutyPriority;
    }

    public int getDutyID() {
        return dutyID;
    }

    public void setDutyPriority(int dutyPriority) {
        this.dutyPriority = dutyPriority;
    }
    public static int getNextDutyID() {
        return nextDutyID;
    }

    public static void setNextDutyID(int nextDutyID) {
        Duty.nextDutyID = nextDutyID;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }
    public String toString(){
        return this.dutyName;
    }
    public String toString(boolean getString){
        
        return this.dutyID+"\n"+this.dutyName+"\n"+this.dutyPriority;
    }



   
}
