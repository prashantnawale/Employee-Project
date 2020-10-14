/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employeee;

/**
 *
 * @author Admin
 */
import java.sql.*;

public class conn
{
    
    public Connection c;
    public Statement s;
 
    public conn()
    {
        try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
                    c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "prashant");
                    s = c.createStatement();
            }catch(Exception e) 
                {
                e.printStackTrace();
                }
    }
     public static void main(String[] args)
    {
      // Emp_man_sys e=new Emp_man_sys();
    }
}