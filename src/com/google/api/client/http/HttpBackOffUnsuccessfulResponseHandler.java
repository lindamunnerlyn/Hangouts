// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import g;
import h;
import hrs;
import hsz;

// Referenced classes of package com.google.api.client.http:
//            HttpUnsuccessfulResponseHandler, HttpRequest, HttpResponse

public class HttpBackOffUnsuccessfulResponseHandler
    implements HttpUnsuccessfulResponseHandler
{

    private final hrs backOff;
    private BackOffRequired backOffRequired;
    private hsz sleeper;

    public HttpBackOffUnsuccessfulResponseHandler(hrs hrs1)
    {
        backOffRequired = BackOffRequired.ON_SERVER_ERROR;
        sleeper = hsz.a;
        backOff = (hrs)h.a(hrs1);
    }

    public final hrs getBackOff()
    {
        return backOff;
    }

    public final BackOffRequired getBackOffRequired()
    {
        return backOffRequired;
    }

    public final hsz getSleeper()
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
        backOffRequired = (BackOffRequired)h.a(backoffrequired);
        return this;
    }

    public HttpBackOffUnsuccessfulResponseHandler setSleeper(hsz hsz1)
    {
        sleeper = (hsz)h.a(hsz1);
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
