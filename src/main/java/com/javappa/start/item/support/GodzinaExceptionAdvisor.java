package com.javappa.start.item.support;

import com.javappa.start.item.support.exception.GodzinaNotFoundException;
import com.javappa.start.shared.api.response.ErrorMessageResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GodzinaExceptionAdvisor {

    private static final Logger LOG = LoggerFactory.getLogger(GodzinaExceptionAdvisor.class);

    @ExceptionHandler(GodzinaNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public ErrorMessageResponse godzinaNotFound(GodzinaNotFoundException exception) {
        LOG.error(exception.getMessage(), exception);
        return new ErrorMessageResponse(exception.getLocalizedMessage());
    }
}
