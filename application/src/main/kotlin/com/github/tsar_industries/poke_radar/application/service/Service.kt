package com.github.tsar_industries.poke_radar.application.service

internal interface Service {
    fun getMessage(): String
    open fun getUsername(username: String, password: String): String
}
