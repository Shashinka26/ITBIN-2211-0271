/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.swing.JOptionPane;
import model.UpdateForm;

/**
 *
 * @author Chamidu
 */
public class updatecontroler {
     public static void UpdateForm(String childID,String childName,String age,String parentName,String cate){
    
    new UpdateForm().updateForm(childID, childName, age, parentName,cate);
    
    if(childID.equals("")){
    
    
    }
    else{
        JOptionPane.showMessageDialog(null, "Update Successfully!","successfull",JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    }
    
}
