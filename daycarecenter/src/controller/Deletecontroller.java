/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.DBConnection;
import model.DBDelete;
import model.DBSearch;

/**
 *
 * @author Chamidu
 */
public class Deletecontroller {
    
     public static void deletechild(String childId){
        
        try {
             String cId = null;
             
             ResultSet rs = new DBSearch().searchallchild();
             
             while(rs.next()) {
                 cId = rs.getNString("cid");
                 
                 if(cId != null){
                     
                     new DBDelete().deletechild(childId);
                     JOptionPane.showMessageDialog(null,"Record Deleted","Successfull",JOptionPane.INFORMATION_MESSAGE);
                 }
             }
             DBConnection.closecon();
            
                
            
            
            
        } catch (Exception e) {
        }
    
}
}
