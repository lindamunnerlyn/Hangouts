// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.common.data.DataHolder;

public final class fyy extends epl
    implements fvd
{

    private final int c;

    public fyy(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        c = j;
    }

    public fvf a()
    {
        return new fwn(a, b, c);
    }

    public int b()
    {
        return a("event_type");
    }

    public Object f()
    {
        return new fyx(this);
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
