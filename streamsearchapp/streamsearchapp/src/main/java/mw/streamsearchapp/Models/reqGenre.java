package mw.streamsearchapp.Models;

import lombok.Data;

@Data
public class reqGenre {
    private boolean netflix;
    private boolean hulu;
    private boolean prime;
    private boolean disney;
    private String genre;
}
