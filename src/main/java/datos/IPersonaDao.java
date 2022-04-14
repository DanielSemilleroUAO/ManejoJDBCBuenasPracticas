/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package datos;

import domain.Persona;
import java.util.List;

/**
 *
 * @author delga
 */
public interface IPersonaDao {
    
    public List<Persona> seleccionar();
    
    public int insertar(Persona persona);
    
    public int actualizar(Persona persona);
    
    public int eliminar(Persona persona);
    
}
