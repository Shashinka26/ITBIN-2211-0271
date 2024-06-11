/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Statement;

/**
 *
 * @author Chamidu
 */
public class DBInsert {
    Statement stmt;
    
    public void insert(String cId,String cName,String age,String pName,String cate){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            String childID = cId;
            String childName = cName;
            String ag = age;
            String parentName = pName;
            String catagory = cate;
            
            stmt.executeUpdate("INSERT INTO child VALUES('"+childID+"','"+childName+"','"+ag+"','"+parentName+"','"+catagory+"')");
            
            
            
        } catch (Exception e) {
        }
    
}
public void insertparent(String paId,String name,String cnNumber,String age,String address){
        try {
            
             Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
          
            
            
            
            stmt.executeUpdate("INSERT INTO parent VALUES('"+paId+"','"+name+"','"+cnNumber+"','"+age+"','"+address+"')");
            
            
            
            
            
        } catch (Exception e) {
        }
    }
}
