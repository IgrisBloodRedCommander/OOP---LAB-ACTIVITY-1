/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing.area;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class TestingArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int piliBruh = JOptionPane.showConfirmDialog(null, "Example");
        switch (piliBruh) {
            case -1:
                int Xoption = JOptionPane.showConfirmDialog(null, "It Seems that You Entered Exit\nDo You want to exit?");
                break;
            case 0: 
                 int Yes = JOptionPane.showConfirmDialog(null, "You Entered Yes");

                break;
            case 1:int No = JOptionPane.showConfirmDialog(null, "You Entered NO");
                break;
            case 2: int cancel = JOptionPane.showConfirmDialog(null, "You Entered NO");
                break;
        

        } 

    }

}
