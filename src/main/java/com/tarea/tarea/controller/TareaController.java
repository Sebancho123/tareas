
package com.tarea.tarea.controller;

import com.tarea.tarea.model.Tarea;
import com.tarea.tarea.service.ITareaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tarea")
public class TareaController {
    
    @Autowired
    private ITareaService iTaSer;
    
    @GetMapping("/traerlas")
    public List<Tarea> getTareas() {
        
        return iTaSer.getTareas();
        
    }
    
    @PostMapping("/crear")
    public String saveTarea(@RequestBody Tarea tarea) {
        
        return iTaSer.saveTarea(tarea);
        
    }
    
    @DeleteMapping("/eliminar/{id_tarea}")
    public String deleteTarea(@PathVariable Long id_tarea) {
        return iTaSer.deleteTarea(id_tarea);
    }
    
    @GetMapping("/buscar/{id_tarea}")
    public Tarea findTarea(@PathVariable Long id_tarea) {
        return iTaSer.findTarea(id_tarea);
    }
    
    @PutMapping("/editar")
    public Tarea editTarea (@RequestBody Tarea tarea) {
        return iTaSer.editTarea(tarea);
    }
    
    @GetMapping("/estado/{estado}")
    public List<Tarea> findTaresForEstado(@PathVariable String estado) {
        return iTaSer.findTaresForEstado(estado);
    }
    
    @GetMapping("/finalizar/{id_tarea}")
    public String finalizarTarea(@PathVariable Long id_tarea) {
        return iTaSer.finalizarTarea(id_tarea);
    }
    
    
    
}
