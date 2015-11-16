// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;

final class hqb
    implements HttpRequestInitializer
{

    final hqa a;

    hqb(hqa hqa1)
    {
        a = hqa1;
        super();
    }

    public void initialize(HttpRequest httprequest)
    {
        if (a.a != null)
        {
            a.a.initialize(httprequest);
        }
        httprequest.setInterceptor(new hqc(this, httprequest.getInterceptor()));
    }
}
