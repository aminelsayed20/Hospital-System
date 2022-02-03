/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital.project;

/**
 *
 * @author amine
 */
class doctor {
    private String SSN;
    private String firstName;
    private String lastName;
    private String specilization;
    
    doctor(String ssn, String fn, String ln, String spec)
    {
        this.SSN = ssn;
        this.firstName = fn;
        this.lastName = ln;
        this.specilization = spec;
      
    }
    public String getSSN ()
    {
        return SSN;
    }
        public String getFirstName ()
    {
        return this.firstName;
    }
            public String getLastName ()
    {
        return this.lastName;
    }
                public String getSpecilization ()
    {
        return this.specilization;
    }
    
    
    
}
