package com.miportfolio.NJRG.Interface;

import com.miportfolio.NJRG.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //Traer Lista Per.
    public List<Persona> getPersona();
    
    //Guardar un objeto tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar usuario por ID
    public void deletePersona(Long id);
    
    //Busacr una persona
    public Persona findPersona(Long id);
    
}
