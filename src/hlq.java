// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import java.util.Iterator;
import java.util.List;

final class hlq
    implements HttpExecuteInterceptor
{

    final hlp a;
    private HttpExecuteInterceptor b;

    hlq(hlp hlp1, HttpExecuteInterceptor httpexecuteinterceptor)
    {
        a = hlp1;
        super();
        b = httpexecuteinterceptor;
    }

    public void intercept(HttpRequest httprequest)
    {
        if (b != null)
        {
            b.intercept(httprequest);
        }
        httprequest = a.a.iterator();
        do
        {
            if (!httprequest.hasNext())
            {
                break;
            }
            hlr hlr1 = (hlr)httprequest.next();
            HttpExecuteInterceptor httpexecuteinterceptor = hlr1.d.getInterceptor();
            if (httpexecuteinterceptor != null)
            {
                httpexecuteinterceptor.intercept(hlr1.d);
            }
        } while (true);
    }
}
