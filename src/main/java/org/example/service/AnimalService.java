package org.example.service;

import com.google.inject.Inject;
import org.example.annotation.Super;
import org.example.dao.IAnimal;

public class AnimalService {
    
    @Inject
    private IAnimal dog;
    
    @Inject 
    @Super
    private IAnimal superDog;
    
    
    public void talk(){
        System.out.println("dog will talk");
        dog.talk();
        System.out.println("superDog will talk");
        superDog.talk();
    }
}
