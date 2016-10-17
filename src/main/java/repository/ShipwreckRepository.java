package main.java.repository;

import main.java.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by aouhman on 17/10/2016.
 */
public interface ShipwreckRepository extends JpaRepository<Shipwreck,Long> {
}
