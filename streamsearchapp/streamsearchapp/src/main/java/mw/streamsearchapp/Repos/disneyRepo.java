package mw.streamsearchapp.Repos;

import mw.streamsearchapp.Models.disney;
import mw.streamsearchapp.Models.netflix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface disneyRepo extends JpaRepository<disney, String> {
    @Query("SELECT n FROM disney n WHERE n.listed_in LIKE %:genre%")
    List<disney> searchByGenreLike(@Param("genre") String genre);
}
