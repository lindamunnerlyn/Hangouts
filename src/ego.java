// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ego
    implements android.view.View.OnClickListener
{

    final ani a;
    final ad b;
    final egn c;

    ego(egn egn1, ani ani, ad ad1)
    {
        c = egn1;
        a = ani;
        b = ad1;
        super();
    }

    public void onClick(View view)
    {
        view = g.b(a, egn.a(c));
        b.startActivity(view);
    }
}
