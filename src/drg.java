// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class drg
    implements android.content.DialogInterface.OnClickListener
{

    final boolean a;
    final drd b;

    drg(drd drd1, boolean flag)
    {
        b = drd1;
        a = flag;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        aoc.b(b.getContext(), drd.a(b), a);
        drd.b(b).a(a);
    }
}
