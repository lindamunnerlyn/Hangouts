// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.DialogInterface;

final class axk
    implements android.content.DialogInterface.OnClickListener
{

    final long a;
    final Long b[];
    final String c;
    final Activity d;
    final avv e;

    axk(avv avv1, long l, Long along[], String s, Activity activity)
    {
        e = avv1;
        a = l;
        b = along;
        c = s;
        d = activity;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0)
        {
            avv.b(e).a(new axl(this));
        } else
        if (i == 1)
        {
            avv.a(e, a);
            return;
        }
    }
}
