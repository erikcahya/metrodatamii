/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrodatamii.metrodatamii.service;

import java.util.Optional;
import metrodatamii.metrodatamii.entities.Actor;
import metrodatamii.metrodatamii.entities.FilmActor;
import metrodatamii.metrodatamii.repository.ActorRepository;
import metrodatamii.metrodatamii.repository.FilmActorRepository;
import metrodatamii.metrodatamii.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author WIN7
 */
@Service
public class FilmActorService {
    
    
    @Autowired
    private ActorRepository actorImplement;
    
    @Autowired
    private FilmRepository filmimplement;
    
    @Autowired
    private FilmActorRepository filmActorImplement;
    
    public Optional<FilmActor> findById(String var){
        return filmActorImplement.findById(Integer.parseInt(var));
    }
    
    public Iterable<Actor> findAllActor(){
        return actorImplement.findAll();
    }
}
