package com.javappa.start.item.support;

import com.javappa.start.item.api.request.KategoriaRequest;
import com.javappa.start.item.api.request.UpdateKategoriaRequest;
import com.javappa.start.item.api.response.KategoriaResponse;
import com.javappa.start.item.domain.Kategoria;
import org.springframework.stereotype.Component;

@Component
public class KategoriaMapper {

    public Kategoria toKategoria(KategoriaRequest kategoriaRequest) {
        return new Kategoria(kategoriaRequest.getKategoria());
    }

    public Kategoria toKategoria(Kategoria kategoria, UpdateKategoriaRequest kategoriaRequest) {
        kategoria.setKategoria(kategoriaRequest.getKategoria());
        return kategoria;
    }

    public KategoriaResponse toKategoriaResponse(Kategoria kategoria) {
        return new KategoriaResponse(kategoria.getId(), kategoria.getKategoria());
    }
}

