package io.javabrains;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.DTOs.CarDto;
import io.javabrains.springbootstarter.services.ServiceCar;


@RestController
public class CarControler {
	
@Autowired
private ServiceCar serviceCar;
	
	
//GET//GET//GET//GET//GET//GET//GET
//GET all Cars DTO
@RequestMapping("/cars")
 public List<CarDto> FindallCars() {

return serviceCar.getallCars();
	 }



//GET a car DTO
@RequestMapping("/cars/{id}")
public synchronized  CarDto FindCar(@PathVariable String id) 
{ 
return serviceCar.getCar(id);
 }


	 
//POST DTO
	 @RequestMapping(method=RequestMethod.POST,value="/cars")
	 public synchronized  CarDto increaseCar(@RequestBody CarDto dto) {
		return serviceCar.addCar(dto);
	 }                                                      

	 
//PUT//PUT//PUT//PUT//PUT DTO
	 @RequestMapping(method=RequestMethod.PUT,value="/cars/{id}")//بالاصل هي جيت كيف بدي اخليها بوست
	 public synchronized  CarDto EditCar(@RequestBody CarDto dto,@PathVariable String id) {
	
			return serviceCar.updateCar(dto, id);
	 } 



	 
	 
}
