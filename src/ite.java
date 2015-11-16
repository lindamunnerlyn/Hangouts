// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class ite
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final android.content.DialogInterface.OnClickListener b;
    final itd c;

    ite(itd itd1, String s, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        c = itd1;
        a = s;
        b = onclicklistener;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        c.a.a(a);
        b.onClick(dialoginterface, i);
        its.a(a);
        return;
        dialoginterface;
        its.a(a);
        throw dialoginterface;
    }
}
