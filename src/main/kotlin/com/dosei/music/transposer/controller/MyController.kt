package com.dosei.music.transposer.controller

import com.dosei.music.transposer.model.Transpose
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class MyController {

    private val transpose = Transpose()

    @GetMapping("/")
    fun loadHome(model: Model): String? {
        model.addAttribute("request", TransposeData())
        return "home"
    }

    @RequestMapping(value = ["/transpose"], method = [RequestMethod.POST])
    fun transposeChords(
        @ModelAttribute request: TransposeData,
        model: Model
    ): String? {
        val semitones = request.semitones ?: 0
        val chords = request.chords ?: ""
        val result = transpose.invoke(
            semitones = semitones,
            source = chords
        )
        val response = TransposeData(
            chords = result,
            semitones = 0
        )
        model.addAttribute("request", response)
        return "home"
    }


}