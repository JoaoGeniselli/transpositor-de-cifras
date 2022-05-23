package com.dosei.music.transposer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TransposerApplication

fun main(args: Array<String>) {
	runApplication<TransposerApplication>(*args)
}
