// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;

final class yk extends DataSetObserver
{

    final yc a;

    yk(yc yc1)
    {
        a = yc1;
        super();
    }

    public void onChanged()
    {
        if (a.n())
        {
            a.c();
        }
    }

    public void onInvalidated()
    {
        a.k();
    }
}
