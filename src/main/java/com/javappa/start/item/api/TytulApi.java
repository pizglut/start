package com.javappa.start.item.api;

import com.javappa.start.item.api.request.TytulRequest;
import com.javappa.start.item.api.request.UpdateTytulRequest;
import com.javappa.start.item.api.response.TytulResponse;
import com.javappa.start.item.service.TytulService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Tytuls")
@RequestMapping("/api/tytuls")
public class TytulApi {

    private final TytulService tytulService;

    TytulApi(TytulService tytulService) {
        this.tytulService = tytulService;
    }

    @PostMapping
    @ApiOperation("Create tytul")
    public ResponseEntity<TytulResponse> create(@RequestBody TytulRequest tytulRequest) {
        TytulResponse tytulResponse = tytulService.create(tytulRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(tytulResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find tytul")
    public ResponseEntity<TytulResponse> find(@PathVariable Long id) {
        TytulResponse tytulResponse = tytulService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(tytulResponse);
    }

    @PutMapping
    @ApiOperation("Update tytul")
    public ResponseEntity<TytulResponse> update(@RequestBody UpdateTytulRequest updateTytulRequest) {
        TytulResponse tytulResponse = tytulService.update(updateTytulRequest);
        return ResponseEntity.status(HttpStatus.OK).body(tytulResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update tytul alternative version")
    public ResponseEntity<TytulResponse> update(@PathVariable Long id, @RequestBody UpdateTytulRequest updateTytulRequest) {
        TytulResponse tytulResponse = tytulService.updateAlternativeVersion(id, updateTytulRequest);
        return ResponseEntity.status(HttpStatus.OK).body(tytulResponse);
    }

    @GetMapping
    @ApiOperation("Find all tytuls")
    public ResponseEntity<List<TytulResponse>> findAll() {
        List<TytulResponse> tytulResponses = tytulService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(tytulResponses);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete tytul")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tytulService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}