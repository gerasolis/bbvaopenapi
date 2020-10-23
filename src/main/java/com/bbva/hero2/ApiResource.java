package com.bbva.hero2;

import com.bbva.hero2.beans.Hero;
import com.bbva.hero2.beans.Long;
import com.bbva.hero2.beans.String;
import com.bbva.hero2.beans.URI;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * A JAX-RS interface.  An implementation of this interface must be provided.
 */
@Path("/api")
public interface ApiResource {
  @Path("/heroes")
  @GET
  @Produces("application/json")
  List<Hero> returnsAllTheHeroesFromTheDatabase();

  @Path("/heroes")
  @PUT
  @Produces("application/json")
  @Consumes("application/json")
  Hero updatesAnExitingHero(Hero data);

  @Path("/heroes")
  @POST
  @Produces("application/json")
  @Consumes("application/json")
  URI createsAValidHero(Hero data);

  @Path("/heroes/hello")
  @GET
  @Produces("text/plain")
  String generatedMethod1();

  @Path("/heroes/random")
  @GET
  @Produces("application/json")
  Response returnsARandomHero();

  @Path("/heroes/{id}")
  @GET
  @Produces("application/json")
  Hero returnsAHeroForAGivenIdentifier(@PathParam("id") Long id);

  @Path("/heroes/{id}")
  @DELETE
  @Produces("application/json")
  Hero deletesAnExitingHero(@PathParam("id") Long id);

  @Path("/heroes/{nombre}")
  @GET
  @Produces("application/json")
  Hero generatedMethod2(@PathParam("nombre") String nombre);
}
