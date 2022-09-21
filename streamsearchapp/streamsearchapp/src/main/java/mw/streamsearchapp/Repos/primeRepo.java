package mw.streamsearchapp.Repos;

import mw.streamsearchapp.Models.prime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface primeRepo extends JpaRepository<prime, String> {
}
