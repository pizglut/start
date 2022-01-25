package com.javappa.start.item.service;

import com.javappa.start.item.api.request.DataRezerwacjiRequest;
import com.javappa.start.item.api.request.UpdateDataRezerwacjiRequest;
import com.javappa.start.item.api.response.DataRezerwacjiResponse;
import com.javappa.start.item.domain.DataRezerwacji;
import com.javappa.start.item.repository.DataRezerwacjiRepository;
import com.javappa.start.item.support.DataRezerwacjiExceptionSupplier;
import com.javappa.start.item.support.DataRezerwacjiMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataRezerwacjiService {

    private final DataRezerwacjiRepository dataRezerwacjiRepository;
    private final DataRezerwacjiMapper dataRezerwacjiMapper;

    public DataRezerwacjiService(DataRezerwacjiRepository dataRezerwacjiRepository, DataRezerwacjiMapper dataRezerwacjiMapper) {
        this.dataRezerwacjiRepository = dataRezerwacjiRepository;
        this.dataRezerwacjiMapper = dataRezerwacjiMapper;
    }

    public DataRezerwacjiResponse create(DataRezerwacjiRequest dataRezerwacjiRequest) {
        DataRezerwacji dataRezerwacji = dataRezerwacjiRepository.save(dataRezerwacjiMapper.toDataRezerwacji(dataRezerwacjiRequest));
        return dataRezerwacjiMapper.toDataRezerwacjiResponse(dataRezerwacji);
    }

    public DataRezerwacjiResponse find(Long id) {
        DataRezerwacji dataRezerwacji = dataRezerwacjiRepository.findById(id).orElseThrow(DataRezerwacjiExceptionSupplier.dataRezerwacjiNotFound(id));
        return dataRezerwacjiMapper.toDataRezerwacjiResponse(dataRezerwacji);
    }

    public List<DataRezerwacjiResponse> findAll() {
        return dataRezerwacjiRepository.findAll().stream().map(dataRezerwacjiMapper::toDataRezerwacjiResponse).collect(Collectors.toList());
    }

    public DataRezerwacjiResponse update(UpdateDataRezerwacjiRequest updateDataRezerwacjiRequest) {
        DataRezerwacji dataRezerwacji = dataRezerwacjiRepository.findById(updateDataRezerwacjiRequest.getId()).orElseThrow(
                DataRezerwacjiExceptionSupplier.dataRezerwacjiNotFound(updateDataRezerwacjiRequest.getId()));
        dataRezerwacjiRepository.save(dataRezerwacjiMapper.toDataRezerwacji(dataRezerwacji, updateDataRezerwacjiRequest));
        return dataRezerwacjiMapper.toDataRezerwacjiResponse(dataRezerwacji);
    }

    public DataRezerwacjiResponse updateAlternativeVersion(Long id, UpdateDataRezerwacjiRequest updateDataRezerwacjiRequest) {
        DataRezerwacji dataRezerwacji = dataRezerwacjiRepository.findById(id).orElseThrow(
                DataRezerwacjiExceptionSupplier.dataRezerwacjiNotFound(id));
        dataRezerwacjiRepository.save(dataRezerwacjiMapper.toDataRezerwacji(dataRezerwacji, updateDataRezerwacjiRequest));
        return dataRezerwacjiMapper.toDataRezerwacjiResponse(dataRezerwacji);
    }

    public void delete(Long id) {
        DataRezerwacji dataRezerwacji = dataRezerwacjiRepository.findById(id).orElseThrow(DataRezerwacjiExceptionSupplier.dataRezerwacjiNotFound(id));
        dataRezerwacjiRepository.deleteById(dataRezerwacji.getId());
    }
}

