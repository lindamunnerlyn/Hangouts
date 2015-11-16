// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class axr
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final long b;
    final avv c;

    axr(avv avv1, String s, long l)
    {
        c = avv1;
        a = s;
        b = l;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0)
        {
            avv.a(c, a, b);
        } else
        if (i == 1)
        {
            avv.b(c, b);
            return;
        }
    }
}
