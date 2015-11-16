// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class bqt
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final bqo b;

    bqt(bqo bqo1, String s)
    {
        b = bqo1;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        bpz.a(a).a(bqo.g(b).e(), null);
    }
}
