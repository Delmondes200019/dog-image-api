package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.acme.model.DogImage;
import org.acme.rest.client.DogImagesService;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/dog-images")
public class DogImageResource {

    @RestClient
    DogImagesService dogImagesService;

    @GET
    @Path("/random")
    @Produces(MediaType.APPLICATION_JSON)
    public DogImage hello() {
        return dogImagesService.getRandomDogImage();
    }
}