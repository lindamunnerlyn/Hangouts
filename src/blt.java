// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class blt
    implements android.content.DialogInterface.OnClickListener
{

    final bls a;

    blt(bls bls1)
    {
        a = bls1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a();
    }
}
