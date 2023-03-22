package com.judedevs.translator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform