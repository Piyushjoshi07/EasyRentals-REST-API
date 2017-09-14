package com.EasyRentalsBackup.repository;

//import org.glassfish.jersey.media.multipart.MultiPart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.multipart.MultipartFile;

public interface ImageRepository extends CrudRepository<MultipartFile, Long> {

	
}
