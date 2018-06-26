/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedioestudiantes;

/**
 *
 * @author FRANCISCO
 */
public class Estudiantes {
    
    
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    private double nota3;
  
    //CONSTRUCTOR

    public Estudiantes(String nombre, String apellido, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    
      //GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
    
    public double Promedio(){
        double promedio=0;
        
        promedio = (this.nota1+this.nota2+this.nota3)/3;
        
        return promedio;
    }
    
  //TO STRING  
    
    
    public String imprimir() {
        String texto="";
       
        texto=texto+"Nombre:  \t"+this.nombre+"\t"+this.apellido+"\tNotas:    "+this.nota1+"    "+this.nota2+"    "
                +"    "+this.nota3+"\tPromedio:   "+this.Promedio();
        return texto;
}
}
