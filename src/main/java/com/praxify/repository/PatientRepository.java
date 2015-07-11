/**
 * 
 */
package com.praxify.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.praxify.pojos.Patient;

/**
 * @author mahendra
 *
 */
public interface PatientRepository extends MongoRepository<Patient, Serializable> {
	

}
