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

import br.com.fiap.startupone.model.HeartRate;
import br.com.fiap.startupone.repository.HeartRateRepository;

@RestController
@RequestMapping("resting")
public class HeartRateController {

    @Autowired
    private HeartRateRepository heartRateRepository;

    @GetMapping
    public List<HeartRate> listar() {
        return heartRateRepository.findAll();
    }

    @GetMapping("{id}")
    public HeartRate read(@PathVariable int id) {
        return heartRateRepository.findById(id).get();
    }

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping
    public HeartRate create(@RequestBody HeartRate heartRate) {
        return heartRateRepository.save(heartRate);
    }

    @PutMapping("{id}")
    public HeartRate update(@RequestBody HeartRate heartRate, @PathVariable int id) {
        heartRate.setId(id);
        ;
        return heartRateRepository.save(heartRate);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable int id) {
        heartRateRepository.deleteById(id);
    }

}