package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import dmacc.beans.Mission;

/**
 * @author Dylan Thomas - djthomas4
 * CIS175 - Fall 2021
 * Oct 20, 2021
 */

@Repository
public interface MissionRepository extends JpaRepository<Mission, Long> {

}
