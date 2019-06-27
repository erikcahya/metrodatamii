/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrodatamii.metrodatamii.controller;

import metrodatamii.metrodatamii.repository.ActorRepository;
import metrodatamii.metrodatamii.service.FilmActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author WIN7
 */
@Controller
public class MainController {
    
    @Autowired
    private FilmActorService filmActorService;
    
    @Autowired
    private ActorRepository actorRepository;
    
    @GetMapping("/")
    public String index(Model model){
        String id ="2";
        model.addAttribute("dataActor", filmActorService.findAllActor());
        model.addAttribute("id", id);
        
        return  "index";
    }
    @GetMapping("/data")
    public String index2(Model model){
        String id ="2";
        model.addAttribute("dataActor", filmActorService.findAllActor());
        return  "index2";
    }
    
}
