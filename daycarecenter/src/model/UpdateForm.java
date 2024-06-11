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
public class UpdateForm {
    Statement stmt;
    
    public void updateForm(String childID,String childName,String age,String parentName,String cate){
    
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            
            stmt.executeUpdate("UPDATE `child` SET `cname` = '"+childName+"',`age`='"+age+"',`pname`='"+parentName+"',`catagory`='"+cate+"' WHERE cid='"+childID+"' ");
        } catch (Exception e) {
        }
    
    
    }
}
