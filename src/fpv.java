// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ImageView;

final class fpv extends fpy
{

    public final String a;
    public final int b;
    final fpu c;

    public fpv(fpu fpu1, ImageView imageview, String s, String s1, int i)
    {
        c = fpu1;
        super(fpu1);
        f = imageview;
        g = s;
        a = s1;
        b = i;
    }

    public void a()
    {
        fph.g.a(c.c, g, a).a(new fpw(this));
    }

    public void a(fpc fpc1)
    {
        c.a(fpc1.D_(), fpc1.c(), fpc1.d(), fpc1.e(), b, this);
    }
}
