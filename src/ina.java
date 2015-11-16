// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class ina
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final android.content.DialogInterface.OnClickListener b;
    final imz c;

    ina(imz imz1, String s, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        c = imz1;
        a = s;
        b = onclicklistener;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        imz.a(c).a(a);
        b.onClick(dialoginterface, i);
        ino.a(a);
        return;
        dialoginterface;
        ino.a(a);
        throw dialoginterface;
    }
}
