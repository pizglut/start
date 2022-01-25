package com.javappa.start.item.service;

import com.javappa.start.item.api.request.GodzinaRequest;
import com.javappa.start.item.api.request.UpdateGodzinaRequest;
import com.javappa.start.item.api.response.GodzinaResponse;
import com.javappa.start.item.domain.Godzina;
import com.javappa.start.item.repository.GodzinaRepository;
import com.javappa.start.item.support.GodzinaExceptionSupplier;
import com.javappa.start.item.support.GodzinaMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GodzinaService {

    private final GodzinaRepository godzinaRepository;
    private final GodzinaMapper godzinaMapper;

    public GodzinaService(GodzinaRepository godzinaRepository, GodzinaMapper godzinaMapper) {
        this.godzinaRepository = godzinaRepository;
        this.godzinaMapper = godzinaMapper;
    }

    public GodzinaResponse create(GodzinaRequest godzinaRequest) {
        Godzina godzina = godzinaRepository.save(godzinaMapper.toGodzina(godzinaRequest));
        return godzinaMapper.toGodzinaResponse(godzina);
    }

    public GodzinaResponse find(Long id) {
        Godzina godzina = godzinaRepository.findById(id).orElseThrow(GodzinaExceptionSupplier.godzinaNotFound(id));
        return godzinaMapper.toGodzinaResponse(godzina);
    }

    public List<GodzinaResponse> findAll() {
        return godzinaRepository.findAll().stream().map(godzinaMapper::toGodzinaResponse).collect(Collectors.toList());
    }

    public GodzinaResponse update(UpdateGodzinaRequest updateGodzinaRequest) {
        Godzina godzina = godzinaRepository.findById(updateGodzinaRequest.getId()).orElseThrow(
                GodzinaExceptionSupplier.godzinaNotFound(updateGodzinaRequest.getId()));
        godzinaRepository.save(godzinaMapper.toGodzina(godzina, updateGodzinaRequest));
        return godzinaMapper.toGodzinaResponse(godzina);
    }

    public GodzinaResponse updateAlternativeVersion(Long id, UpdateGodzinaRequest updateGodzinaRequest) {
        Godzina godzina = godzinaRepository.findById(id).orElseThrow(
                GodzinaExceptionSupplier.godzinaNotFound(id));
        godzinaRepository.save(godzinaMapper.toGodzina(godzina, updateGodzinaRequest));
        return godzinaMapper.toGodzinaResponse(godzina);
    }

    public void delete(Long id) {
        Godzina godzina = godzinaRepository.findById(id).orElseThrow(GodzinaExceptionSupplier.godzinaNotFound(id));
        godzinaRepository.deleteById(godzina.getId());
    }
}

