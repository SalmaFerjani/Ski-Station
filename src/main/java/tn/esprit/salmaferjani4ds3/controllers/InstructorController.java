package tn.esprit.salmaferjani4ds3.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.salmaferjani4ds3.entities.Instructor;
import tn.esprit.salmaferjani4ds3.services.IInstructorServices;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("instructor")
public class InstructorController {

    private IInstructorServices instructorServices;

    @GetMapping("all")
    public List<Instructor> retrieveAll(){
        return instructorServices.retrieveAll();
    }
    @PostMapping("add")
    public Instructor addPiste(@RequestBody Instructor instructor){
        return instructorServices.addInstructor(instructor);
    }
    @PutMapping("update")
    public Instructor updatePiste(@RequestBody Instructor instructor){
        return instructorServices.updateInstructor(instructor);
    }
    @GetMapping("get/{numInstructor}")
    public Instructor retrievePiste(@PathVariable Long numInstructor){
        return instructorServices.retrieveInstructor(numInstructor);
    }
    @DeleteMapping("delete/{numInstructor}")
    public void removePiste(@PathVariable Long numInstructor){
        instructorServices.removeInstructor(numInstructor);
    }


}
