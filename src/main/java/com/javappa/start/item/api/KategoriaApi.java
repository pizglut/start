package com.javappa.start.item.api;

import com.javappa.start.item.api.request.KategoriaRequest;
import com.javappa.start.item.api.request.UpdateKategoriaRequest;
import com.javappa.start.item.api.response.KategoriaResponse;
import com.javappa.start.item.service.KategoriaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Kategorias")
@RequestMapping("/api/kategoria")
public class KategoriaApi {

    private final KategoriaService kategoriaService;

    KategoriaApi(KategoriaService kategoriaService) {
        this.kategoriaService = kategoriaService;
    }

    @PostMapping
    @ApiOperation("Create kategoria")
    public ResponseEntity<KategoriaResponse> create(@RequestBody KategoriaRequest kategoriaRequest) {
        KategoriaResponse kategoriaResponse = kategoriaService.create(kategoriaRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(kategoriaResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find kategoria")
    public ResponseEntity<KategoriaResponse> find(@PathVariable Long id) {
        KategoriaResponse kategoriaResponse = kategoriaService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(kategoriaResponse);
    }

    @PutMapping
    @ApiOperation("Update kategoria")
    public ResponseEntity<KategoriaResponse> update(@RequestBody UpdateKategoriaRequest updateKategoriaRequest) {
        KategoriaResponse kategoriaResponse = kategoriaService.update(updateKategoriaRequest);
        return ResponseEntity.status(HttpStatus.OK).body(kategoriaResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update kategoria alternative version")
    public ResponseEntity<KategoriaResponse> update(@PathVariable Long id, @RequestBody UpdateKategoriaRequest updateKategoriaRequest) {
        KategoriaResponse kategoriaResponse = kategoriaService.updateAlternativeVersion(id, updateKategoriaRequest);
        return ResponseEntity.status(HttpStatus.OK).body(kategoriaResponse);
    }

    @GetMapping
    @ApiOperation("Find all kategorias")
    public ResponseEntity<List<KategoriaResponse>> findAll() {
        List<KategoriaResponse> kategoriaResponses = kategoriaService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(kategoriaResponses);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete kategoria")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        kategoriaService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}