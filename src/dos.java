// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class dos
    implements android.content.DialogInterface.OnCancelListener
{

    final Runnable a;
    final doq b;

    dos(doq doq, Runnable runnable)
    {
        b = doq;
        a = runnable;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        if (a != null)
        {
            a.run();
        }
    }
}
