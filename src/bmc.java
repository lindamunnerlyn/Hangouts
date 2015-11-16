// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class bmc
    implements android.content.DialogInterface.OnClickListener
{

    final bmb a;

    bmc(bmb bmb1)
    {
        a = bmb1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a();
    }
}
