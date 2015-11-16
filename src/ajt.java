// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;

public final class ajt
    implements android.content.DialogInterface.OnClickListener
{

    final ddg a;
    final int b;
    final String c;
    final akx d;
    final Context e;

    public ajt(ddg ddg1, int i, String s, akx akx1, Context context)
    {
        a = ddg1;
        b = i;
        c = s;
        d = akx1;
        e = context;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        dialoginterface = a.a(b, c);
        d.a(2250);
        e.startActivity(dialoginterface);
    }
}
