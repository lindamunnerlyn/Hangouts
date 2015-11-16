// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class aku
    implements br
{

    private final akq a;

    aku(akq akq1)
    {
        a = akq1;
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new aky(a.getActivity());
    }

    public void onLoadFinished(em em, Object obj)
    {
        em = (ajo)obj;
        a.b();
        if (em != null)
        {
            a.a(h.hn);
        }
    }

    public void onLoaderReset(em em)
    {
    }
}
