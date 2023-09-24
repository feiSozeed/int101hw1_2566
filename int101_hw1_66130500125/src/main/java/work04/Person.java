/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/**
 *
 * @author feoy1
 */
public class Person {
    //Field
    private int id;
    
    // constructor
    public Person(int id) {
        this.id = id;
    }
    // getter - setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    // toString
    @Override
    public String toString() {
        return "Person{" + "id=" + id + '}';
    }
    
    
}
