// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class akm
    implements br
{

    final akf a;

    akm(akf akf1)
    {
        a = akf1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new akw(a.b, a.d);
    }

    public void onLoadFinished(em em, Object obj)
    {
        em = (ajl)obj;
        akf.a(a, em);
    }

    public void onLoaderReset(em em)
    {
    }
}
