// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

public final class fqr extends fqs
{

    public fqr(DataHolder dataholder)
    {
        super(dataholder);
    }

    public Object a(int i)
    {
        return b(i);
    }

    public fqq b(int i)
    {
        return new fpb(a, i, d());
    }

    public String toString()
    {
        return (new StringBuilder("Circles:size=")).append(a()).toString();
    }
}
