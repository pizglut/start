package com.javappa.start.item.service;

import com.javappa.start.item.api.request.TytulRequest;
import com.javappa.start.item.api.request.UpdateTytulRequest;
import com.javappa.start.item.api.response.TytulResponse;
import com.javappa.start.item.domain.Tytul;
import com.javappa.start.item.repository.TytulRepository;
import com.javappa.start.item.support.TytulExceptionSupplier;
import com.javappa.start.item.support.TytulMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TytulService {

    private final TytulRepository tytulRepository;
    private final TytulMapper tytulMapper;

    public TytulService(TytulRepository tytulRepository, TytulMapper tytulMapper) {
        this.tytulRepository = tytulRepository;
        this.tytulMapper = tytulMapper;
    }

    public TytulResponse create(TytulRequest tytulRequest) {
        Tytul tytul = tytulRepository.save(tytulMapper.toTytul(tytulRequest));
        return tytulMapper.toTytulResponse(tytul);
    }

    public TytulResponse find(Long id) {
        Tytul tytul = tytulRepository.findById(id).orElseThrow(TytulExceptionSupplier.tytulNotFound(id));
        return tytulMapper.toTytulResponse(tytul);
    }

    public List<TytulResponse> findAll() {
        return tytulRepository.findAll().stream().map(tytulMapper::toTytulResponse).collect(Collectors.toList());
    }

    public TytulResponse update(UpdateTytulRequest updateTytulRequest) {
        Tytul tytul = tytulRepository.findById(updateTytulRequest.getId()).orElseThrow(
                TytulExceptionSupplier.tytulNotFound(updateTytulRequest.getId()));
        tytulRepository.save(tytulMapper.toTytul(tytul, updateTytulRequest));
        return tytulMapper.toTytulResponse(tytul);
    }

    public TytulResponse updateAlternativeVersion(Long id, UpdateTytulRequest updateTytulRequest) {
        Tytul tytul = tytulRepository.findById(id).orElseThrow(
                TytulExceptionSupplier.tytulNotFound(id));
        tytulRepository.save(tytulMapper.toTytul(tytul, updateTytulRequest));
        return tytulMapper.toTytulResponse(tytul);
    }

    public void delete(Long id) {
        Tytul tytul = tytulRepository.findById(id).orElseThrow(TytulExceptionSupplier.tytulNotFound(id));
        tytulRepository.deleteById(tytul.getId());
    }
}

