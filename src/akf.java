// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class akf
    implements br
{

    final akc a;

    akf(akc akc1)
    {
        a = akc1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new akz(a.a, a.b);
    }

    public void onLoadFinished(em em, Object obj)
    {
        em = (ajo)obj;
        akc.a(a, em);
    }

    public void onLoaderReset(em em)
    {
    }
}
