package com.javappa.start.item.api;


import com.javappa.start.item.api.request.DataArtykuluRequest;
import com.javappa.start.item.api.request.UpdateDataArtykuluRequest;
import com.javappa.start.item.api.response.DataArtykuluResponse;
import com.javappa.start.item.service.DataArtykuluService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "DataArtykulus")
@RequestMapping("/api/dataArtykulu")
public class DataArtykuluApi {

    private final DataArtykuluService dataArtykuluService;

    DataArtykuluApi(DataArtykuluService dataArtykuluService) {
        this.dataArtykuluService = dataArtykuluService;
    }

    @PostMapping
    @ApiOperation("Create dataArtykulu")
    public ResponseEntity<DataArtykuluResponse> create(@RequestBody DataArtykuluRequest dataArtykuluRequest) {
        DataArtykuluResponse dataArtykuluResponse = dataArtykuluService.create(dataArtykuluRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(dataArtykuluResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find dataArtykulu")
    public ResponseEntity<DataArtykuluResponse> find(@PathVariable Long id) {
        DataArtykuluResponse dataArtykuluResponse = dataArtykuluService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(dataArtykuluResponse);
    }

    @PutMapping
    @ApiOperation("Update dataArtykulu")
    public ResponseEntity<DataArtykuluResponse> update(@RequestBody UpdateDataArtykuluRequest updateDataArtykuluRequest) {
        DataArtykuluResponse dataArtykuluResponse = dataArtykuluService.update(updateDataArtykuluRequest);
        return ResponseEntity.status(HttpStatus.OK).body(dataArtykuluResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update dataArtykulu alternative version")
    public ResponseEntity<DataArtykuluResponse> update(@PathVariable Long id, @RequestBody UpdateDataArtykuluRequest updateDataArtykuluRequest) {
        DataArtykuluResponse dataArtykuluResponse = dataArtykuluService.updateAlternativeVersion(id, updateDataArtykuluRequest);
        return ResponseEntity.status(HttpStatus.OK).body(dataArtykuluResponse);
    }

    @GetMapping
    @ApiOperation("Find all dataArtykulus")
    public ResponseEntity<List<DataArtykuluResponse>> findAll() {
        List<DataArtykuluResponse> dataArtykuluResponses = dataArtykuluService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(dataArtykuluResponses);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete dataArtykulu")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        dataArtykuluService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}