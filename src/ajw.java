// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.DialogInterface;

public final class ajw
    implements android.content.DialogInterface.OnClickListener
{

    final dbx a;
    final int b;
    final String c;
    final ala d;
    final Context e;

    public ajw(dbx dbx1, int i, String s, ala ala1, Context context)
    {
        a = dbx1;
        b = i;
        c = s;
        d = ala1;
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
