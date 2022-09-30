package mw.streamsearchapp.Service;

import mw.streamsearchapp.Models.disney;
import mw.streamsearchapp.Repos.disneyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class disneyService {
    @Autowired
    private disneyRepo disneyDto;

    public List<disney> disneyGetByGenre(String genre) {
        List<disney> results = disneyDto.searchByGenreLike(genre);
        return results;
    }
}
