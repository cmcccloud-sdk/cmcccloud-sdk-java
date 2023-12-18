package com.cmcccloud.sdk.core.exception;

import com.cmcccloud.sdk.core.http.HttpRequest;
import com.cmcccloud.sdk.core.http.HttpResponse;

public interface ExceptionHandler {
    void handleException(HttpRequest httpRequest, HttpResponse httpResponse) throws ServiceResponseException;
}
