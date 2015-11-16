// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class bqk
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final bqf b;

    bqk(bqf bqf1, String s)
    {
        b = bqf1;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        bpq.a(a).a(bqf.g(b).e(), null);
    }
}
