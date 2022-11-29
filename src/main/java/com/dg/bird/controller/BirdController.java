package com.dg.bird.controller;

import com.dg.bird.model.Bird;
import com.dg.bird.service.BirdService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirdController {

    @Autowired
    BirdService birdService;

    @GetMapping("/bird")
    public List<Bird> getFlyableBirds() throws Exception{
        return birdService.getFlyingBirds();

    }

    @GetMapping("/birdEaters")
    public List<Bird> getEaterBirds() throws Exception{
        return birdService.getEaters();
    }

}
