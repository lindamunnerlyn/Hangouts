// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;

public final class gkz
    implements Runnable
{

    final gmn a;
    final gds b;
    final Handler c;
    long d;
    boolean e;
    private final gjl f;

    public gkz(Context context, gjl gjl1, gmn gmn1, gds gds)
    {
        this(gjl1, gmn1, new Handler(context.getMainLooper()), gds);
    }

    private gkz(gjl gjl1, gmn gmn1, Handler handler, gds gds)
    {
        f = gjl1;
        a = gmn1;
        c = handler;
        b = gds;
        d = -1L;
        e = false;
    }

    public static boolean a(gmn gmn1)
    {
        while (gmn1.f() != null || gmn1.m() == null && gmn1.g() == null && !b(gmn1)) 
        {
            return false;
        }
        return true;
    }

    static boolean b(gmn gmn1)
    {
        return gmn1.i() != null || gmn1.k() != null || gmn1.l() != null;
    }

    private jhw c()
    {
        jhw jhw1 = new jhw();
        if ("conversation".equals(a.g()))
        {
            int i;
            if (a.t())
            {
                i = 1;
            } else
            {
                i = 2;
            }
            jhw1.e = Integer.valueOf(i);
        }
        jhw1.d = Boolean.valueOf(true);
        return jhw1;
    }

    public void a()
    {
        e = true;
    }

    public void b()
    {
        gdv.a("Nothing to resolve.", a(a));
        if (e)
        {
            gne.a(4, "vclib", "Resolve flow canceled");
            return;
        }
        jhw jhw1;
        if (b(a))
        {
            jhy jhy1 = new jhy();
            jhy1.b = a.i();
            jhy1.a = a.j();
            if (!TextUtils.isEmpty(a.k()) && !TextUtils.isEmpty(a.l()))
            {
                jhy1.c = a.k();
                jhy1.d = a.l();
            }
            jhw1 = c();
            jhw1.c = jhy1;
        } else
        if (a.g() != null)
        {
            jhb jhb1 = new jhb();
            jhb1.a = a.g();
            jhb1.b = a.h();
            jhw1 = c();
            jhw1.a = jhb1;
        } else
        if (a.m() != null)
        {
            jhw1 = c();
            jhw1.f = a.m().toString();
        } else
        {
            throw new IllegalArgumentException("CreateResolve request is not external key, named room or sharing url.");
        }
        gne.a("vclib", "Issuing resolve request (%s)", new Object[] {
            jhw1
        });
        f.a(jhw1, new gla(this));
    }

    public void run()
    {
        b();
    }
}
