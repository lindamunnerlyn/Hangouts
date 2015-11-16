// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;

final class fmw extends fnc
{

    public final int a;
    public final String b;
    public final fqu c;
    final fmv d;

    public fmw(fmv fmv1, ImageView imageview, fqu fqu1, int i)
    {
        d = fmv1;
        super(fmv1);
        f = imageview;
        c = fqu1;
        g = fqu1.a();
        b = fqu1.d();
        a = i;
    }

    public void a()
    {
        fmn.g.a(d.c, g, b, a).a(new fmx(this));
    }

    public void a(fmi fmi1)
    {
        fmv.a(d, fmi1.B_(), fmi1.c(), this);
    }
}
