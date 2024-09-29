package org.example.Module;

import com.google.inject.AbstractModule;
import org.example.annotation.Super;
import org.example.dao.Dog;
import org.example.dao.IAnimal;
import org.example.dao.SuperDog;

public class AnimalModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IAnimal.class).to(Dog.class);
        bind(IAnimal.class).annotatedWith(Super.class).to(SuperDog.class);
    }
}
