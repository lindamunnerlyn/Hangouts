// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;

final class hlh
    implements HttpExecuteInterceptor
{

    final HttpExecuteInterceptor a;
    final hlg b;

    hlh(hlg hlg1, HttpExecuteInterceptor httpexecuteinterceptor)
    {
        b = hlg1;
        a = httpexecuteinterceptor;
        super();
    }

    public void intercept(HttpRequest httprequest)
    {
        if (a != null)
        {
            a.intercept(httprequest);
        }
        if (b.a.b != null)
        {
            b.a.b.intercept(httprequest);
        }
    }
}
