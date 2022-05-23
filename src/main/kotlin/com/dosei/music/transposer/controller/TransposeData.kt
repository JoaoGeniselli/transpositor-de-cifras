package com.dosei.music.transposer.controller

import java.io.Serializable

data class TransposeData(
    var chords: CharSequence? = null,
    var semitones: Int? = null
) : Serializable
