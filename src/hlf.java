// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.UrlEncodedContent;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.GenericData;

public class hlf extends GenericData
{

    HttpRequestInitializer a;
    HttpExecuteInterceptor b;
    private final HttpTransport c;
    private final JsonFactory d;
    private GenericUrl e;
    private String f;

    public hlf(HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, String s)
    {
        c = (HttpTransport)h.b(httptransport);
        d = (JsonFactory)h.b(jsonfactory);
        a(genericurl);
        a(s);
    }

    public hlf a(GenericUrl genericurl)
    {
        e = genericurl;
        boolean flag;
        if (genericurl.getFragment() == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l.a(flag);
        return this;
    }

    public hlf a(String s)
    {
        f = (String)h.b(s);
        return this;
    }

    public hlf a(String s, Object obj)
    {
        return (hlf)super.set(s, obj);
    }

    public hli a()
    {
        Object obj = c.createRequestFactory(new hlg(this)).buildPostRequest(e, new UrlEncodedContent(this));
        ((HttpRequest) (obj)).setParser(new JsonObjectParser(d));
        ((HttpRequest) (obj)).setThrowExceptionOnExecuteError(false);
        obj = ((HttpRequest) (obj)).execute();
        if (((HttpResponse) (obj)).isSuccessStatusCode())
        {
            return (hli)((HttpResponse) (obj)).parseAs(hli);
        } else
        {
            throw hlj.a(d, ((HttpResponse) (obj)));
        }
    }

    public hlf b(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        b = httpexecuteinterceptor;
        return this;
    }

    public hlf b(HttpRequestInitializer httprequestinitializer)
    {
        a = httprequestinitializer;
        return this;
    }

    public GenericData set(String s, Object obj)
    {
        return a(s, obj);
    }
}
