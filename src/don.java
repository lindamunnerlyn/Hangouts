// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.DialogInterface;

final class don
    implements android.content.DialogInterface.OnClickListener
{

    final boolean a;
    final dok b;

    don(dok dok1, boolean flag)
    {
        b = dok1;
        a = flag;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ank.b(b.getContext(), dok.a(b), a);
        dok.b(b).a(a);
    }
}
