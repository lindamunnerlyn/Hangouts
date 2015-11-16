// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.google.android.libraries.hangouts.video.CallService;

public final class ges extends Binder
    implements gmp
{

    final CallService a;

    public ges(CallService callservice)
    {
        a = callservice;
        super();
    }

    public gmm a(gmn gmn)
    {
        gdv.a("Expected null", a.d);
        a.d = new geb(a.c, gmn);
        a.d.a(new get(this));
        return a.d;
    }

    public gmr a()
    {
        return new gmr(a.a.a());
    }

    public gmm b()
    {
        if (a.d == null)
        {
            a.stopForeground(true);
        }
        return a.d;
    }
}
