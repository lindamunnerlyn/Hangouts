// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class cdg
{

    private static final boolean a = false;
    private static final efh b = efh.a("VolleyUtils");
    private static afz c = null;

    public static afz a()
    {
        cdg;
        JVM INSTR monitorenter ;
        if (c != null) goto _L2; else goto _L1
_L1:
        Object obj = b.b("RQ initialization");
        Object obj1 = g.nU;
        fts.a(((Context) (obj1)));
_L3:
        Object obj2 = ffc.a(g.h(), ((Context) (obj1)));
        if (a)
        {
            ((ffc) (obj2)).a("Babel");
            eev.b("Babel", "initialize Volley request queue");
        }
        obj2 = new agl(new ago(((org.apache.http.client.HttpClient) (obj2))));
        obj1 = new afz(new cde(((Context) (obj1)).getCacheDir(), g.a(g.nU, "babel_volley_cache_size", 0x3200000)), ((afq) (obj2)), g.a(g.nU, "babel_thread_pool_size", 2));
        c = ((afz) (obj1));
        ((afz) (obj1)).a();
        b.c(((String) (obj)));
_L2:
        obj = c;
        cdg;
        JVM INSTR monitorexit ;
        return ((afz) (obj));
        Object obj3;
        obj3;
        eev.e("Babel", "Temporarily unable to update security library", ((Throwable) (obj3)));
        emo.a(((emn) (obj3)).a(), ((Context) (obj1)));
          goto _L3
        Exception exception1;
        exception1;
        b.c(((String) (obj)));
        throw exception1;
        Exception exception;
        exception;
        cdg;
        JVM INSTR monitorexit ;
        throw exception;
        obj3;
        eev.e("Babel", "Permanently unable to update security library", ((Throwable) (obj3)));
          goto _L3
    }

    public static void a(String s)
    {
        a();
        afk afk1 = c.b();
        if (afk1 != null)
        {
            afk1.b(s);
        }
    }

    static 
    {
        hnc hnc = eev.h;
    }
}
