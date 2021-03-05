package nl.breun

import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

class Tryout {
    fun main(args: Array<String>) {
        logger.info { args.joinToString() }
    }
}