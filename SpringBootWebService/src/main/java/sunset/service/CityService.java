package sunset.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sunset.model.City;
import sunset.repository.CityRepository;

@Service
public class CityService {

	@Autowired
	CityRepository cityRepository;
	
	public Iterable<City> findAll()
	{
		return cityRepository.findAll();
	}
	
	public Optional<City> findOne(int id)
	{
		return cityRepository.findById(id);
	}
	
	public void save(City task) {
		cityRepository.save(task);
	}
	
	public void delete(int id) {
		cityRepository.deleteById(id);
	}
	
	
}
