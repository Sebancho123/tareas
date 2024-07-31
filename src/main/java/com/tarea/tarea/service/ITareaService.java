
package com.tarea.tarea.service;

import com.tarea.tarea.model.Tarea;
import java.util.List;


public interface ITareaService {
    
    //crear
    public List<Tarea> getTareas();
    
    //crear
    public String saveTarea(Tarea tarea);
    
    //eliminar
    public String deleteTarea(Long id_tarea);
    
    //buscar
    public Tarea findTarea(Long id_tarea);
    
    //editar
    public Tarea editTarea(Tarea tarea);
    
    //traer tareas filtrando su estado
    public List<Tarea> findTaresForEstado(String estado);
    
    //marcar una tarea como finalizada
    public String finalizarTarea(Long id_tarea);
    
}
