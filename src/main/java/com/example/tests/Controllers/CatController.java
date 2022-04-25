package com.example.tests.Controllers;

import com.example.tests.model.Cat;
import com.example.tests.repo.CatRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/cats")
public class CatController {
    private final CatRepo catRepo;

    @GetMapping
    public ResponseEntity<?>getAllCats(){
        return ResponseEntity.ok(catRepo.findAll());
    }

    @PostMapping
    public ResponseEntity<?>saveCat(@RequestBody Cat catRequest){
        Cat cat = new Cat();
        cat.setName(catRequest.getName());
        return ResponseEntity.ok(catRepo.save(cat));
    }


}
