package com.praxify.Rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.MediaType;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.praxify.dto.PatientDTO;
import com.praxify.pojos.Patient;
import com.praxify.repository.PatientRepository;

@RestController
@RequestMapping("/app")
public class EnrollPatientResource {
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	
	
	@Autowired
	PatientRepository patientRepository;
	@Autowired
	MongoTemplate mongoTemplate;
	
	@RequestMapping(value="/testCrudOperations",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
	public void testCrudOperations(){
		log.info("Rest call to test Crud operations");
		Patient patient=new Patient();
		log.info("Trying to save patient details: {}",patient);
		patientRepository.save(patient);
		
		log.info("saved Patient is: {}",patientRepository.findAll());
	}
	
	@RequestMapping(value="/rest/enrollPatient",method=RequestMethod.POST,produces=MediaType.APPLICATION_JSON_VALUE)
	public void enrollPatient(@RequestBody PatientDTO patientDTO){
		log.info("Rest call to enroll Patient : {}",patientDTO);
		Patient patient=new Patient();
		BeanUtils.copyProperties(patientDTO, patient);
		patient.setPassword(DigestUtils.md5Digest(patientDTO.getPassword().getBytes()));
		patientRepository.save(patient);
		log.info("Successfully saved patient details: {}",patient);
	}
	
	
	

}
