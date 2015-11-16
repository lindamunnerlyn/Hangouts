// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net.urlconnection;

import java.net.MalformedURLException;
import java.net.URL;
import org.chromium.net.ExtendedResponseInfo;
import org.chromium.net.ResponseInfo;
import org.chromium.net.UrlRequest;
import org.chromium.net.UrlRequestException;
import org.chromium.net.UrlRequestListener;

// Referenced classes of package org.chromium.net.urlconnection:
//            CronetHttpURLConnection, CronetInputStream, MessageLoop

class a
    implements UrlRequestListener
{

    final CronetHttpURLConnection a;

    private void a()
    {
        if (CronetHttpURLConnection.e(a) != null)
        {
            CronetHttpURLConnection.e(a).a();
        }
        CronetHttpURLConnection.a(a).b();
    }

    public void a(ExtendedResponseInfo extendedresponseinfo)
    {
        CronetHttpURLConnection.a(a, extendedresponseinfo.a());
        a();
    }

    public void a(ResponseInfo responseinfo)
    {
        CronetHttpURLConnection.a(a, responseinfo);
        CronetHttpURLConnection.a(a).b();
    }

    public void a(ResponseInfo responseinfo, String s)
    {
        CronetHttpURLConnection.b(a);
        if (CronetHttpURLConnection.c(a))
        {
            try
            {
                CronetHttpURLConnection.a(a, new URL(s));
            }
            // Misplaced declaration of an exception variable
            catch (ResponseInfo responseinfo) { }
            CronetHttpURLConnection.d(a).b();
            return;
        } else
        {
            CronetHttpURLConnection.a(a, responseinfo);
            CronetHttpURLConnection.d(a).c();
            a();
            return;
        }
    }

    public void a(ResponseInfo responseinfo, UrlRequestException urlrequestexception)
    {
        if (urlrequestexception == null)
        {
            throw new IllegalStateException("Exception cannot be null in onFailed.");
        } else
        {
            CronetHttpURLConnection.a(a, responseinfo);
            CronetHttpURLConnection.a(a, urlrequestexception);
            a();
            return;
        }
    }

    public void b(ResponseInfo responseinfo)
    {
        CronetHttpURLConnection.a(a, responseinfo);
        CronetHttpURLConnection.a(a).b();
    }

    public (CronetHttpURLConnection cronethttpurlconnection)
    {
        a = cronethttpurlconnection;
        super();
    }
}
