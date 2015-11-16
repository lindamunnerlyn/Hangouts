// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class alf
    implements br
{

    final ale a;

    alf(ale ale1)
    {
        a = ale1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new aky(ale.a(a));
    }

    public void onLoadFinished(em em, Object obj)
    {
        em = (ajo)obj;
        ale.a(a, ale.b(a), jhb.c(em));
    }

    public void onLoaderReset(em em)
    {
    }
}
