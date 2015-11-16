// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.text.TextUtils;

final class bux
    implements bue
{

    final buw a;

    bux(buw buw1)
    {
        a = buw1;
        super();
    }

    public void a()
    {
    }

    public void a(jhh jhh1)
    {
        a.c();
        a.a(jhh1);
    }

    public void b()
    {
        a.c();
        buw buw1 = a;
        buw1.e = new buk();
        buw1.e.a(new buy(buw1));
        buw1.e.a(buw1.a.u_(), null);
    }

    public void b(jhh jhh1)
    {
        buw buw1 = a;
        Resources resources = buw1.a.getResources();
        if (TextUtils.isEmpty(jhh1.d))
        {
            jhh1 = resources.getString(h.hP);
        } else
        {
            jhh1 = resources.getString(h.hO, new Object[] {
                jhh1.d
            });
        }
        buw1.b.a((new bvl()).a(1).a(jhh1).a().b());
    }

    public void c(jhh jhh1)
    {
        buw buw1 = a;
        Resources resources = buw1.a.getResources();
        if (TextUtils.isEmpty(jhh1.d))
        {
            jhh1 = resources.getString(h.hU);
        } else
        {
            jhh1 = resources.getString(h.hT, new Object[] {
                jhh1.d
            });
        }
        buw1.b.a((new bvl()).a(1).a(jhh1).a().b());
    }
}
