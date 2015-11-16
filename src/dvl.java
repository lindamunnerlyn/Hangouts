// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class dvl
    implements android.view.View.OnClickListener
{

    boolean a;
    final dvg b;
    final dvn c;
    final dvi d;

    dvl(dvi dvi1, dvg dvg, dvn dvn1)
    {
        d = dvi1;
        b = dvg;
        c = dvn1;
        super();
        a = false;
    }

    public void onClick(View view)
    {
        if (!a)
        {
            d.b(b);
            c.onClick(view);
            a = true;
        }
    }
}
