// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class czs
    implements HttpRequestInitializer
{

    final Long a;
    final String b;
    final hlm c;
    final String d;
    final int e;

    czs(Long long1, String s, hlm hlm1, String s1, int i)
    {
        a = long1;
        b = s;
        c = hlm1;
        d = s1;
        e = i;
        super();
    }

    public void initialize(HttpRequest httprequest)
    {
        httprequest.getHeaders().put("X-Device-ID", czr.b());
        String s = dzk.b();
        httprequest.getHeaders().put("X-Network-ID", s);
        httprequest.getHeaders().setUserAgent(g.i());
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
