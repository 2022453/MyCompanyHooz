/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mycompanyhooz;

/**
 *
 * @author paulooliveira
 */
public class Staff {
    
    private String name;
    private String position;
    private int employeeID;

    public Staff(String name, String position, int employeeID) {
        this.name = name;
        this.position = position;
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override  // add this method to get back the inf instead of getting back just the memory address.
    public String toString() {
        return "Staff{" + "name=" + name + ", position=" + position + ", employeeID=" + employeeID + '}';
    }
   
    
}
