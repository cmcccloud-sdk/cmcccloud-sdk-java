package com.cmcccloud.sdk.core.exception;

import com.cmcccloud.sdk.core.Constants;
import com.cmcccloud.sdk.core.http.HttpRequest;
import com.cmcccloud.sdk.core.http.HttpResponse;
import com.cmcccloud.sdk.core.utils.ExceptionUtils;

public class DefaultExceptionHandler implements ExceptionHandler {
    @Override
    public void handleException(HttpRequest httpRequest, HttpResponse httpResponse) {
        if (httpResponse.getStatusCode() >= Constants.StatusCode.CLIENT_ERROR) {
            throw ServiceResponseException.mapException(httpResponse.getStatusCode(),
                    ExceptionUtils.extractErrorMessage(httpResponse));
        }
    }
}
