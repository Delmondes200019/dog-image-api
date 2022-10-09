package org.acme.rest.client;

import javax.inject.Singleton;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import org.acme.model.DogImage;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Singleton
@Path("/breeds/image/random")
@RegisterRestClient(configKey = "dog_image-api")
public interface DogImagesService {
    
    @GET
    @Consumes(value = MediaType.APPLICATION_JSON)
    DogImage getRandomDogImage();
}
