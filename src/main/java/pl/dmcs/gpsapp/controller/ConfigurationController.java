package pl.dmcs.gpsapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dmcs.gpsapp.model.Configuration;
import pl.dmcs.gpsapp.service.ConfigurationService;

import java.util.List;

@RestController
@RequestMapping(value = "/configuration")
public class ConfigurationController {

    private final ConfigurationService configurationService;

    public ConfigurationController(ConfigurationService configurationService) {
        this.configurationService = configurationService;
    }

    @PostMapping
    public ResponseEntity addConfiguration(Configuration configuration) {
        configurationService.addConfiguration(configuration);

        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<?> getConfiguration(@PathVariable Long id) {
        Configuration configuration = configurationService.getConfiguration(id);

        return ResponseEntity.ok(configuration);
    }

    @GetMapping
    public ResponseEntity<?> getConfiguration() {
        List<Configuration> all = configurationService.getAll();

        return ResponseEntity.ok(all);
    }
}
