package awts.perso.music_festival_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/festival")
public class FestivalController {

    @GetMapping("/{festivalId}")
    public String getFestival(@PathVariable Long festivalId) {
        return "Le festival d'id " + festivalId + " est Solidays!";
    }

}
