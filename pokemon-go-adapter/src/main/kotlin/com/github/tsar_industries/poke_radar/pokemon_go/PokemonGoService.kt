package com.github.tsar_industries.poke_radar.pokemon_go

import com.pokegoapi.api.PokemonGo
import com.pokegoapi.auth.PtcCredentialProvider
import okhttp3.OkHttpClient

open class PokemonGoService {
    fun getUsername(username: String, password: String): String {
        val client = OkHttpClient()
        val provider = PtcCredentialProvider(client, username, password)
        val pokemonApi = PokemonGo(provider, client)
        return pokemonApi.playerProfile.username
    }
}