// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlertDialog;

final class akn
    implements hff
{

    final ajo a;
    final AlertDialog b;
    final aki c;

    akn(aki aki1, ajo ajo1, AlertDialog alertdialog)
    {
        c = aki1;
        a = ajo1;
        b = alertdialog;
        super();
    }

    public boolean a()
    {
        if (aki.d(c) == null || aki.d(c).isEmpty() || !aki.d(c).equals(a.c()))
        {
            b.show();
        } else
        if (aki.e(c))
        {
            c.a(a.c());
            return true;
        }
        return true;
    }
}
