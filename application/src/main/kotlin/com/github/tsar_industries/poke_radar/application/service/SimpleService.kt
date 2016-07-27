package com.github.tsar_industries.poke_radar.application.service

import com.pokegoapi.api.PokemonGo
import com.pokegoapi.auth.PtcCredentialProvider
import okhttp3.OkHttpClient

internal class SimpleService : Service {
    override fun getMessage() = "The service class works"

    override fun getUsername(): String {
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
