package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.example.Module.AnimalModule;
import org.example.service.AnimalService;
import org.example.service.UserService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Injector injector = Guice.createInjector();
        UserService userService = injector.getInstance(UserService.class);
        userService.say();

        Injector injector1 = Guice.createInjector(new AnimalModule());
        AnimalService animalService = injector1.getInstance(AnimalService.class);
        animalService.talk();
    }
}
