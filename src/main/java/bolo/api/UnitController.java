package bolo.api;

import bolo.units.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class UnitController {

    @Autowired
    private UnitService unitService;


    @GetMapping("/units/{id}")
    @ResponseBody
    public ResponseEntity<Unit> getObjectById(@PathVariable("id") String id) {
        try {
            return ResponseEntity.ok(unitService.giveUnit(id));
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unit not found", e);
        }
    }





}