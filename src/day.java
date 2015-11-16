// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class day
    implements HttpRequestInitializer
{

    final Long a;
    final String b;
    final hqh c;
    final String d;
    final int e;

    day(Long long1, String s, hqh hqh1, String s1, int i)
    {
        a = long1;
        b = s;
        c = hqh1;
        d = s1;
        e = i;
        super();
    }

    public void initialize(HttpRequest httprequest)
    {
        httprequest.getHeaders().put("X-Device-ID", dax.b);
        String s = eco.b();
        httprequest.getHeaders().put("X-Network-ID", s);
        httprequest.getHeaders().setUserAgent(g.h());
        HttpHeaders httpheaders = httprequest.getHeaders();
        if (a != null)
        {
            s = a.toString();
        } else
        {
            s = "none";
        }
        httpheaders.put("X-Auth-Time", s);
        if (b != null)
        {
            c.initialize(httprequest);
        }
        if (d != null)
        {
            httprequest.getHeaders().put("X-Goog-PageId", d);
        }
        httprequest.setConnectTimeout(e);
        httprequest.setReadTimeout(e);
    }
}
