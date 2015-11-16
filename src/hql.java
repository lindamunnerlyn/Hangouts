// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import java.util.Iterator;
import java.util.List;

final class hql
    implements HttpExecuteInterceptor
{

    final hqk a;
    private HttpExecuteInterceptor b;

    hql(hqk hqk1, HttpExecuteInterceptor httpexecuteinterceptor)
    {
        a = hqk1;
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
            hqm hqm1 = (hqm)httprequest.next();
            HttpExecuteInterceptor httpexecuteinterceptor = hqm1.d.getInterceptor();
            if (httpexecuteinterceptor != null)
            {
                httpexecuteinterceptor.intercept(hqm1.d);
            }
        } while (true);
    }
}
