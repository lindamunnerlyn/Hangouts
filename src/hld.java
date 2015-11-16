// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.GenericData;

public final class hld extends hlf
{

    private String c;

    public hld(HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, String s)
    {
        super(httptransport, jsonfactory, genericurl, "refresh_token");
        c = (String)h.b(s);
    }

    private hld b(String s, Object obj)
    {
        return (hld)super.a(s, obj);
    }

    public hld a(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return (hld)super.b(httpexecuteinterceptor);
    }

    public hld a(HttpRequestInitializer httprequestinitializer)
    {
        return (hld)super.b(httprequestinitializer);
    }

    public hlf a(GenericUrl genericurl)
    {
        return (hld)super.a(genericurl);
    }

    public hlf a(String s)
    {
        return (hld)super.a(s);
    }

    public hlf a(String s, Object obj)
    {
        return b(s, obj);
    }

    public hlf b(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        return a(httpexecuteinterceptor);
    }

    public hlf b(HttpRequestInitializer httprequestinitializer)
    {
        return a(httprequestinitializer);
    }

    public GenericData set(String s, Object obj)
    {
        return b(s, obj);
    }
}
