// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dky
{

    final ber a = (new bes()).a("ConcurrentService").b("Concurrent Services.").a(false).a();

    public dky()
    {
    }

    public dkx a(Context context)
    {
        return new dkz(this, context);
    }

    public ber[] a()
    {
        return (new ber[] {
            a
        });
    }

    public amb[] b(Context context)
    {
        if (a.a(context))
        {
            return (new amb[] {
                new amb(djv), new amb(dkb)
            });
        } else
        {
            return new amb[0];
        }
    }
}
