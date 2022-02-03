/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class connection {
    
public Connection con;
connection(){
        
         String url = "jdbc:sqlserver://localhost:1433;databaseName=Hospital"; 
    String username ="ahmed";
    String password ="123"; 
 try{

 con = DriverManager.getConnection(url, username,password);
 System.out.println("Database CONNECTED");

 }
 catch ( SQLException e){ 
     System.out.println(e);
 }
}
    }
    

