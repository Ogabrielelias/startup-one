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

import br.com.fiap.startupone.model.User;
import br.com.fiap.startupone.repository.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping 
	public List<User> listar() { 
	    return userRepository.findAll(); 
	} 
	
    @GetMapping("{id}") 
    public User read(@PathVariable int id) { 
        return userRepository.findById(id).get(); 
    } 
    
    @ResponseStatus(code = HttpStatus.CREATED) 
    @PostMapping
    public User create(@RequestBody User user) { 
        return userRepository.save(user); 
    } 
    
    @PutMapping("{id}") 
    public User update(@RequestBody User user, @PathVariable int id) { 
    	user.setId(id);
        return userRepository.save(user); 
    } 

    @DeleteMapping("{id}") 
    public void delete(@PathVariable int id) { 
    	userRepository.deleteById(id); 
    } 

}
