package mw.streamsearchapp.Controller;
import com.fasterxml.jackson.core.JsonProcessingException;
import mw.streamsearchapp.Models.reqGenre;
import mw.streamsearchapp.Models.resType;
import mw.streamsearchapp.Service.disneyService;
import mw.streamsearchapp.Service.huluService;
import mw.streamsearchapp.Service.netflixService;
import mw.streamsearchapp.Service.primeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class streamController {
    @Autowired
    netflixService netflixSvc;

    @Autowired
    huluService huluSvc;

    @Autowired
    primeService primeSvc;

    @Autowired
    disneyService disneySvc;

    @GetMapping("/api/get")
    @ResponseBody
    public resType getByGenre(@RequestBody reqGenre request) throws JsonProcessingException {
        System.out.println("req" + request);
        resType response = new resType();
        if(request.isNetflix()) {
            response.setN(netflixSvc.netflixGetByGenre(request.getGenre()));
        }
        if(request.isHulu()){
            response.setH(huluSvc.huluGetByGenre(request.getGenre()));
        }
        if(request.isPrime()){
            response.setP(primeSvc.primeGetByGenre(request.getGenre()));
        }
        if(request.isDisney()){
            response.setD(disneySvc.disneyGetByGenre(request.getGenre()));
        }
        return response;
    }
}
