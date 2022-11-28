package com.dg.bird.service;

import com.dg.bird.model.Bird;
import com.dg.bird.model.*;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BirdService {

    public List<Bird> getFlyingBirds() {
        Bird bird = new Sparrow("Lili","Brown","Spanish",3);
        Bird b = new Crow("Sindh","Black","Italian",2);
        Bird br = new Penguin("Pyrrhonotus","White-Black","Dutch",4);
        Bird brd = new Penguin("Pyrr","White","Russian",2);
        Bird bb = new Sparrow("Eurasian Tree Sparrow","Black","European",8);
        List<Bird> birds = new ArrayList<>();
        birds.add(bird);
        birds.add(b);
        birds.add(br);
        birds.add(brd);
        birds.add(bb);
        List<Bird> newBirds = new ArrayList<>();
        for(Bird mybird: birds){
            if(mybird instanceof Flyable) {
                newBirds.add(mybird);
                ((Flyable) mybird).fly();
            }
        }
        return newBirds;
    }
}
