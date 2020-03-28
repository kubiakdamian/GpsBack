package pl.dmcs.gpsapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dmcs.gpsapp.model.Configuration;

public interface ConfigurationRepository extends JpaRepository<Configuration, Long> {
}
