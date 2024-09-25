/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.employeeseries;
import com.mycompany.employeeseries.ver1.BasePlusCommissionEmployee;
import com.mycompany.employeeseries.ver1.HourlyEmployee;

/**
 *
 * @author User
 */
public class EmployeeSeries {

    public static void main(String[] args) {
//          HourlyEmployee hr1 = new HourlyEmployee(41, 100, "Jansen", 1);
//          hr1.displayHourlyEmployee();

//          PieceWorkerEmployee pr1 = new PieceWorkerEmployee(300, 100, "Jansen", 1);
//          pr1.displayHourlyEmployee();

//          CommissionEmployee ce1 = new CommissionEmployee(100000, "Jansen", 1);
//          ce1.displayHourlyEmployee();

            BasePlusCommissionEmployee bpce1 = new BasePlusCommissionEmployee(50000, 500, "Dusky", 1);
            bpce1.displayHourlyEmployee();
            
            HourlyEmployee h1 = new HourlyEmployee(1200, 100, "Dusky Saballa", 10);
            h1.displayHourlyEmployee();
            HourlyEmployee h2 = new HourlyEmployee(1200, 100);
            h2.displayHourlyEmployee();
            HourlyEmployee h3 = new HourlyEmployee("Dusky Saballa", 10);
            h3.displayHourlyEmployee();
    }
}