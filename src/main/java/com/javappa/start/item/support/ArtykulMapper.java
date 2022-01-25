package com.javappa.start.item.support;

import com.javappa.start.item.api.request.ArtykulRequest;
import com.javappa.start.item.api.request.UpdateArtykulRequest;
import com.javappa.start.item.api.response.ArtykulResponse;
import com.javappa.start.item.domain.Artykul;
import org.springframework.stereotype.Component;

@Component
public class ArtykulMapper {

    public Artykul toArtykul(ArtykulRequest artykulRequest) {
        return new Artykul(artykulRequest.getArtykul());
    }

    public Artykul toArtykul(Artykul artykul, UpdateArtykulRequest artykulRequest) {
        artykul.setArtykul(artykulRequest.getArtykul());
        return artykul;
    }

    public ArtykulResponse toArtykulResponse(Artykul artykul) {
        return new ArtykulResponse(artykul.getId(), artykul.getArtykul());
    }
}
