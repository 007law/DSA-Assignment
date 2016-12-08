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
    private int arrivalTime;
  private int transactionTime;
  private int customerNumber;
  
  public Staff(int arrivalTime, int transactionTime, int customerNumber) {
    this.arrivalTime = arrivalTime;
    this.transactionTime = transactionTime;
    this.customerNumber = customerNumber;
  }

}
