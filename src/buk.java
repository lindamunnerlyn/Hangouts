// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.text.TextUtils;

final class buk
    implements btr
{

    final buj a;

    buk(buj buj1)
    {
        a = buj1;
        super();
    }

    public void a()
    {
    }

    public void a(jba jba1)
    {
        a.c();
        a.a(jba1);
    }

    public void b()
    {
        a.c();
        buj buj1 = a;
        buj1.e = new btx();
        buj1.e.a(new bul(buj1));
        buj1.e.a(buj1.a.t_(), null);
    }

    public void b(jba jba1)
    {
        buj buj1 = a;
        Resources resources = buj1.a.getResources();
        if (TextUtils.isEmpty(jba1.d))
        {
            jba1 = resources.getString(h.ik);
        } else
        {
            jba1 = resources.getString(h.ij, new Object[] {
                jba1.d
            });
        }
        buj1.b.a((new buy()).a(1).a(jba1).a().b());
    }

    public void c(jba jba1)
    {
        buj buj1 = a;
        Resources resources = buj1.a.getResources();
        if (TextUtils.isEmpty(jba1.d))
        {
            jba1 = resources.getString(h.ip);
        } else
        {
            jba1 = resources.getString(h.io, new Object[] {
                jba1.d
            });
        }
        buj1.b.a((new buy()).a(1).a(jba1).a().b());
    }
}
