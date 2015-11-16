// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class bfh
    implements android.view.View.OnClickListener
{

    final beu a;
    final bfd b;

    bfh(bfd bfd1, beu beu)
    {
        b = bfd1;
        a = beu;
        super();
    }

    public void onClick(View view)
    {
        bfd.a(view.getContext(), a);
    }
}
