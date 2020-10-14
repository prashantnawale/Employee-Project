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
import java.sql.*;
import javax.swing.*;
import java.awt.event.*;

class Update_Employee extends Add_Employee implements ActionListener{

    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,id18,id19,id20,lab,lab1;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
    JButton b,b1,b2,b3; 
    String id_emp;

    Update_Employee(String idaa){
        super(0);
        f=new JFrame("update Employee details");
        f.setVisible(true);
        f.setSize(900,500);
        f.setLocation(450,250);
        f.setBackground(Color.white);
        f.setLayout(null);

        id_emp=idaa;    
        id15=new JLabel();
        id15.setBounds(0,0,1100,900);
        id15.setLayout(null);
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("Employeee/icons/add_employee.jpg"));
        id15.setIcon(img);

        id8 = new JLabel("Update Employee Detail:");
        id8.setBounds(50,10,500,50);
        id8.setFont(new Font("serif",Font.ITALIC,40));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);


        id1 = new JLabel("Branch Name:");  
        id1.setBounds(50,100,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,100,150,30);
        id15.add(t1);

        id2 = new JLabel("Joining Date:");
        id2.setBounds(400,100,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,100,150,30);
        id15.add(t2);

        id3= new JLabel("First Name:");
        id3.setBounds(50,150,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,150,150,30);
        id15.add(t3);

        id4= new JLabel("Last Name:");
        id4.setBounds(400,150,100,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,150,150,30);   
        id15.add(t4);

        id5= new JLabel("Age:");
        id5.setBounds(50,200,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,200,150,30);
        id15.add(t5);

        id6= new JLabel("Date of Birth:");
        id6.setBounds(400,200,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,200,150,30);
        id15.add(t6);

        id7= new JLabel("Address:");
        id7.setBounds(50,250,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,250,150,30);
        id15.add(t7);

        id9= new JLabel("Job Post:");
        id9.setBounds(400,250,100,30);  
        id9.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,250,150,30);
        id15.add(t8);

        id10= new JLabel("Pan NO:");
        id10.setBounds(50,300,150,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);
        
        
               
        t9=new JTextField();
        t9.setBounds(200,300,150,30);
        id15.add(t9);
        
        
        id11=new JLabel("Adhar Card:");
        id11.setBounds(400,300,150,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);
        
        t10=new JTextField();
        t10.setBounds(600,300,150,30);
        id15.add(t10);
        
        
         id12= new JLabel("Employee Id:");
        id12.setBounds(50,350,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);
        
        
      
        
        t11=new JTextField();
        t11.setBounds(200,350,150,30);
        id15.add(t11);
        
        
        id13=new JLabel("Policy:");
        id13.setBounds(400,350,150,30);
        id13.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id13);
        
        t12=new JTextField();
        t12.setBounds(600,350,150,30);
        id15.add(t12);
        
        id14= new JLabel("Mobile NO:");
        id14.setBounds(50,400,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        
        id15.add(id14);
        
        
        t13=new JTextField();
        t13.setBounds(200,400,150,30);
        id15.add(t13);
        
        
        id16=new JLabel("Nominy:");
        id16.setBounds(400,400,150,30);
        id16.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id16);
        
        t14=new JTextField();
        t14.setBounds(600,400,150,30);
        id15.add(t14);
        
        f.setVisible(false);

        b=new JButton("Update");
        b.setBounds(300,450,100,30);
        b.addActionListener(this);
        id15.add(b);

        b1=new JButton("Cancel");
        b1.setBounds(500,450,100,30);
        b1.addActionListener(this);
        id15.add(b1);

        showData(idaa);
    }

    int i=0;
    String age,dat;

    void showData(String s){
        try{
            conn con = new conn();
            String str = "select * from employee where employeeid = '"+s+"'";
            ResultSet rs = con.s.executeQuery(str);

            if(rs.next()){
                f.setVisible(true);
                i=1;

                t1.setText(rs.getString(1));
                t2.setText(rs.getString(2));
                t3.setText(rs.getString(3));
                t4.setText(rs.getString(4));
                t5.setText(rs.getString(4));
                t6.setText(rs.getString(4));

                t7.setText(rs.getString(7));
                t8.setText(rs.getString(8));
                t9.setText(rs.getString(9));
                t10.setText(rs.getString(10));
                t11.setText(rs.getString(11));
                t12.setText(rs.getString(12));
                t13.setText(rs.getString(13));
                t14.setText(rs.getString(14));
                       
            }
            if(i==0)
                JOptionPane.showMessageDialog(null,"Id not found");
            new Search_Employee();
        }catch(Exception ex){}
        f.setVisible(true);
        f.setSize(900,550);
        f.setLocation(400,100);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b && i==1){
            try{
                conn con = new conn();
                String str = "update employee set BranchName='"+t1.getText()+"',JoiningDate='"+t2.getText()+"',FirstName='"+t3.getText()+"',LastName='"+t4.getText()+"',Age='"+t5.getText()+"',DateOfBirth='"+t6.getText()+"',Address='"+t7.getText()+"',JobPost='"+t8.getText()+"',PanNo='"+t9.getText()+"',AdharNo='"+t10.getText()+"',Employeeid='"+t11.getText()+"',Policy='"+t12.getText()+"',MobileNo='"+t13.getText()+"',Nominy='"+t14.getText()+"' where Employeeid ='"+id_emp+"'";
                con.s.executeUpdate(str);
                JOptionPane.showMessageDialog(null,"successfully updated");
                f.setVisible(false);
                new Search_Employee();
            }catch(Exception e){
                System.out.println("The error is:"+e);
            }
        }
        if(ae.getSource()==b1){
            f.setVisible(false);
            details d=new details();
        }
    }

    public static void main(String[] arg){
        new Update_Employee("Update Employee");
    }
}