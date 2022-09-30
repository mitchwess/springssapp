package mw.streamsearchapp.Repos;

import mw.streamsearchapp.Models.hulu;
import mw.streamsearchapp.Models.netflix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface huluRepo extends JpaRepository<hulu, String> {
    @Query("SELECT n FROM hulu n WHERE n.listed_in LIKE %:genre%")
    List<hulu> searchByGenreLike(@Param("genre") String genre);
}
