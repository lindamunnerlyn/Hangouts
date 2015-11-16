// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Bundle;

final class bez
    implements br
{

    final ben a;

    bez(ben ben1)
    {
        a = ben1;
        super();
    }

    public em onCreateLoader(int i, Bundle bundle)
    {
        return bmi.newBuilder(ben.r(a), ben.g(a), ben.n()).a().b().c();
    }

    public void onLoadFinished(em em, Object obj)
    {
        em = (Cursor)obj;
        a.h();
        a.a(em);
    }

    public void onLoaderReset(em em)
    {
    }
}
