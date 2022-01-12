package mx.com.gm.web;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/user")
    public List<Persona> inicio(Model model){
        List<Persona> personas = personaService.listarPersonas();
        
        return personas;
    }
    @PostMapping(path="/user/listJSON", produces = MediaType.APPLICATION_XML_VALUE)
    public Persona listJSON(@RequestBody Persona personal){
        
        return personal;
    }



}
