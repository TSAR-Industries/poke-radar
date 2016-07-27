package com.github.tsar_industries.poke_radar.application.service

import com.github.tsar_industries.poke_radar.pokemon_go.PokemonGoService
import javax.inject.Inject

internal class SimpleService @Inject constructor(val service: PokemonGoService) : Service {
    override fun getMessage() = "The service class works"
    override fun getUsername(username: String, password: String) = service.getUsername(username, password)
}
