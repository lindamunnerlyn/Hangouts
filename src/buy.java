// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class buy
    implements android.content.DialogInterface.OnDismissListener
{

    final buw a;

    buy(buw buw1)
    {
        a = buw1;
        super();
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        a.e = null;
        a.a(a.c.a());
    }
}
