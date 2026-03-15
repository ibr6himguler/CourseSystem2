/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coursesystem2;


public class CourseSystem2 {

   
    public static void main(String[] args) {
        DataConnection dbcon = new DataConnection();
        dbcon.connectCourseDB2();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginC().setVisible(true);
            }
        });
    }
    
}
