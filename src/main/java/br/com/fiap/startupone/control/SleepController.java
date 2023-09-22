package br.com.fiap.startupone.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.startupone.model.Sleep;
import br.com.fiap.startupone.repository.SleepRepository;

@RestController
@RequestMapping("sleep")
public class SleepController {
	
	@Autowired
	private SleepRepository sleepRepository;
	
	@GetMapping 
	public List<Sleep> listar() { 
	    return sleepRepository.findAll(); 
	} 
	
    @GetMapping("{id}") 
    public Sleep read(@PathVariable int id) { 
        return sleepRepository.findById(id).get(); 
    }
    
    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping
    public Sleep create(@RequestBody Sleep sleep) { 
        return sleepRepository.save(sleep); 
    } 
    
    @PutMapping("{id}") 
    public Sleep update(@RequestBody Sleep sleep, @PathVariable int id) { 
    	sleep.setId(id);
        return sleepRepository.save(sleep); 
    } 

 
    @DeleteMapping("{id}") 
    public void delete(@PathVariable int id) { 
    	sleepRepository.deleteById(id); 
    } 

}