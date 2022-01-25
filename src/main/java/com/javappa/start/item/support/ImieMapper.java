package com.javappa.start.item.support;

import com.javappa.start.item.api.request.ImieRequest;
import com.javappa.start.item.api.request.UpdateImieRequest;
import com.javappa.start.item.api.response.ImieResponse;
import com.javappa.start.item.domain.Imie;
import org.springframework.stereotype.Component;

@Component
public class ImieMapper {

    public Imie toImie(ImieRequest imieRequest) {
        return new Imie(imieRequest.getImie());
    }

    public Imie toImie(Imie imie, UpdateImieRequest imieRequest) {
        imie.setImie(imieRequest.getImie());
        return imie;
    }

    public ImieResponse toImieResponse(Imie imie) {
        return new ImieResponse(imie.getId(), imie.getImie());
    }
}

