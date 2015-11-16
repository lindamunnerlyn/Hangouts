// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;

final class oc extends DataSetObserver
{

    final oa a;

    oc(oa oa1)
    {
        a = oa1;
        super();
    }

    public void onChanged()
    {
        a.a = true;
        a.notifyDataSetChanged();
    }

    public void onInvalidated()
    {
        a.a = false;
        a.notifyDataSetInvalidated();
    }
}
