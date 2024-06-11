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
public class DBDelete {
    Statement stmt;
    
    public void deletechild(String childId){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            stmt = DBConnection.getStatementConnection();
            
            stmt.executeUpdate("DELETE FROM child WHERE cid = '"+childId+"' ");
            
            
            
        } catch (Exception e) {
        }
    }
    
}
