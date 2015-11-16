// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;

final class bbj
    implements gov
{

    final bbh a;

    bbj(bbh bbh1)
    {
        a = bbh1;
        super();
    }

    public void a(int i, Intent intent)
    {
        if (i == -1 && intent != null)
        {
            ((arl)bbh.e(a).a(arl)).a(new bbk(this, intent));
            return;
        } else
        {
            bbh.h(a);
            return;
        }
    }
}
