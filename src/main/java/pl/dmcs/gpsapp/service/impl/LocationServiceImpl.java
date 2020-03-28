package pl.dmcs.gpsapp.service.impl;

import org.springframework.stereotype.Service;
import pl.dmcs.gpsapp.model.Location;
import pl.dmcs.gpsapp.repository.LocationRepository;
import pl.dmcs.gpsapp.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public void saveLocation(Location location) {
        locationRepository.save(location);
    }
}
