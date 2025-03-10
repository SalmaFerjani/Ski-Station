package tn.esprit.salmaferjani4ds3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.salmaferjani4ds3.entities.Color;
import tn.esprit.salmaferjani4ds3.entities.Piste;
import tn.esprit.salmaferjani4ds3.services.IPisteServices;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("piste")
public class PisteController {

    private IPisteServices pisteServices;

    @GetMapping("all")
    public List<Piste> retrieveAll(){
        return pisteServices.retrieveAll();
    }
    @PostMapping("add")
    public Piste addPiste(@RequestBody Piste piste){
        return pisteServices.addPiste(piste);
    }
    @PutMapping("update")
    public Piste updatePiste(@RequestBody Piste piste){
        return pisteServices.updatePiste(piste);
    }
    @GetMapping("get/{numPiste}")
    public Piste retrievePiste(@PathVariable Long numPiste){
        return pisteServices.retrievePiste(numPiste);
    }
    @DeleteMapping("delete/{numPiste}")
    public void removePiste(@PathVariable Long numPiste){
        pisteServices.removePiste(numPiste);
    }
    @GetMapping("getByColor/{color}")
    public List<Piste> retrieveAllByColor(@PathVariable Color color){
        return pisteServices.retrieveAllByColor(color);
    }
    @PutMapping("assignToSkier/{numPiste}/{numSkier}")
    public Piste addPiste(@PathVariable Long numPiste ,@PathVariable Long numSkier){
        return pisteServices.assignPisteToSkier(numPiste,numSkier);
    }
}
