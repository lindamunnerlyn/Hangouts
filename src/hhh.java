// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class hhh
{

    private static hhh a;
    private final Context b;
    private final Map c = new ConcurrentHashMap();
    private gco d;

    private hhh(Context context)
    {
        b = context.getApplicationContext();
    }

    public static hhh a(Context context)
    {
        hhh;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            a = new hhh(context);
        }
        context = a;
        hhh;
        JVM INSTR monitorexit ;
        return context;
        context;
        throw context;
    }

    public void a(Uri uri, String s, hhk hhk1, hhj hhj1)
    {
        Object obj = c;
        String s1 = String.valueOf(uri);
        obj = (Integer)((Map) (obj)).get((new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s).length())).append(s1).append(s).toString());
        if (obj != null)
        {
            hhk1.b(((Integer) (obj)).intValue());
            return;
        }
        if (hpj.a(uri))
        {
            hhj1 = hhj1.a(uri);
            b.grantUriPermission("com.google.android.gms", hhj1, 1);
        }
        if (d == null)
        {
            d = (gco)hlp.a(b, gco);
        }
        new hhi(this, uri, s, hhk1);
    }
}
