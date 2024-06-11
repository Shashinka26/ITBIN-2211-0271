/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.DBInsert;

/**
 *
 * @author Chamidu
 */
public class Insertcontroller {
    
     public static void insertchild(String cID,String cName,String age,String pName,String cate){
    
    if(cID != null){
        
        new DBInsert().insert(cID, cName, age,pName, cate);
        
        JOptionPane.showMessageDialog(null,"Add succesfull","succesfull",JOptionPane.INFORMATION_MESSAGE);
    }
    
    }
     public static void insertparent(String parentID,String Name,String childName,String contact,String address){
    
    if(parentID != null){
        
        new DBInsert().insertparent(parentID,Name,childName, contact, address);
        
        JOptionPane.showMessageDialog(null,"Add succesfull","succesfull",JOptionPane.INFORMATION_MESSAGE);
    }
    
    }
}

