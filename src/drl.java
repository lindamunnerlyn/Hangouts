// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class drl
    implements android.content.DialogInterface.OnCancelListener
{

    final Runnable a;
    final drj b;

    drl(drj drj, Runnable runnable)
    {
        b = drj;
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
