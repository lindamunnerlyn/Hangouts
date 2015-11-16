// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import g;
import h;
import hmw;
import hod;

// Referenced classes of package com.google.api.client.http:
//            HttpUnsuccessfulResponseHandler, HttpRequest, HttpResponse

public class HttpBackOffUnsuccessfulResponseHandler
    implements HttpUnsuccessfulResponseHandler
{

    private final hmw backOff;
    private BackOffRequired backOffRequired;
    private hod sleeper;

    public HttpBackOffUnsuccessfulResponseHandler(hmw hmw1)
    {
        backOffRequired = BackOffRequired.ON_SERVER_ERROR;
        sleeper = hod.a;
        backOff = (hmw)h.b(hmw1);
    }

    public final hmw getBackOff()
    {
        return backOff;
    }

    public final BackOffRequired getBackOffRequired()
    {
        return backOffRequired;
    }

    public final hod getSleeper()
    {
        return sleeper;
    }

    public final boolean handleResponse(HttpRequest httprequest, HttpResponse httpresponse, boolean flag)
    {
        while (!flag || !backOffRequired.isRequired(httpresponse)) 
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

    public HttpBackOffUnsuccessfulResponseHandler setBackOffRequired(BackOffRequired backoffrequired)
    {
        backOffRequired = (BackOffRequired)h.b(backoffrequired);
        return this;
    }

    public HttpBackOffUnsuccessfulResponseHandler setSleeper(hod hod1)
    {
        sleeper = (hod)h.b(hod1);
        return this;
    }

    private class BackOffRequired
    {

        public static final BackOffRequired ALWAYS = new _cls1();
        public static final BackOffRequired ON_SERVER_ERROR = new _cls2();

        public abstract boolean isRequired(HttpResponse httpresponse);


        class _cls1
            implements BackOffRequired
        {

            public boolean isRequired(HttpResponse httpresponse)
            {
                return true;
            }

                _cls1()
                {
                }
        }


        class _cls2
            implements BackOffRequired
        {

            public boolean isRequired(HttpResponse httpresponse)
            {
                return httpresponse.getStatusCode() / 100 == 5;
            }

                _cls2()
                {
                }
        }

    }

}
