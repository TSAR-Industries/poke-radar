package com.github.tsar_industries.poke_radar.pokemon_go

import com.pokegoapi.api.PokemonGo
import com.pokegoapi.auth.PtcCredentialProvider
import okhttp3.OkHttpClient


open class PokemonGoService {
    var pokemonApi: PokemonGo? = null


    fun getUsername(username: String, password: String): String {

        val myPair = Pair(1, 2) //todo remove this once we use kotlin stdlib properly somewhere

        val client = OkHttpClient()
        val provider = PtcCredentialProvider(client, username, password)
        pokemonApi = PokemonGo(provider, client)

        return pokemonApi!!.playerProfile.username
    }

    fun setLocation() {
        pokemonApi!!.setLocation(59.337042, 18.064270, 0.0)
    }

    fun getCatchablePokemons(): List<String> {
        return pokemonApi!!.map.catchablePokemon
                .map { it.pokemonId.name }
    }
}
