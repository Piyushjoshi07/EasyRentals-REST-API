package com.EasyRentalsBackup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.EasyRentalsBackup.model.UploadImage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

@RestController
@RequestMapping(value="/EasyRentals/image")
public class UploadImageController {
	//private final Logger logger = LoggerFactory.getLogger(UploadImageController.class);
	
	  private static String UPLOADED_FOLDER = "/var/www/food/upload/";
	   //private static String UPLOADED_FOLDER = "/var/www/car/";
	   //private static String UPLOADED_FOLDER = "D://temp//";
	    
	    @RequestMapping(value="/upload", method=RequestMethod.POST)
	    public @ResponseBody String singleSave(@RequestParam("file") MultipartFile file
	    		, @RequestParam("fileName") String filename){

	        String fileName = null;
	        
	        if (!file.isEmpty()) {
	            try {
	            	fileName= filename;
	               //fileName = file.getOriginalFilename();
	                byte[] bytes = file.getBytes();
	                BufferedOutputStream buffStream = 
	                		new BufferedOutputStream(new FileOutputStream(new File(UPLOADED_FOLDER + fileName)));
	                
	                buffStream.write(bytes);
	                buffStream.close();
	                return "You have successfully uploaded " + fileName;
	            } catch (Exception e) {
	                return "You failed to upload " + fileName + ": " + e.getMessage();
	            }
	        } else {
	            return "Unable to upload. File is empty.";
	        }
	      }
	    
	    @RequestMapping(value = "/download", method = RequestMethod.GET)
		public UploadImage get(@RequestParam("fileName") String filename) {
			System.out.println(String.format("/GET info: imageName = %s", filename));
			String imagePath = UPLOADED_FOLDER + filename;
			String imageBase64 = UploadImageController.encoder(imagePath);
			
			if(imageBase64 != null){
				UploadImage image = new UploadImage(filename, imageBase64);
				return image;
			}
			return null;
		}
	    
	    
	    public static String encoder(String imagePath) {
		    File file = new File(imagePath);
		    try (FileInputStream imageInFile = new FileInputStream(file)) {
		        // Reading a Image file from file system
		    	String base64Image = "";
		        byte imageData[] = new byte[(int) file.length()];
		        imageInFile.read(imageData);
		        base64Image = Base64.getEncoder().encodeToString(imageData);
		        return base64Image;
		    } catch (FileNotFoundException e) {
		        System.out.println("Image not found" + e);
		    } catch (IOException ioe) {
		        System.out.println("Exception while reading the Image " + ioe);
		    }
		    return null;
		}
	    
	}
