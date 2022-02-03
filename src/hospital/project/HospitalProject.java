
// عملناواحد دراج دروب وواحد لا

// within  drag&drop

// Amin Elsayed Amin          12100560
// Zeyad Abdelsalam sliman    12100254
// Sondos Mohamed Abdelnaser  12100256
// Hisham Rabie Rashad          مقصة
// Zena Ahmed Abdellatef        مقصة
package hospital.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HospitalProject {



    public static void main(String[] args) {
        new login().setVisible(true);
       //new home().setVisible(true);
        new connection();
       HospitalProject hp = new HospitalProject();
    }
    
}
