// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.ConditionVariable;
import java.util.Map;
import org.apache.http.client.HttpResponseException;
import org.chromium.net.HttpUrlRequest;

public final class bwv
    implements gdu
{

    public bwv()
    {
    }

    public byte[] a(Context context, String s, Map map, byte abyte0[], int i)
    {
        return a(context, s, map, abyte0, i, 3);
    }

    public byte[] a(Context context, String s, Map map, byte abyte0[], int i, int j)
    {
        bww bww1 = new bww();
        if (eev.a("Babel_CronetHttpSender", 3))
        {
            eev.c("Babel_CronetHttpSender", String.format("Request headers for [%s]: %s", new Object[] {
                s, map
            }));
        }
        context = hgc.a(context, s, j, map, bww1);
        if (abyte0 != null)
        {
            context.a("application/x-protobuf", abyte0);
            context.a("POST");
        } else
        {
            context.a("GET");
        }
        context.h();
        if (!bww1.a.block(i))
        {
            context = new HttpResponseException(0, "cronet http timeout");
            eev.d("Babel_CronetHttpSender", "Cronet HTTP request timeout", context);
            throw context;
        }
        if (bww1.c != null)
        {
            eev.d("Babel_CronetHttpSender", "Cronet HTTP request failed", bww1.c);
            throw bww1.c;
        } else
        {
            return bww1.b;
        }
    }
}
