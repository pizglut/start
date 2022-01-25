package com.javappa.start.item.service;

import com.javappa.start.item.api.request.DataArtykuluRequest;
import com.javappa.start.item.api.request.UpdateDataArtykuluRequest;
import com.javappa.start.item.api.response.DataArtykuluResponse;
import com.javappa.start.item.domain.DataArtykulu;
import com.javappa.start.item.repository.DataArtykuluRepository;
import com.javappa.start.item.support.DataArtykuluExceptionSupplier;
import com.javappa.start.item.support.DataArtykuluMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DataArtykuluService {

    private final DataArtykuluRepository dataArtykuluRepository;
    private final DataArtykuluMapper dataArtykuluMapper;

    public DataArtykuluService(DataArtykuluRepository dataArtykuluRepository, DataArtykuluMapper dataArtykuluMapper) {
        this.dataArtykuluRepository = dataArtykuluRepository;
        this.dataArtykuluMapper = dataArtykuluMapper;
    }

    public DataArtykuluResponse create(DataArtykuluRequest dataArtykuluRequest) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.save(dataArtykuluMapper.toDataArtykulu(dataArtykuluRequest));
        return dataArtykuluMapper.toDataArtykuluResponse(dataArtykulu);
    }

    public DataArtykuluResponse find(Long id) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.findById(id).orElseThrow(DataArtykuluExceptionSupplier.dataArtykuluNotFound(id));
        return dataArtykuluMapper.toDataArtykuluResponse(dataArtykulu);
    }

    public List<DataArtykuluResponse> findAll() {
        return dataArtykuluRepository.findAll().stream().map(dataArtykuluMapper::toDataArtykuluResponse).collect(Collectors.toList());
    }

    public DataArtykuluResponse update(UpdateDataArtykuluRequest updateDataArtykuluRequest) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.findById(updateDataArtykuluRequest.getId()).orElseThrow(
                DataArtykuluExceptionSupplier.dataArtykuluNotFound(updateDataArtykuluRequest.getId()));
        dataArtykuluRepository.save(dataArtykuluMapper.toDataArtykulu(dataArtykulu, updateDataArtykuluRequest));
        return dataArtykuluMapper.toDataArtykuluResponse(dataArtykulu);
    }

    public DataArtykuluResponse updateAlternativeVersion(Long id, UpdateDataArtykuluRequest updateDataArtykuluRequest) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.findById(id).orElseThrow(
                DataArtykuluExceptionSupplier.dataArtykuluNotFound(id));
        dataArtykuluRepository.save(dataArtykuluMapper.toDataArtykulu(dataArtykulu, updateDataArtykuluRequest));
        return dataArtykuluMapper.toDataArtykuluResponse(dataArtykulu);
    }

    public void delete(Long id) {
        DataArtykulu dataArtykulu = dataArtykuluRepository.findById(id).orElseThrow(DataArtykuluExceptionSupplier.dataArtykuluNotFound(id));
        dataArtykuluRepository.deleteById(dataArtykulu.getId());
    }
}
