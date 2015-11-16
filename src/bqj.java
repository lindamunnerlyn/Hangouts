// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;

final class bqj
    implements android.view.View.OnClickListener
{

    final bqf a;

    bqj(bqf bqf1)
    {
        a = bqf1;
        super();
    }

    public void onClick(View view)
    {
        g.b(1580);
        bqf.g(a).d();
        if (bqf.i(a))
        {
            bqf.d(a).a(true);
        }
        bqf.g(a).a(8);
        bqf.j(a).b();
        bqf.a(a, bqf.k(a));
    }
}
