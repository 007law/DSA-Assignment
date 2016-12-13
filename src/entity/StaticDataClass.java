/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import adt.LList;

public class StaticDataClass {
    public static LList<Staff> staticStaffList=new LList();
    public static LList<Duty> staticDutyList=new LList();
    public static LList<StaffDutyAssign> staticStaffDutyAssignList=new LList();
    LList<String> requestDay1=new LList();
    LList<String> requestDay2=new LList();
    LList<String> requestDay3=new LList();
    public StaticDataClass(){
        
        requestDay1.add("Sunday");
        requestDay1.add("Monday");
        requestDay2.add("Wednesday");
        requestDay2.add("Saturday");
        requestDay3.add("Sunday");
        //Add sample data staff 1
        Staff tempStaff=new Staff("Thomas Law",requestDay1,"Play Dota","Available","Team Leader");
        staticStaffList.add(tempStaff);
        //Add sample data staff 2
        Staff tempStaff2=new Staff("Law Chin Beng",requestDay2,"Sleeping","Engaged","Front Line");
        staticStaffList.add(tempStaff2);
        //Add sample data staff 3
        tempStaff=new Staff("Kok Seong Wai",requestDay3,"Programming","Available","Front Line");
        staticStaffList.add(tempStaff);
        //Add sample data staff 4
         tempStaff2=new Staff("Kok Hao Guang",requestDay1,"Eating and Drinking","Available","Front Line");
        staticStaffList.add(tempStaff2);
        //Add sample data staff 5
        tempStaff=new Staff("Kong Yi Ting",requestDay2,"Allocate Safe House","Engaged","Front Line");
        staticStaffList.add(tempStaff);
        //Add sample data duty 1
        Duty tempDuty=new Duty("Distribute Food Supply",2);
        staticDutyList.add(tempDuty);
        Duty tempDuty2=new Duty("Front line supporter",1);
        staticDutyList.add(tempDuty2);
        
        
    }
}
