package com.javappa.start.item.api;

import com.javappa.start.item.api.request.ImieRequest;
import com.javappa.start.item.api.request.UpdateImieRequest;
import com.javappa.start.item.api.response.ImieResponse;
import com.javappa.start.item.service.ImieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Imies")
@RequestMapping("/api/imie")
public class ImieApi {

    private final ImieService imieService;

    ImieApi(ImieService imieService) {
        this.imieService = imieService;
    }

    @PostMapping
    @ApiOperation("Create imie")
    public ResponseEntity<ImieResponse> create(@RequestBody ImieRequest imieRequest) {
        ImieResponse imieResponse = imieService.create(imieRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(imieResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find imie")
    public ResponseEntity<ImieResponse> find(@PathVariable Long id) {
        ImieResponse imieResponse = imieService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(imieResponse);
    }

    @PutMapping
    @ApiOperation("Update imie")
    public ResponseEntity<ImieResponse> update(@RequestBody UpdateImieRequest updateImieRequest) {
        ImieResponse imieResponse = imieService.update(updateImieRequest);
        return ResponseEntity.status(HttpStatus.OK).body(imieResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update imie alternative version")
    public ResponseEntity<ImieResponse> update(@PathVariable Long id, @RequestBody UpdateImieRequest updateImieRequest) {
        ImieResponse imieResponse = imieService.updateAlternativeVersion(id, updateImieRequest);
        return ResponseEntity.status(HttpStatus.OK).body(imieResponse);
    }

    @GetMapping
    @ApiOperation("Find all imies")
    public ResponseEntity<List<ImieResponse>> findAll() {
        List<ImieResponse> imieResponses = imieService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(imieResponses);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete imie")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        imieService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}