// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class bmh
    implements android.content.DialogInterface.OnClickListener
{

    final bmf a;

    bmh(bmf bmf1)
    {
        a = bmf1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.a();
        bmb.a((bmb)a.getTargetFragment());
    }
}
