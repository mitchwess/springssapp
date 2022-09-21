package mw.streamsearchapp.Repos;

import mw.streamsearchapp.Models.netflix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface netflixRepo extends JpaRepository<netflix, String> {
}
