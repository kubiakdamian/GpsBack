package pl.dmcs.gpsapp.service;

import pl.dmcs.gpsapp.model.Configuration;

public interface ConfigurationService {

    void addConfiguration(Configuration configuration);

    Configuration getConfiguration(Long id);
}
