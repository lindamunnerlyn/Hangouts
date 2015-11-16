// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

final class akp
    implements br
{

    final aki a;

    akp(aki aki1)
    {
        a = aki1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return new akz(aki.a(a), aki.b(a));
    }

    public void onLoadFinished(em em, Object obj)
    {
        em = (ajo)obj;
        aki.a(a, em);
    }

    public void onLoaderReset(em em)
    {
    }
}
