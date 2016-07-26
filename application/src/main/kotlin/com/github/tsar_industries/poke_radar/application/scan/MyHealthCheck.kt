package com.github.tsar_industries.poke_radar.application.scan

import ru.vyarus.dropwizard.guice.module.installer.feature.health.NamedHealthCheck

internal class MyHealthCheck : NamedHealthCheck() {
    override fun getName() = "MyHealthCheck"
    override fun check() = Result.healthy("Everything is A-OK")
}
