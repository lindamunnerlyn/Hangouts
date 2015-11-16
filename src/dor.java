// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class dor
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final Runnable b;
    final doq c;

    dor(doq doq1, int i, Runnable runnable)
    {
        c = doq1;
        a = i;
        b = runnable;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        doq.a(a, i);
        if (b != null)
        {
            b.run();
        }
    }
}
