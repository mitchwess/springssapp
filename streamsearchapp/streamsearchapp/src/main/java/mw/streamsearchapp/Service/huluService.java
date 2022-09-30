package mw.streamsearchapp.Service;

import mw.streamsearchapp.Models.hulu;
import mw.streamsearchapp.Repos.huluRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class huluService {
    @Autowired
    private huluRepo huluDto;

    public List<hulu> huluGetByGenre(String genre) {
        List<hulu> results = huluDto.searchByGenreLike(genre);
        return results;
    }
}
