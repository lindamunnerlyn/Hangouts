// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.ArrayAdapter;

final class qm extends ArrayAdapter
{

    public qm(Context context, int i, CharSequence acharsequence[])
    {
        super(context, i, 0x1020014, acharsequence);
    }

    public long getItemId(int i)
    {
        return (long)i;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
