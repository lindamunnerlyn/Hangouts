// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class gft
    implements HttpRequestInitializer
{

    final String a;
    final String b;
    final hlm c;
    final int d;

    gft(String s, String s1, hlm hlm1, int i)
    {
        a = s;
        b = s1;
        c = hlm1;
        d = i;
        super();
    }

    public void initialize(HttpRequest httprequest)
    {
        if (httprequest != null)
        {
            HttpHeaders httpheaders = httprequest.getHeaders();
            String s;
            if (a != null)
            {
                s = a;
            } else
            {
                s = "none";
            }
            httpheaders.put("X-Auth-Time", s);
            if (b != null)
            {
                c.initialize(httprequest);
            }
            httprequest.setConnectTimeout(d);
            httprequest.setReadTimeout(d);
        }
    }
}
