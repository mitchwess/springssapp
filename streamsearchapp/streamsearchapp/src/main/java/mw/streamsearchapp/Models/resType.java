package mw.streamsearchapp.Models;

import lombok.Data;

import java.util.List;

@Data
public class resType {
    private List<netflix> n;
    private List<hulu> h;
    private List<prime> p;
    private List<disney> d;
}
