// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class bmq
    implements android.content.DialogInterface.OnClickListener
{

    final bmo a;

    bmq(bmo bmo1)
    {
        a = bmo1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a();
        bmk.a((bmk)a.getTargetFragment());
    }
}
