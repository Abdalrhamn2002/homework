/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homeworkjava;

/**
 *
 * @author Al_Ma
 */
public class CurrencyConverter {
    private double rate;

    public void setExchangeRate(double rate) {
        this.rate = rate;
    }

    public double convert(double amount) {
        return amount * rate;
    }
    
}
