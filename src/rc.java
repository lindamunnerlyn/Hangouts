// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class rc
    implements jp
{

    final ra a;

    rc(ra ra1)
    {
        a = ra1;
        super();
    }

    public mh a(View view, mh mh1)
    {
        int i = mh1.b();
        int j = ra.b(a, i);
        mh mh2 = mh1;
        if (i != j)
        {
            mh2 = mh1.a(mh1.a(), j, mh1.c(), mh1.d());
        }
        return kb.a(view, mh2);
    }
}
