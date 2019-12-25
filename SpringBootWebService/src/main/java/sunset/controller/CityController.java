package sunset.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sunset.model.City;
import sunset.service.CityService;

@RestController
@RequestMapping("city")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	//getall
	@RequestMapping("/getall")
	public List<City> getAll(){
		return (List<City>) cityService.findAll();
	}
	
	// get by id
	@RequestMapping("/{id}")
	public Optional<City> getById(@PathVariable("id") int id) {
		Optional<City> c= cityService.findOne(id);
		return c;
	}
	

	// add
	@PostMapping("/add")
	public City add(@RequestBody City c) {
		cityService.save(c);
		return c;
	}
	
	
	//delete
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable("id") int id) {
		Optional<City> temp = cityService.findOne(id);
		if (temp != null)
			cityService.delete(id);
	}
	
	//update
	@PutMapping("/upadate")
	public City update(@RequestBody City c) {
		Optional<City> temp = cityService.findOne(c.getId());
		if(temp != null) {
			cityService.save(c);
			return c;
		}
		return c;
	}
	
	
	
	
	
	
	
	
}
