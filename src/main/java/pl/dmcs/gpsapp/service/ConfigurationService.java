package pl.dmcs.gpsapp.service;

import pl.dmcs.gpsapp.model.Configuration;

import java.util.List;

public interface ConfigurationService {

    void addConfiguration(Configuration configuration);

    Configuration getConfiguration(Long id);

    List<Configuration> getAll();
}
