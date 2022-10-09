package dogimage.api.integration.resource;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import dogimage.api.integration.model.DogImage;
import dogimage.api.integration.rest.client.DogImagesService;

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