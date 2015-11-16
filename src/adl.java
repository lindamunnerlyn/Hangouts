// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

final class adl
    implements HttpRequestInterceptor
{

    final adi a;

    adl(adi adi1)
    {
        a = adi1;
        super();
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        httpcontext = adi.a(a);
        if (httpcontext != null && httpcontext.e() && (httprequest instanceof HttpUriRequest))
        {
            httpcontext.a(adi.a((HttpUriRequest)httprequest));
        }
    }
}
