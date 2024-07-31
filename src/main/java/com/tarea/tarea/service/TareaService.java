package com.tarea.tarea.service;

import com.tarea.tarea.model.Tarea;
import com.tarea.tarea.repository.ITareaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaService implements ITareaService {

    String mensaje = "";

    @Autowired
    private ITareaRepository itaRepo;

    @Override
    public List<Tarea> getTareas() {

        List<Tarea> listaTareas = itaRepo.findAll();

        return listaTareas;

    }

    @Override
    public String saveTarea(Tarea tarea) {

        itaRepo.save(tarea);
        return mensaje = "Se creo correctamente";
    }

    @Override
    public String deleteTarea(Long id_tarea) {

        itaRepo.deleteById(id_tarea);
        return mensaje = "se elimino correctamente";

    }

    @Override
    public Tarea findTarea(Long id_tarea) {

        return itaRepo.findById(id_tarea).orElse(null);

    }

    @Override
    public Tarea editTarea(Tarea tarea) {

        return itaRepo.save(tarea);

    }

    @Override
    public List<Tarea> findTaresForEstado(String estado) {

        List<Tarea> listaTareas = itaRepo.findAll();
        List<Tarea> listaTareas2 = new ArrayList<>();

        for (int i = 0; i < listaTareas.size(); i++) {
            Tarea tarea = listaTareas.get(i);

            if (tarea.getEstado().equals(estado)) {
                listaTareas2.add(tarea);
            }

        }

        return listaTareas2;

    }

    @Override
    public String finalizarTarea(Long id_tarea) {

        Tarea tarea = this.findTarea(id_tarea);

        if (tarea.isFinalizada() == false) {
            
            tarea.setFinalizada(true);
            mensaje = "Se finalizo correctamente";
        }else {
            mensaje = "La tarea ya esta finalizada";
        }

        return mensaje;

    }

}
