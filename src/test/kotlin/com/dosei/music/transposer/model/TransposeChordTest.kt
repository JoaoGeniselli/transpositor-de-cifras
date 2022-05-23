package com.dosei.music.transposer.model

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TransposeChordTest {

    @Test
    fun `test transpose chord negative`() {
        val result = TransposeChord().invoke(chord = "Cm7/Bb", semitones = -2)
        assertEquals("Bbm7/G#", result)
    }

    @Test
    fun `test transpose chord positive`() {
        val result = TransposeChord().invoke(chord = "D#7+", semitones = 5)
        assertEquals("G#7+", result)
    }

}