package com.github.tsar_industries.poke_radar.application.scan

import com.google.inject.Inject
import com.github.tsar_industries.poke_radar.application.service.Service
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
internal class MyResource @Inject constructor(val service: Service){

    @GET
    fun hello() = service.getMessage()
}
