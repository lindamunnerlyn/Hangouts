// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class alg
{

    private final boolean a;
    private final beb b = (new bec()).a("callmemaybe").b("Module that hosts the CallMeMaybe feature.").a(true).a();

    public alg()
    {
        a = g.a(g.nS, "babel_enable_call_me_maybe", true);
    }

    ali a(Context context)
    {
        if (a)
        {
            return new ali(context);
        } else
        {
            return null;
        }
    }

    alm a(hgx hgx1, Context context)
    {
        if (a)
        {
            return (alm)b.a(context, new alm(context, hgx1));
        } else
        {
            return null;
        }
    }

    public beb[] a()
    {
        return (new beb[] {
            b
        });
    }

    gmx[] b(Context context)
    {
        if (a)
        {
            return (new gmx[] {
                (gmx)hgx.b(context, ali)
            });
        } else
        {
            return new gmx[0];
        }
    }

    public gxq[] b(hgx hgx1, Context context)
    {
        if (a)
        {
            return (gxq[])b.a(context, gxq, hgx1.b(alm));
        } else
        {
            return new gxq[0];
        }
    }

    ddm[] c(Context context)
    {
        if (a)
        {
            return (new ddm[] {
                (ddm)hgx.b(context, ali)
            });
        } else
        {
            return new ddm[0];
        }
    }
}
