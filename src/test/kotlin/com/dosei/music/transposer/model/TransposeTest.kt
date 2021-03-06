package com.dosei.music.transposer.model

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class TransposeTest {

    @Test
    fun `test transpose`() {
        val autumnLeaves = """
            Bm             Em7
            The falling leaves
            A7             D7M
            Drift by my window
            G7M          C#m7(b5)
            The autumn leaves
            F#7           Bm
            Of red and gold
        """.trimIndent()

        val result = Transpose().invoke(
            semitones = 4,
            source = autumnLeaves
        )

        val expected = """
            D#m             G#m7
            The falling leaves
            C#7             F#7M
            Drift by my window
            B7M          Fm7(b5)
            The autumn leaves
            Bb7           D#m
            Of red and gold
        """.trimIndent()

        assertEquals(expected, result)
    }


}