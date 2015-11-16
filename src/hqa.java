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

public class hqa extends GenericData
{

    HttpRequestInitializer a;
    HttpExecuteInterceptor b;
    private final HttpTransport c;
    private final JsonFactory d;
    private GenericUrl e;
    private String f;

    public hqa(HttpTransport httptransport, JsonFactory jsonfactory, GenericUrl genericurl, String s)
    {
        c = (HttpTransport)h.a(httptransport);
        d = (JsonFactory)h.a(jsonfactory);
        a(genericurl);
        a(s);
    }

    public hqa a(GenericUrl genericurl)
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

    public hqa a(String s)
    {
        f = (String)h.a(s);
        return this;
    }

    public hqa a(String s, Object obj)
    {
        return (hqa)super.set(s, obj);
    }

    public hqd a()
    {
        Object obj = c.createRequestFactory(new hqb(this)).buildPostRequest(e, new UrlEncodedContent(this));
        ((HttpRequest) (obj)).setParser(new JsonObjectParser(d));
        ((HttpRequest) (obj)).setThrowExceptionOnExecuteError(false);
        obj = ((HttpRequest) (obj)).execute();
        if (((HttpResponse) (obj)).isSuccessStatusCode())
        {
            return (hqd)((HttpResponse) (obj)).parseAs(hqd);
        } else
        {
            throw hqe.a(d, ((HttpResponse) (obj)));
        }
    }

    public hqa b(HttpExecuteInterceptor httpexecuteinterceptor)
    {
        b = httpexecuteinterceptor;
        return this;
    }

    public hqa b(HttpRequestInitializer httprequestinitializer)
    {
        a = httprequestinitializer;
        return this;
    }

    public GenericData set(String s, Object obj)
    {
        return a(s, obj);
    }
}
