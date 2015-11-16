// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class axd
    implements android.content.DialogInterface.OnClickListener
{

    final int a;
    final ave b;

    axd(ave ave1, int i)
    {
        b = ave1;
        a = i;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        if (i == 0)
        {
            ave.d(b, a);
        } else
        if (i == 1)
        {
            ave.e(b, a);
            return;
        }
    }
}
