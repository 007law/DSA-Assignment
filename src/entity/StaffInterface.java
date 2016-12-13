/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import adt.LList;

/**
 *
 * @author ThomasLaw
 */
public interface StaffInterface <Staff> {
    public String getStaffName();
    public void setStaffName(String staffName);
    public int getStaffID();
    public LList getStaffRequest();
    public void setStaffRequest(LList staffRequest);
    public String getStaffTask();
    public void setStaffTask(String staffTask);
    public String getStaffStatus();
    public void setStaffStatus(String staffStatus);
    public String getStaffPosition();
    public void setStaffPosition(String staffPosition);
   
}
