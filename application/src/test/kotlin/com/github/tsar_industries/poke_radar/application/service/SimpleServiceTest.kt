package com.github.tsar_industries.poke_radar.application.service

import com.github.tsar_industries.poke_radar.pokemon_go.PokemonGoService
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.mockito.Mockito.mock

class SimpleServiceTest {
    @Test
    fun shouldReturnMessage() {
        assertThat(SimpleService(mock(PokemonGoService::class.java)).getMessage()).isEqualTo("The service class works")
    }
}
