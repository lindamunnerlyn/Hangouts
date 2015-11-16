// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.DataSetObserver;

final class bhh extends DataSetObserver
{

    final bhg a;

    bhh(bhg bhg1)
    {
        a = bhg1;
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
