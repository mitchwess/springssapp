package mw.streamsearchapp.Repos;

import mw.streamsearchapp.Models.disney;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface disneyRepo extends JpaRepository<disney, String> {
}
