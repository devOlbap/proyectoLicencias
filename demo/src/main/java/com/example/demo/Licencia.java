package com.example.demo;

public class Licencia {
    private int id;
    private String fecha;
    private String nombre_paciente;
   

    public Licencia(
        int id ,
        String fecha, 
        String nombre_paciente
        ){
        this.id = id;
        this.fecha = fecha;
        this.nombre_paciente = nombre_paciente;
    }
    public int getId(){
        return id;
    }
    public String getFechaLicencia(){
        return fecha;
    }
   
    public String getNombrePaciente(){
        return      nombre_paciente;
    }
   
}
