package com.javappa.start.item.support;

import com.javappa.start.item.api.request.TytulRequest;
import com.javappa.start.item.api.request.UpdateTytulRequest;
import com.javappa.start.item.api.response.TytulResponse;
import com.javappa.start.item.domain.Tytul;
import org.springframework.stereotype.Component;

@Component
public class TytulMapper {

    public Tytul toTytul(TytulRequest tytulRequest) {
        return new Tytul(tytulRequest.getTytul());
    }

    public Tytul toTytul(Tytul tytul, UpdateTytulRequest tytulRequest) {
        tytul.setTytul(tytulRequest.getTytul());
        return tytul;
    }

    public TytulResponse toTytulResponse(Tytul tytul) {
        return new TytulResponse(tytul.getId(), tytul.getTytul());
    }
}

