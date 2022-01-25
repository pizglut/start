package com.javappa.start.item.support;

import com.javappa.start.item.api.request.DataRezerwacjiRequest;
import com.javappa.start.item.api.request.UpdateDataRezerwacjiRequest;
import com.javappa.start.item.api.response.DataRezerwacjiResponse;
import com.javappa.start.item.domain.DataRezerwacji;
import org.springframework.stereotype.Component;

@Component
public class DataRezerwacjiMapper {

    public DataRezerwacji toDataRezerwacji(DataRezerwacjiRequest dataRezerwacjiRequest) {
        return new DataRezerwacji(dataRezerwacjiRequest.getDataRezerwacji());
    }

    public DataRezerwacji toDataRezerwacji(DataRezerwacji dataRezerwacji, UpdateDataRezerwacjiRequest dataRezerwacjiRequest) {
        dataRezerwacji.setDataRezerwacji(dataRezerwacjiRequest.getDataRezerwacji());
        return dataRezerwacji;
    }

    public DataRezerwacjiResponse toDataRezerwacjiResponse(DataRezerwacji dataRezerwacji) {
        return new DataRezerwacjiResponse(dataRezerwacji.getId(), dataRezerwacji.getDataRezerwacji());
    }
}

