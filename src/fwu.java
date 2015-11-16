// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

public final class fwu extends eml
    implements fsx
{

    private final int c;

    public fwu(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        c = j;
    }

    public fsz a()
    {
        return new fuh(a, b, c);
    }

    public int b()
    {
        return a("event_type");
    }

    public Object e()
    {
        return new fwt(this);
    }

    public String toString()
    {
        String s;
        if (b() == 1)
        {
            s = "changed";
        } else
        if (b() == 2)
        {
            s = "deleted";
        } else
        {
            s = "unknown";
        }
        return (new StringBuilder("DataEventRef{ type=")).append(s).append(", dataitem=").append(a()).append(" }").toString();
    }
}
