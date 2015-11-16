// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.nio.channels.WritableByteChannel;
import java.util.Map;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.UrlRequestContextConfig;

public final class hbl
{

    private static volatile HttpUrlRequestFactory a;

    public hbl()
    {
    }

    public static HttpUrlRequest a(Context context, String s, int i, Map map, WritableByteChannel writablebytechannel, HttpUrlRequestListener httpurlrequestlistener)
    {
        return a(context).b(s, i, map, writablebytechannel, httpurlrequestlistener);
    }

    public static HttpUrlRequest a(Context context, String s, int i, Map map, HttpUrlRequestListener httpurlrequestlistener)
    {
        return a(context).b(s, i, map, httpurlrequestlistener);
    }

    private static HttpUrlRequestFactory a(Context context)
    {
        hbl;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        hbl;
        JVM INSTR monitorenter ;
        HttpUrlRequestFactory httpurlrequestfactory1;
        if (a != null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        httpurlrequestfactory1 = (HttpUrlRequestFactory)hgx.b(context, org/chromium/net/HttpUrlRequestFactory);
        HttpUrlRequestFactory httpurlrequestfactory;
        httpurlrequestfactory = httpurlrequestfactory1;
        if (httpurlrequestfactory1 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        httpurlrequestfactory = HttpUrlRequestFactory.a(context, (UrlRequestContextConfig)hgx.a(context, org/chromium/net/UrlRequestContextConfig));
        a = httpurlrequestfactory;
        hbl;
        JVM INSTR monitorexit ;
_L2:
        context = a;
        hbl;
        JVM INSTR monitorexit ;
        return context;
        context;
        hbl;
        JVM INSTR monitorexit ;
        throw context;
        context;
        hbl;
        JVM INSTR monitorexit ;
        throw context;
    }
}
