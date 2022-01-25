package com.javappa.start.item.api;

import com.javappa.start.item.api.request.EmailRequest;
import com.javappa.start.item.api.request.UpdateEmailRequest;
import com.javappa.start.item.api.response.EmailResponse;
import com.javappa.start.item.service.EmailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "Emails")
@RequestMapping("/api/email")
public class EmailApi {

    private final EmailService emailService;

    EmailApi(EmailService emailService) {
        this.emailService = emailService;
    }

    @PostMapping
    @ApiOperation("Create email")
    public ResponseEntity<EmailResponse> create(@RequestBody EmailRequest emailRequest) {
        EmailResponse emailResponse = emailService.create(emailRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(emailResponse);
    }

    @GetMapping("/{id}")
    @ApiOperation("Find email")
    public ResponseEntity<EmailResponse> find(@PathVariable Long id) {
        EmailResponse emailResponse = emailService.find(id);
        return ResponseEntity.status(HttpStatus.OK).body(emailResponse);
    }

    @PutMapping
    @ApiOperation("Update email")
    public ResponseEntity<EmailResponse> update(@RequestBody UpdateEmailRequest updateEmailRequest) {
        EmailResponse emailResponse = emailService.update(updateEmailRequest);
        return ResponseEntity.status(HttpStatus.OK).body(emailResponse);
    }

    @PutMapping("/{id}")
    @ApiOperation("Update email alternative version")
    public ResponseEntity<EmailResponse> update(@PathVariable Long id, @RequestBody UpdateEmailRequest updateEmailRequest) {
        EmailResponse emailResponse = emailService.updateAlternativeVersion(id, updateEmailRequest);
        return ResponseEntity.status(HttpStatus.OK).body(emailResponse);
    }

    @GetMapping
    @ApiOperation("Find all emails")
    public ResponseEntity<List<EmailResponse>> findAll() {
        List<EmailResponse> emailResponses = emailService.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(emailResponses);
    }

    @DeleteMapping("/{id}")
    @ApiOperation("Delete email")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        emailService.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}