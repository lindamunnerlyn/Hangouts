// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import java.util.Map;
import org.apache.http.client.HttpResponseException;
import org.chromium.net.HttpUrlRequest;

public final class bwb
    implements gbg
{

    public bwb()
    {
    }

    public byte[] a(Context context, String s, Map map, byte abyte0[], int i)
    {
        return a(context, s, map, abyte0, i, 3);
    }

    public byte[] a(Context context, String s, Map map, byte abyte0[], int i, int j)
    {
        bwc bwc1 = new bwc();
        context = hbl.a(context, s, j, map, bwc1);
        if (abyte0 != null)
        {
            context.a("application/x-protobuf", abyte0);
            context.a("POST");
        } else
        {
            context.a("GET");
        }
        context.h();
        if (!bwc.a(bwc1).block(i))
        {
            context = new HttpResponseException(0, "cronet http timeout");
            ebw.d("Babel_CronetHttpRequestSender", "Cronet HTTP request timeout", context);
            throw context;
        }
        if (bwc.b(bwc1) != null)
        {
            ebw.d("Babel_CronetHttpRequestSender", "Cronet HTTP request failed", bwc.b(bwc1));
            throw bwc.b(bwc1);
        } else
        {
            return bwc.c(bwc1);
        }
    }
}
