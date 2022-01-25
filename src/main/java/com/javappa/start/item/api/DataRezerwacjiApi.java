package com.javappa.start.item.api;

import com.javappa.start.item.api.request.DataRezerwacjiRequest;
import com.javappa.start.item.api.request.UpdateDataRezerwacjiRequest;
import com.javappa.start.item.api.response.DataRezerwacjiResponse;
import com.javappa.start.item.service.DataRezerwacjiService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "DataRezerwacjis")
@RequestMapping("/api/dataRezerwacji")
public class DataRezerwacjiApi {

    private final DataRezerwacjiService dataRezerwacjiService;

    DataRezerwacjiApi(DataRezerwacjiService dataRezerwacjiService) {
        this.dataRezerwacjiService = dataRezerwacjiService;
    }

    @PostMapping
    @ApiOperation("Create dataRezerwacji")
    public ResponseEntity<DataRezerwacjiResponse> create(@RequestBody DataRezerwacjiRequest dataRezerwacjiRequest) {
        DataRezerwacjiResponse dataRezerwacjiResponse = dataRezerwacjiService.create(dataRezerwacjiRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(dataRezerwacjiResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find dataRezerwacji")
    public ResponseEntity<DataRezerwacjiResponse> find(@PathVariable Long id) {
        DataRezerwacjiResponse dataRezerwacjiResponse = dataRezerwacjiService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(dataRezerwacjiResponse);
    }

    @PutMapping
    @ApiOperation("Update dataRezerwacji")
    public ResponseEntity<DataRezerwacjiResponse> update(@RequestBody UpdateDataRezerwacjiRequest updateDataRezerwacjiRequest) {
        DataRezerwacjiResponse dataRezerwacjiResponse = dataRezerwacjiService.update(updateDataRezerwacjiRequest);
        return ResponseEntity.status(HttpStatus.OK).body(dataRezerwacjiResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update dataRezerwacji alternative version")
    public ResponseEntity<DataRezerwacjiResponse> update(@PathVariable Long id, @RequestBody UpdateDataRezerwacjiRequest updateDataRezerwacjiRequest) {
        DataRezerwacjiResponse dataRezerwacjiResponse = dataRezerwacjiService.updateAlternativeVersion(id, updateDataRezerwacjiRequest);
        return ResponseEntity.status(HttpStatus.OK).body(dataRezerwacjiResponse);
    }

    @GetMapping
    @ApiOperation("Find all dataRezerwacjis")
    public ResponseEntity<List<DataRezerwacjiResponse>> findAll() {
        List<DataRezerwacjiResponse> dataRezerwacjiResponses = dataRezerwacjiService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(dataRezerwacjiResponses);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete dataRezerwacji")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        dataRezerwacjiService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}