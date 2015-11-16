// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;

import android.content.Context;
import java.nio.channels.WritableByteChannel;
import java.util.Map;

// Referenced classes of package org.chromium.net:
//            HttpUrlRequestFactory, UrlRequestContextConfig, UserAgent, Version, 
//            HttpUrlConnectionUrlRequest, HttpUrlRequestListener, HttpUrlRequest

class HttpUrlConnectionUrlRequestFactory extends HttpUrlRequestFactory
{

    private final Context a;
    private final String b;

    public HttpUrlConnectionUrlRequestFactory(Context context, UrlRequestContextConfig urlrequestcontextconfig)
    {
        a = context;
        urlrequestcontextconfig = urlrequestcontextconfig.a();
        context = urlrequestcontextconfig;
        if (urlrequestcontextconfig.isEmpty())
        {
            context = UserAgent.a(a);
        }
        b = context;
    }

    public boolean a()
    {
        return true;
    }

    public String b()
    {
        return (new StringBuilder("HttpUrlConnection/")).append(Version.a()).toString();
    }

    public HttpUrlRequest b(String s, int i, Map map, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener)
    {
        return new HttpUrlConnectionUrlRequest(a, b, s, map, writablebytechannel, httpurlrequestlistener);
    }

    public HttpUrlRequest b(String s, int i, Map map, HttpUrlRequestListener httpurlrequestlistener)
    {
        return new HttpUrlConnectionUrlRequest(a, b, s, map, httpurlrequestlistener);
    }
}
