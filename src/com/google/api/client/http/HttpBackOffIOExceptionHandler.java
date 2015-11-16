// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import g;
import h;
import hmw;
import hod;

// Referenced classes of package com.google.api.client.http:
//            HttpIOExceptionHandler, HttpRequest

public class HttpBackOffIOExceptionHandler
    implements HttpIOExceptionHandler
{

    private final hmw backOff;
    private hod sleeper;

    public HttpBackOffIOExceptionHandler(hmw hmw1)
    {
        sleeper = hod.a;
        backOff = (hmw)h.b(hmw1);
    }

    public final hmw getBackOff()
    {
        return backOff;
    }

    public final hod getSleeper()
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

    public HttpBackOffIOExceptionHandler setSleeper(hod hod1)
    {
        sleeper = (hod)h.b(hod1);
        return this;
    }
}
