// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class hcq
{

    private static hcq a;
    private final Context b;
    private final Map c = new ConcurrentHashMap();
    private gaa d;

    private hcq(Context context)
    {
        b = context.getApplicationContext();
    }

    public static hcq a(Context context)
    {
        hcq;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new hcq(context);
        }
        context = a;
        hcq;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void a(Uri uri, String s, hct hct1, hcs hcs1)
    {
        Object obj = c;
        String s1 = String.valueOf(uri);
        obj = (Integer)((Map) (obj)).get((new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s).length())).append(s1).append(s).toString());
        if (obj != null)
        {
            hct1.b(((Integer) (obj)).intValue());
            return;
        }
        if (hko.a(uri))
        {
            hcs1 = hcs1.a(uri);
            b.grantUriPermission("com.google.android.gms", hcs1, 1);
        }
        if (d == null)
        {
            d = (gaa)hgx.a(b, gaa);
        }
        new hcr(this, uri, s, hct1);
    }
}
