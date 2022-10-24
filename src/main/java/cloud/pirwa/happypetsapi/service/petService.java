package cloud.pirwa.happypetsapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import cloud.pirwa.happypetsapi.models.petModel;
import cloud.pirwa.happypetsapi.repository.petRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class petService {
    private final petRepository petRepository;
    public void save(petModel pet){
        petRepository.save(pet);
    }
    public List<petModel> findAll(){
        return petRepository.findAll();
    }
    public Optional<petModel> findById(String id){
        return petRepository.findById(id);
    }
    public boolean  deleteById(String id){
        try {
            petRepository.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
}