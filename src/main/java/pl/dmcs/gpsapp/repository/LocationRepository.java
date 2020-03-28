package pl.dmcs.gpsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmcs.gpsapp.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
