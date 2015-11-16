// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class drk
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final Runnable b;
    final drj c;

    drk(drj drj1, int i, Runnable runnable)
    {
        c = drj1;
        a = i;
        b = runnable;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        drj.a(a, i);
        if (b != null)
        {
            b.run();
        }
    }
}
