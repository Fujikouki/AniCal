package com.fujikouki.anical

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform