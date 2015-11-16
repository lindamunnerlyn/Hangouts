// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class ehj
    implements android.view.View.OnClickListener
{

    final ad a;
    final String b;
    final ehi c;

    ehj(ehi ehi, ad ad1, String s)
    {
        c = ehi;
        a = ad1;
        b = s;
        super();
    }

    public void onClick(View view)
    {
        a.startActivity(g.s(b));
    }
}
