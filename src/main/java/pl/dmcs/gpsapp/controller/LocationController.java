package pl.dmcs.gpsapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dmcs.gpsapp.model.Location;
import pl.dmcs.gpsapp.service.LocationService;

@RestController
@RequestMapping(value = "/location")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @PostMapping
    public ResponseEntity addLocation(@RequestBody Location location) {
        locationService.saveLocation(location);

        return new ResponseEntity(HttpStatus.OK);
    }
}
