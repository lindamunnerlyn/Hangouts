// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;

final class fmz extends fnc
{

    public final String a;
    public final int b;
    final fmy c;

    public fmz(fmy fmy1, ImageView imageview, String s, String s1, int i)
    {
        c = fmy1;
        super(fmy1);
        f = imageview;
        g = s;
        a = s1;
        b = i;
    }

    public void a()
    {
        fmn.g.a(c.c, g, a).a(new fna(this));
    }

    public void a(fmi fmi1)
    {
        c.a(fmi1.B_(), fmi1.c(), fmi1.d(), fmi1.e(), b, this);
    }
}
