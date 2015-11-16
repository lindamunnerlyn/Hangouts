// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.GenericData;

public final class hpy extends hqa
{

    private String c;

    public hpy(HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, String s)
    {
        super(httptransport, jsonfactory, genericurl, "refresh_token");
        c = (String)h.a(s);
    }

    private hpy b(String s, Object obj)
    {
        return (hpy)super.a(s, obj);
    }

    public hpy a(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return (hpy)super.b(httpexecuteinterceptor);
    }

    public hpy a(HttpRequestInitializer httprequestinitializer)
    {
        return (hpy)super.b(httprequestinitializer);
    }

    public hqa a(GenericUrl genericurl)
    {
        return (hpy)super.a(genericurl);
    }

    public hqa a(String s)
    {
        return (hpy)super.a(s);
    }

    public hqa a(String s, Object obj)
    {
        return b(s, obj);
    }

    public hqa b(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return a(httpexecuteinterceptor);
    }

    public hqa b(HttpRequestInitializer httprequestinitializer)
    {
        return a(httprequestinitializer);
    }

    public GenericData set(String s, Object obj)
    {
        return b(s, obj);
    }
}
