package pl.dmcs.gpsapp.service.impl;

import org.springframework.stereotype.Service;
import pl.dmcs.gpsapp.exception.NotFoundException;
import pl.dmcs.gpsapp.model.Configuration;
import pl.dmcs.gpsapp.repository.ConfigurationRepository;
import pl.dmcs.gpsapp.service.ConfigurationService;

import java.util.List;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

    private final ConfigurationRepository configurationRepository;

    public ConfigurationServiceImpl(ConfigurationRepository configurationRepository) {
        this.configurationRepository = configurationRepository;
    }

    @Override
    public void addConfiguration(Configuration configuration) {
        configurationRepository.save(configuration);
    }

    @Override
    public Configuration getConfiguration(Long id) {
        return configurationRepository.findById(id).orElseThrow(
                () -> new NotFoundException("Configuration not found"));
    }

    @Override
    public List<Configuration> getAll() {
        return configurationRepository.findAll();
    }
}
