package mw.streamsearchapp.Service;

import mw.streamsearchapp.Models.netflix;
import mw.streamsearchapp.Repos.netflixRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class netflixService {

    @Autowired
    private netflixRepo netflixDto;

    public List<netflix> netflixGetByGenre(String genre) {
        List<netflix> results = netflixDto.searchByGenreLike(genre);
        return results;
    }


}
