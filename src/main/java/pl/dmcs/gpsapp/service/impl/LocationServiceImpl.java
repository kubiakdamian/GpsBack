package pl.dmcs.gpsapp.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.dmcs.gpsapp.model.Location;
import pl.dmcs.gpsapp.repository.LocationRepository;
import pl.dmcs.gpsapp.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

    private final Logger log = LoggerFactory.getLogger(LocationServiceImpl.class);
    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public void saveLocation(Location location) {
        log.debug("Received location: {}", location.toString());
        locationRepository.save(location);
    }
}
