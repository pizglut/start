package com.javappa.start.item.api;

import com.javappa.start.item.api.request.GodzinaRequest;
import com.javappa.start.item.api.request.UpdateGodzinaRequest;
import com.javappa.start.item.api.response.GodzinaResponse;
import com.javappa.start.item.service.GodzinaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Godzinas")
@RequestMapping("/api/godzina")
public class GodzinaApi {

    private final GodzinaService godzinaService;

    GodzinaApi(GodzinaService godzinaService) {
        this.godzinaService = godzinaService;
    }

    @PostMapping
    @ApiOperation("Create godzina")
    public ResponseEntity<GodzinaResponse> create(@RequestBody GodzinaRequest godzinaRequest) {
        GodzinaResponse godzinaResponse = godzinaService.create(godzinaRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(godzinaResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find godzina")
    public ResponseEntity<GodzinaResponse> find(@PathVariable Long id) {
        GodzinaResponse godzinaResponse = godzinaService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(godzinaResponse);
    }

    @PutMapping
    @ApiOperation("Update godzina")
    public ResponseEntity<GodzinaResponse> update(@RequestBody UpdateGodzinaRequest updateGodzinaRequest) {
        GodzinaResponse godzinaResponse = godzinaService.update(updateGodzinaRequest);
        return ResponseEntity.status(HttpStatus.OK).body(godzinaResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update godzina alternative version")
    public ResponseEntity<GodzinaResponse> update(@PathVariable Long id, @RequestBody UpdateGodzinaRequest updateGodzinaRequest) {
        GodzinaResponse godzinaResponse = godzinaService.updateAlternativeVersion(id, updateGodzinaRequest);
        return ResponseEntity.status(HttpStatus.OK).body(godzinaResponse);
    }

    @GetMapping
    @ApiOperation("Find all godzinas")
    public ResponseEntity<List<GodzinaResponse>> findAll() {
        List<GodzinaResponse> godzinaResponses = godzinaService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(godzinaResponses);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete godzina")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        godzinaService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}