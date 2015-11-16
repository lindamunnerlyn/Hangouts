// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

final class adn
    implements HttpRequestInterceptor
{

    final adk a;

    adn(adk adk1)
    {
        a = adk1;
        super();
    }

    public void process(HttpRequest httprequest, HttpContext httpcontext)
    {
        httpcontext = adk.a(a);
        if (httpcontext != null && httpcontext.e() && (httprequest instanceof HttpUriRequest))
        {
            httpcontext.a(adk.a((HttpUriRequest)httprequest));
        }
    }
}
