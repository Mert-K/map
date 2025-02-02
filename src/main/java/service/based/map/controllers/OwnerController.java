package service.based.map.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import service.based.map.services.OwnerService;

@Controller
public class OwnerController {
    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping({"/owner","/owners"})
    public String getAllOwners(Model model){
        model.addAttribute("owners",ownerService.findAll());
        return "index";
    }
}
