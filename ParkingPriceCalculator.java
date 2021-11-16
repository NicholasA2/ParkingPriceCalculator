/*
 * The MIT License
 *
 * Copyright 2021 Administrator.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package parkingpricecalculator;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author Nicholas Adiohos
 */
public class ParkingPriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Get user input
        Scanner parkingMinutes = new Scanner(System.in);
        System.out.print("Please input the number of minutes your car has parked: ");
        float parkingTimeGot = parkingMinutes.nextFloat();
        
        //Print parking minutes
        System.out.printf("Parking time (minutes) \t\t:%.0f\n", parkingTimeGot);
        
        //Turn into hours
        float parkingHoursStepOne = parkingTimeGot / 60;
        double parkingHoursStepTwo = parkingHoursStepOne + 0.49;
        System.out.printf("Parking time (hour) \t\t:%d\n", Math.round(parkingHoursStepTwo));
        
        //Find price
        float hours = Math.round(parkingHoursStepTwo);
        float price = hours * 2;
        System.out.printf("Price \t\t\t\t:%.2f\n", price);
        
    }
    
}
