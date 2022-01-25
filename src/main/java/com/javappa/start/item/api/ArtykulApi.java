package com.javappa.start.item.api;

import com.javappa.start.item.api.request.ArtykulRequest;
import com.javappa.start.item.api.request.UpdateArtykulRequest;
import com.javappa.start.item.api.response.ArtykulResponse;
import com.javappa.start.item.service.ArtykulService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Artykuls")
@RequestMapping("/api/artykul")
public class ArtykulApi {

    private final ArtykulService artykulService;

    ArtykulApi(ArtykulService artykulService) {
        this.artykulService = artykulService;
    }

    @PostMapping
    @ApiOperation("Create artykul")
    public ResponseEntity<ArtykulResponse> create(@RequestBody ArtykulRequest artykulRequest) {
        ArtykulResponse artykulResponse = artykulService.create(artykulRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(artykulResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find artykul")
    public ResponseEntity<ArtykulResponse> find(@PathVariable Long id) {
        ArtykulResponse artykulResponse = artykulService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(artykulResponse);
    }

    @PutMapping
    @ApiOperation("Update artykul")
    public ResponseEntity<ArtykulResponse> update(@RequestBody UpdateArtykulRequest updateArtykulRequest) {
        ArtykulResponse artykulResponse = artykulService.update(updateArtykulRequest);
        return ResponseEntity.status(HttpStatus.OK).body(artykulResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update artykul alternative version")
    public ResponseEntity<ArtykulResponse> update(@PathVariable Long id, @RequestBody UpdateArtykulRequest updateArtykulRequest) {
        ArtykulResponse artykulResponse = artykulService.updateAlternativeVersion(id, updateArtykulRequest);
        return ResponseEntity.status(HttpStatus.OK).body(artykulResponse);
    }

    @GetMapping
    @ApiOperation("Find all artykuls")
    public ResponseEntity<List<ArtykulResponse>> findAll() {
        List<ArtykulResponse> artykulResponses = artykulService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(artykulResponses);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete artykul")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        artykulService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
