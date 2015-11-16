// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class bkn
    implements android.content.DialogInterface.OnCancelListener
{

    final bkm a;

    bkn(bkm bkm1)
    {
        a = bkm1;
        super();
    }

    public void onCancel(DialogInterface dialoginterface)
    {
        a.finish();
    }
}
