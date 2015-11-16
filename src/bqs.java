// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.hangout.HangoutSelfMenu;

final class bqs
    implements android.view.View.OnClickListener
{

    final bqo a;

    bqs(bqo bqo1)
    {
        a = bqo1;
        super();
    }

    public void onClick(View view)
    {
        g.b(1580);
        bqo.g(a).d();
        if (bqo.i(a))
        {
            bqo.d(a).a(true);
        }
        bqo.g(a).a(8);
        bqo.j(a).b();
        bqo.a(a, bqo.k(a));
    }
}
