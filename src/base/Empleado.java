/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package base;

import java.time.LocalDate;

/**
 *
 * @author Student
 */
public class Empleado {

    private int cedula;
    private String nombre;
    private String apellidos;
    private char sexo;
    private String fechaNac;
    private String email;
    private double salario;
    private float porcComision;

    public Empleado(int cedula, String nombre, String apellidos, String fechaNac, String email, double salario, float porcComision, char sexo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.sexo = sexo;
        this.fechaNac = fechaNac;
        this.email = email;
        this.salario = salario;
        this.porcComision = porcComision;
    }

    public Empleado() {
        this.cedula = 0;
        this.nombre = "";
        this.apellidos = "";
        this.sexo = ' ';
        this.fechaNac = "";
        this.email = "";
        this.salario = 0;
        this.porcComision = 0;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public float getPorcComision() {
        return porcComision;
    }

    public void setPorcComision(float porcComision) {
        this.porcComision = porcComision;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
