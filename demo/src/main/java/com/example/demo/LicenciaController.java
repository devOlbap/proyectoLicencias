package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LicenciaController {

    private List<Licencia> licencias = new ArrayList<>();

    // Constructor para inicializar algunas licencias
    public LicenciaController() {
        licencias.add(new Licencia(1, "2024-03-10", "Pablo Garrido Cid"));
        licencias.add(new Licencia(2, "2024-03-12", "Daniela Fuenzalida Gonzalez"));
        licencias.add(new Licencia(3, "2024-03-18", "Isidora Pinto Jorquera"));
        
        
        // Agrega más licencias según sea necesario
    }

    @GetMapping("/licencias") 
    public List<Licencia> getLicencias(){
        return licencias;
    }

    @GetMapping("/licencias/{id}")
    public Licencia getLicenciaById(@PathVariable int id){
        for(Licencia licencia : licencias){
            if(licencia.getId() == id){
                return licencia;
            }
        }
        return null; // Podrías considerar lanzar una excepción si la licencia no se encuentra
    }
}
