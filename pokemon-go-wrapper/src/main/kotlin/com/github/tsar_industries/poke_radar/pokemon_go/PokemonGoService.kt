package com.github.tsar_industries.poke_radar.pokemon_go

import com.pokegoapi.api.PokemonGo
import com.pokegoapi.auth.PtcCredentialProvider
import okhttp3.OkHttpClient

internal class PokemonGoService {
    fun getUsername(): String {
        val client = OkHttpClient()

        val username = ""
        val password = ""

        try {
            val provider = PtcCredentialProvider(client, username, password)
            val pokemonApi = PokemonGo(provider, client)
            return pokemonApi.playerProfile.username
        } catch(e: Exception) {
            System.out.println(e.cause)
            throw e
        }
    }
}
