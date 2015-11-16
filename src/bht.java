// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;

final class bht extends DataSetObserver
{

    final bhs a;

    bht(bhs bhs1)
    {
        a = bhs1;
        super();
    }

    public void onChanged()
    {
        a.notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        a.notifyDataSetInvalidated();
    }
}
