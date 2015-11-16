// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class avz
    implements axu
{

    final ave a;

    avz(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a()
    {
    }

    public void a(String s, axo axo1)
    {
        if (!TextUtils.equals(ave.aa(a), s) && !aoe.a(s))
        {
            int i = g.a(ave.ab(a), "babel_focustimeoutsecs", 300);
            ave.ac(a).b(bab.a(axo1.a));
            ave.ac(a).a(new bab(ave.ad(a), ave.h(a), axo1.a, true, i));
            if (ave.h(a) != null && dbq.r(ave.h(a).h()))
            {
                ave.ac(a).a(new azi(ave.ae(a), axo1.a, ave.h(a).h()));
            }
            if (axo1.b == 1)
            {
                ave.b(a, s);
                return;
            }
        }
    }
}
