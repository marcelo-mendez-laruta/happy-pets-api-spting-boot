package cloud.pirwa.happypetsapi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import cloud.pirwa.happypetsapi.models.petModel;
import cloud.pirwa.happypetsapi.service.petService;

@RestController
@RequestMapping("/pets")
@RequiredArgsConstructor
public class petController {
    private final petService petService;
    @PostMapping("/pet")
    public void save(@RequestBody petModel pet){
        petService.save(pet);
    }
    @GetMapping("/pet")
    public List<petModel> findAll(){
        return petService.findAll();
    }
    @GetMapping("/pet/{id}")
    public petModel findById(@PathVariable String id){
        return petService.findById(id).get();
    }
    @DeleteMapping("/pet")
    public boolean deleteById(@PathVariable String id){
        return petService.deleteById(id);
    }
    @PutMapping("/pet")
    public void update(@RequestBody petModel pet){
        petService.save(pet);
    }
}