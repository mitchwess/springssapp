package mw.streamsearchapp.Repos;

import mw.streamsearchapp.Models.netflix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface netflixRepo extends JpaRepository<netflix, String> {
    @Query("SELECT n FROM netflix n WHERE n.listed_in LIKE %:genre%")
    List<netflix> searchByGenreLike(@Param("genre") String genre);

}
