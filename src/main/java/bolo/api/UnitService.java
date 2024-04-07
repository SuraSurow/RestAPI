package bolo.api;

import bolo.units.*;
import org.springframework.stereotype.Service;

@Service
public class UnitService {


    public Unit giveUnit(String name) throws Exception {
        switch (name) {
            case "Dragon" -> {
                return new Dragon();
            }
            case "Goblin" -> {
                return new Goblin();
            }
            case "Imp" -> {
                return new Imp();
            }
            default -> throw new Exception("Unknown unit type: " + name);
        }
    }
}
