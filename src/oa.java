// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;

final class oa extends DataSetObserver
{

    final ny a;

    oa(ny ny1)
    {
        a = ny1;
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
