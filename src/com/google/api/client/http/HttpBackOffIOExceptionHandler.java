// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import g;
import h;
import hrs;
import hsz;

// Referenced classes of package com.google.api.client.http:
//            HttpIOExceptionHandler, HttpRequest

public class HttpBackOffIOExceptionHandler
    implements HttpIOExceptionHandler
{

    private final hrs backOff;
    private hsz sleeper;

    public HttpBackOffIOExceptionHandler(hrs hrs1)
    {
        sleeper = hsz.a;
        backOff = (hrs)h.a(hrs1);
    }

    public final hrs getBackOff()
    {
        return backOff;
    }

    public final hsz getSleeper()
    {
        return sleeper;
    }

    public boolean handleIOException(HttpRequest httprequest, boolean flag)
    {
        if (!flag)
        {
            return false;
        }
        try
        {
            flag = g.a(sleeper, backOff);
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            return false;
        }
        return flag;
    }

    public HttpBackOffIOExceptionHandler setSleeper(hsz hsz1)
    {
        sleeper = (hsz)h.a(hsz1);
        return this;
    }
}
