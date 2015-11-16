// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

final class awr
    implements axu
{

    final int a;
    final awp b;

    awr(awp awp1, int i)
    {
        b = awp1;
        a = i;
        super();
    }

    public void a()
    {
    }

    public void a(String s, axo axo1)
    {
        if (!TextUtils.isEmpty(s) && !aoe.a(s))
        {
            ave.c(b.a, a);
            ave.ac(b.a).b(bac.a(axo1.a));
            ave.ac(b.a).a(new bac(ave.aW(b.a), ave.h(b.a), axo1.a, a));
            if (ave.h(b.a) != null && dbq.r(ave.h(b.a).h()))
            {
                ave.ac(b.a).a(new azi(ave.aX(b.a), axo1.a, ave.h(b.a).h()));
            }
        }
    }
}
