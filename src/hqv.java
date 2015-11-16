// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.HttpIOExceptionHandler;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class hqv
    implements HttpIOExceptionHandler, HttpUnsuccessfulResponseHandler
{

    static final Logger a = Logger.getLogger(hqv.getName());
    private final hqt b;
    private final HttpIOExceptionHandler c;
    private final HttpUnsuccessfulResponseHandler d;

    public hqv(hqt hqt1, HttpRequest httprequest)
    {
        b = (hqt)h.a(hqt1);
        c = httprequest.getIOExceptionHandler();
        d = httprequest.getUnsuccessfulResponseHandler();
        httprequest.setIOExceptionHandler(this);
        httprequest.setUnsuccessfulResponseHandler(this);
    }

    public boolean handleIOException(HttpRequest httprequest, boolean flag)
    {
        if (c != null && c.handleIOException(httprequest, flag))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            try
            {
                b.a();
            }
            // Misplaced declaration of an exception variable
            catch (HttpRequest httprequest)
            {
                a.log(Level.WARNING, "exception thrown while calling server callback", httprequest);
                return flag;
            }
        }
        return flag;
    }

    public boolean handleResponse(HttpRequest httprequest, HttpResponse httpresponse, boolean flag)
    {
        boolean flag1;
        if (d != null && d.handleResponse(httprequest, httpresponse, flag))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 && flag && httpresponse.getStatusCode() / 100 == 5)
        {
            try
            {
                b.a();
            }
            // Misplaced declaration of an exception variable
            catch (HttpRequest httprequest)
            {
                a.log(Level.WARNING, "exception thrown while calling server callback", httprequest);
                return flag1;
            }
        }
        return flag1;
    }

}
