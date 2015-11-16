// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class byw
{

    private boolean a;
    private final beb b = (new bec()).a("locationtos").b("Module that hosts the location terms of service notification.").a(true).a();

    public byw()
    {
        a = false;
        a = g.a(g.nS, "babel_enable_kr_location_tos", true);
    }

    public beb[] a()
    {
        return (new beb[] {
            b
        });
    }

    public cqv[] a(Context context)
    {
        if (a)
        {
            return (cqv[])b.a(context, cqv, new byv());
        } else
        {
            return null;
        }
    }
}
