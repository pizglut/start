package com.javappa.start.item.support;

import com.javappa.start.item.api.request.DataArtykuluRequest;
import com.javappa.start.item.api.request.UpdateDataArtykuluRequest;
import com.javappa.start.item.api.response.DataArtykuluResponse;
import com.javappa.start.item.domain.DataArtykulu;
import org.springframework.stereotype.Component;

@Component
public class DataArtykuluMapper {

    public DataArtykulu toDataArtykulu(DataArtykuluRequest dataArtykuluRequest) {
        return new DataArtykulu(dataArtykuluRequest.getDataArtykulu());
    }

    public DataArtykulu toDataArtykulu(DataArtykulu dataArtykulu, UpdateDataArtykuluRequest dataArtykuluRequest) {
        dataArtykulu.setDataArtykulu(dataArtykuluRequest.getDataArtykulu());
        return dataArtykulu;
    }

    public DataArtykuluResponse toDataArtykuluResponse(DataArtykulu dataArtykulu) {
        return new DataArtykuluResponse(dataArtykulu.getId(), dataArtykulu.getDataArtykulu());
    }
}