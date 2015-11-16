// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class akr
    implements br
{

    private final akn a;

    akr(akn akn1)
    {
        a = akn1;
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new akv(a.getActivity());
    }

    public void onLoadFinished(em em, Object obj)
    {
        em = (ajl)obj;
        a.b();
        if (em != null)
        {
            a.a(h.gT);
        }
    }

    public void onLoaderReset(em em)
    {
    }
}
