// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ccb
{

    private static final boolean a = false;
    private static afx b = null;
    private static final Object c = new Object();

    public static afx a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = b;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        ecd.a("VolleyUtils RQ initialization");
        obj1 = g.nS;
        frl.a(((Context) (obj1)));
_L5:
        Object obj2 = fce.a(g.i(), ((Context) (obj1)));
        if (a)
        {
            ((fce) (obj2)).a("Babel");
            ebw.b("Babel", "initialize Volley request queue");
        }
        obj2 = new agj(new agm(((org.apache.http.client.HttpClient) (obj2))));
        obj1 = new afx(new cbz(((Context) (obj1)).getCacheDir(), g.a(g.nS, "babel_volley_cache_size", 0x3200000)), ((afo) (obj2)), g.a(g.nS, "babel_thread_pool_size", 2));
        b = ((afx) (obj1));
        ((afx) (obj1)).a();
        ecd.a();
_L4:
        obj;
        JVM INSTR monitorexit ;
_L2:
        return b;
        Object obj3;
        obj3;
        ebw.e("Babel", "Temporarily unable to update security library", ((Throwable) (obj3)));
        ejn.a(((ejm) (obj3)).a(), ((Context) (obj1)));
          goto _L5
        Exception exception;
        exception;
        ecd.a();
        throw exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj3;
        ebw.e("Babel", "Permanently unable to update security library", ((Throwable) (obj3)));
          goto _L5
    }

    public static void a(String s)
    {
        a();
        b.b().b(s);
    }

    static 
    {
        hik hik = ebw.h;
    }
}
