package com.github.tsar_industries.poke_radar.application.scan

import com.github.tsar_industries.poke_radar.application.service.Service
import javax.inject.Inject
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path("/user")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
internal class MyResource @Inject constructor(val service: Service) {

    @GET
    fun hello() = "Usage: /user/get?username=x&password=x"

    @GET
    @Path("/get")
    fun getUsername(@QueryParam("username") username: String, @QueryParam("password") password: String): String {
        return service.getUsername(username, password)
    }
}
