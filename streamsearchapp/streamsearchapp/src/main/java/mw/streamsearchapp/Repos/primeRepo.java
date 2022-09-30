package mw.streamsearchapp.Repos;

import mw.streamsearchapp.Models.netflix;
import mw.streamsearchapp.Models.prime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface primeRepo extends JpaRepository<prime, String> {
    @Query("SELECT n FROM prime n WHERE n.listed_in LIKE %:genre%")
    List<prime> searchByGenreLike(@Param("genre") String genre);
}
