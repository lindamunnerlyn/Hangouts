// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;

public final class gfp extends gfc
{

    private gfo i;
    private gju j;
    private int k;
    private int l;
    private int m;
    private boolean n;
    private boolean o;
    private int p;
    private int q;
    private boolean r;

    public gfp()
    {
        super("Invalid");
    }

    public void a(gju gju1, gfo gfo1)
    {
        j = gju1;
        i = gfo1;
    }

    public boolean e()
    {
        if (i.g() == 0 || i.j() == 0 || i.k() == 0)
        {
            return false;
        }
        if (k != i.g() || l != i.j() || m != i.k() || n != i.h() || o != i.i())
        {
            a(i.g(), i.j(), i.k(), i.h(), i.i());
            Rect rect = i.l();
            if (rect != null)
            {
                a((float)rect.left / (float)i.j(), (float)rect.top / (float)i.k(), (float)(i.j() - 1 - rect.right) / (float)i.j(), (float)(i.k() - 1 - rect.bottom) / (float)i.k());
            } else
            {
                a(0.0F, 0.0F, 0.0F, 0.0F);
            }
            k = i.g();
            l = i.j();
            m = i.k();
            n = i.h();
            o = i.i();
        }
        if (p != j.b() || q != j.c() || r != j.d())
        {
            a(j.b(), j.c(), j.d());
            p = j.b();
            q = j.c();
            r = j.d();
        }
        return super.e();
    }
}
