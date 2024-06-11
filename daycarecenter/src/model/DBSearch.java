/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Chamidu
 */
public class DBSearch {
      Statement stmt;
    ResultSet rs;
    
    
    public ResultSet searchLoggin(String usName){
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            String name = usName;
            
            rs = stmt.executeQuery("SELECT * FROM login WHERE usname = '"+name+"'");
        } catch (Exception e) {
            
            //Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    return rs;
}
    public ResultSet searchallchild(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM child");
        } catch (Exception e) {
        }
    return rs;
    }
     public ResultSet searchChild(String  childId){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
             stmt = DBConnection.getStatementConnection();
             
             rs = stmt.executeQuery("SELECT * FROM child WHERE cid = '"+childId+"'");
             
             
          
        } catch (Exception e) {
        }
        return rs;
     }

  public ResultSet searchparent(){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM parent");
        } catch (Exception e) {
        }
    return rs;
    
    }
}


    


    

     
