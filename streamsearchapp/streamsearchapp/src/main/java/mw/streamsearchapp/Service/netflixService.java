package mw.streamsearchapp.Service;

import mw.streamsearchapp.Repos.netflixRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class netflixService {
    @Autowired
    private netflixRepo netflixDto;

}
