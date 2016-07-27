package com.github.tsar_industries.poke_radar.application.service

import org.assertj.core.api.Assertions.assertThat
import org.junit.Ignore
import org.junit.Test

class SimpleServiceTest {
    @Test
    fun shouldReturnMessage() {
        assertThat(SimpleService().getMessage()).isEqualTo("The service class works")
    }

    @Ignore
    @Test
    fun shouldReturnUsername() {
        assertThat(SimpleService().getUsername()).isEqualTo("")
    }
}