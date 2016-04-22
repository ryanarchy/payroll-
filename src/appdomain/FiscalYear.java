/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appdomain;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ryanarchy
 */
public class FiscalYear
{
    List<HashMap<Date, Double>> payPeriods = 
            new ArrayList<HashMap<Date, Double>>();
    short year;
    
    Calendar cal = Calendar.getInstance();
    
    // RYAN
    public FiscalYear(short year)
    {
        this.year = year;
        cal.set(Calendar.YEAR, (int) this.year);
        cal.set(Calendar.DAY_OF_YEAR, 1);
        
    }
    
    // RYAN
    public FiscalYear(String year)
    {
        this.year = Short.parseShort(year);
        cal.set(Calendar.YEAR, (int) this.year);
        cal.set(Calendar.DAY_OF_YEAR, 1);
    }
    
    // RYAN
    public FiscalYear(Date year)
    {
        cal.setTime(year);
        this.year = (short) cal.get(Calendar.YEAR);
        cal.set(Calendar.YEAR, (int) this.year);
        cal.set(Calendar.DAY_OF_YEAR, 1);
    }
    
    public HashMap<Date,Double> getPeriod(short period)
    {
         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.       
    }
    
    public void setPeriodHours(char period, double[] hours)
    {
        
    }
    
    public void setDateHours(Date date, double hours)
    {
        
    }
    public double getDateHours(Date date)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * this function will return the current year of this fiscal calendar as a 
     * date object
     * @return java.util.Date type
     */
    public Date getYear()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.        
    }
    
    public double getPeriodHours(short period)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getPeriodOvertime(short period)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getPeriodDoubletime(short period)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * this function will return the total amount of hours worked for this
     * fiscal year object
     * @return 
     */
    public double getTotalHours()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getDoubletimeHours()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public double getOvertimeHours()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
