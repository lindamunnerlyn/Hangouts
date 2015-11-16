// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import java.util.Arrays;
import java.util.logging.Logger;

// Referenced classes of package com.google.api.client.http:
//            HttpRequest, HttpRequestFactory, LowLevelHttpRequest, HttpRequestInitializer

public abstract class HttpTransport
{

    static final Logger LOGGER = Logger.getLogger(com/google/api/client/http/HttpTransport.getName());
    private static final String SUPPORTED_METHODS[];

    public HttpTransport()
    {
    }

    HttpRequest buildRequest()
    {
        return new HttpRequest(this, null);
    }

    public abstract LowLevelHttpRequest buildRequest(String s, String s1);

    public final HttpRequestFactory createRequestFactory()
    {
        return createRequestFactory(null);
    }

    public final HttpRequestFactory createRequestFactory(HttpRequestInitializer httprequestinitializer)
    {
        return new HttpRequestFactory(this, httprequestinitializer);
    }

    public void shutdown()
    {
    }

    public boolean supportsMethod(String s)
    {
        return Arrays.binarySearch(SUPPORTED_METHODS, s) >= 0;
    }

    static 
    {
        String as[] = new String[4];
        as[0] = "DELETE";
        as[1] = "GET";
        as[2] = "POST";
        as[3] = "PUT";
        SUPPORTED_METHODS = as;
        Arrays.sort(as);
    }
}
