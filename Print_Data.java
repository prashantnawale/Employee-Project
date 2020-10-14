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
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Print_Data implements ActionListener{
    JFrame f;
    JLabel id8,id,aid,id1,aid1,id2,aid2,id3,aid3,id4,aid4,id5,aid5,id6,aid6,id7,aid7,id9,id10,id11,id12,id13,id14,id15,id16,id17,lab,aid8,aid9,aid10,aid11,aid12,aid13,aid14,aid15;
    String emp_id,firstname,lastname,address,mobileno,nominy,policy,post,age,dob,aadhar,branch,joiningdate,panno;
    JButton b1,b2;
    ImageIcon icon;

    Print_Data(String e_id){
        try{
            conn con = new conn();
            String str = "select * from employee where employeeid = '"+e_id+"'";
            ResultSet rs= con.s.executeQuery(str);

            while(rs.next()){

               
                branch = rs.getString("branchname");
                joiningdate = rs.getString("joiningdate");
                firstname = rs.getString("firstname");
                lastname = rs.getString("lastname");
                age = rs.getString("age");
                dob = rs.getString("DateOfBirth");
                address = rs.getString("address");
                post = rs.getString("jobpost");
                panno = rs.getString("panno");
                aadhar = rs.getString("adharno");
                emp_id = rs.getString("employeeid");
                policy =rs.getString("policy");
                mobileno =rs.getString("mobileno");
                nominy =rs.getString("nominy"); 
            }
        }catch(Exception e){
            e.printStackTrace();
        }
 
        f=new JFrame("Print Data");
        f.setVisible(true);
        f.setSize(600,800);
        f.setLocation(400,20);
        f.setBackground(Color.white);
        f.setLayout(null);


        id9=new JLabel();
        id9.setBounds(0,0,900,750);
        id9.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/print.jpg"));
        id9.setIcon(img);

        id8 = new JLabel("Employee Details");
        id8.setBounds(50,10,250,30);
        f.add(id8);
        id8.setFont(new Font("serif",Font.BOLD,25));
        id9.add(id8);
        f.add(id9);

        id = new JLabel("Employee Id:");
        id.setBounds(50,70,120,30);
        id.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id);

        aid = new JLabel(emp_id);
        aid.setBounds(200,70,200,30);
        aid.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid);

        id1 = new JLabel("branch Name:");
        id1.setBounds(50,120,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id1);

        aid1 = new JLabel(branch);
        aid1.setBounds(200,120,300,30);
        aid1.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid1);

  
        id2 = new JLabel("joining Date:"); 
        id2.setBounds(50,170,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id2);

        aid2 = new JLabel(joiningdate);
        aid2.setBounds(200,170,300,30);
        aid2.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid2);

        id3= new JLabel("First Name:");
        id3.setBounds(50,220,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id3);

        aid3= new JLabel(firstname);
        aid3.setBounds(200,220,300,30);
        aid3.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid3);


        id4= new JLabel("Last Name:");  
        id4.setBounds(50,270,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id4);

        aid4= new JLabel(lastname);
        aid4.setBounds(200,270,300,30); 
        aid4.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid4);

        
        id5= new JLabel("Age:");
        id5.setBounds(50,320,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id5);

        aid5= new JLabel(age);
        aid5.setBounds(200,320,300,30);
        aid5.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid5);

        
        id6= new JLabel("Date Of Birth:");
        id6.setBounds(50,370,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id6);

        aid6= new JLabel(dob);
        aid6.setBounds(200,370,300,30); 
        aid6.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid6);


        id7= new JLabel("Address:");
        id7.setBounds(50,420,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id7);

        aid7= new JLabel(address);
        aid7.setBounds(150,420,300,30);
        aid7.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid7);
        
        
        id8= new JLabel("Job Post:");
        id8.setBounds(50,470,100,30);
        id8.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id8);

        aid8= new JLabel(post);
        aid8.setBounds(150,470,300,30);
        aid8.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid8);

        id10= new JLabel("Pan No:");
        id10.setBounds(50,520,100,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id10);

        aid10= new JLabel(panno);
        aid10.setBounds(150,520,300,30);
        aid10.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid10);
        
        
        id11= new JLabel("Adhar No:");
        id11.setBounds(50,570,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id11);

        aid11= new JLabel(aadhar);
        aid11.setBounds(150,570,300,30);
        aid11.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid11);
        
        id12= new JLabel("Policy:");
        id12.setBounds(350,470,100,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id12);

        aid12= new JLabel(policy);
        aid12.setBounds(450,470,300,30);
        aid12.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid12);
        
        
          id13= new JLabel("Mobile No:");
        id13.setBounds(350,520,100,30);
        id13.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id13);

        aid13= new JLabel(mobileno);
        aid13.setBounds(450,520,300,30);
        aid13.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid13);
        
        
         
          id14= new JLabel("Nominy:");
        id14.setBounds(350,570,100,30);
        id14.setFont(new Font("serif",Font.BOLD,20));
        id9.add(id14);

        aid14= new JLabel(nominy);
        aid14.setBounds(450,570,300,30);
        aid14.setFont(new Font("serif",Font.BOLD,20));
        id9.add(aid14);
        
        
        
        
        
        
        b1=new JButton("Print");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(100,630,100,30);
        b1.addActionListener(this);
        id9.add(b1);

        b2=new JButton("cancel");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(250,630,100,30);
        b2.addActionListener(this);
        id9.add(b2);


    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            JOptionPane.showMessageDialog(null,"printed successfully");
            f.setVisible(false);
            details d=new details();
        }
        if(ae.getSource()==b2){
            f.setVisible(false);
            new View_Employee();
        }
    }
    public static void main(String[] args){
        new Print_Data("Print Data");
    }

}