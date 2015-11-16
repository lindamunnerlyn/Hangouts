// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class akc
    implements br
{

    final ajz a;

    akc(ajz ajz1)
    {
        a = ajz1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new akw(a.a, a.b);
    }

    public void onLoadFinished(em em, Object obj)
    {
        em = (ajl)obj;
        ajz.a(a, em);
    }

    public void onLoaderReset(em em)
    {
    }
}
