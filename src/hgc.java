// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.nio.channels.WritableByteChannel;
import java.util.Map;
import org.chromium.net.HttpUrlConnectionUrlRequestFactory;
import org.chromium.net.HttpUrlRequest;
import org.chromium.net.HttpUrlRequestFactory;
import org.chromium.net.HttpUrlRequestListener;
import org.chromium.net.UrlRequestContextConfig;

public final class hgc
{

    private static volatile HttpUrlRequestFactory a;

    public hgc()
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
        hgc;
        JVM INSTR monitorenter ;
        if (a != null) goto _L2; else goto _L1
_L1:
        hgc;
        JVM INSTR monitorenter ;
        if (a != null) goto _L4; else goto _L3
_L3:
        Object obj1 = (HttpUrlRequestFactory)hlp.b(context, org/chromium/net/HttpUrlRequestFactory);
        Object obj = obj1;
        if (obj1 != null) goto _L6; else goto _L5
_L5:
        obj1 = (UrlRequestContextConfig)hlp.a(context, org/chromium/net/UrlRequestContextConfig);
        obj = null;
        if (!((UrlRequestContextConfig) (obj1)).d())
        {
            obj = HttpUrlRequestFactory.a(context, ((UrlRequestContextConfig) (obj1)));
        }
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        context = new HttpUrlConnectionUrlRequestFactory(context, ((UrlRequestContextConfig) (obj1)));
_L7:
        (new StringBuilder("Using network stack: ")).append(context.b());
        obj = context;
_L6:
        a = ((HttpUrlRequestFactory) (obj));
_L4:
        hgc;
        JVM INSTR monitorexit ;
_L2:
        context = a;
        hgc;
        JVM INSTR monitorexit ;
        return context;
        context;
        hgc;
        JVM INSTR monitorexit ;
        throw context;
        context;
        hgc;
        JVM INSTR monitorexit ;
        throw context;
        context = ((Context) (obj));
          goto _L7
    }
}
