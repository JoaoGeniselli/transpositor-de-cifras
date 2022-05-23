package com.dosei.music.transposer.model

import java.util.regex.Pattern

class Transpose {

    private val chordsPattern: Pattern = Pattern.compile(fileChordsQuery)
    private val transposeChord = TransposeChord()

    operator fun invoke(
        semitones: Semitones,
        source: CharSequence
    ): String =
        chordsPattern
            .matcher(source)
            .replaceAll { result -> transposeChord(result.group(), semitones) }

    companion object {
        private const val fileChordsQuery =
            "[A-G](##?|bb?)?((m|\\+|dim|º)?\\d?\\d?M?)?(/[A-G](##?|bb?)?)?(\\(b5\\))?(\r?\n|( (?![A-Za-zÀ-ÿ\\d_])|\$))"
    }
}