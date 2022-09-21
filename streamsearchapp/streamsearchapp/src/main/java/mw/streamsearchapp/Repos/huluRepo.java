package mw.streamsearchapp.Repos;

import mw.streamsearchapp.Models.hulu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface huluRepo extends JpaRepository<hulu, String> {
}
