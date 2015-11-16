// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

final class hnz
    implements hok
{

    final Activity a;
    final hny b;

    hnz(hny hny, Activity activity)
    {
        b = hny;
        a = activity;
        super();
    }

    public void a(hoy hoy)
    {
        if (hoy instanceof hnt)
        {
            ((hnt)hoy).a(a);
        }
    }
}
