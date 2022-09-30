package mw.streamsearchapp.Service;

import mw.streamsearchapp.Models.prime;
import mw.streamsearchapp.Repos.primeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class primeService {
    @Autowired
    private primeRepo primeDto;

    public List<prime> primeGetByGenre(String genre) {
        List<prime> results = primeDto.searchByGenreLike(genre);
        return results;
    }
}
