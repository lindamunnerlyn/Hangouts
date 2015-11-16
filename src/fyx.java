// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fyx
    implements fvd
{

    private int a;
    private fvf b;

    public fyx(fvd fvd1)
    {
        a = fvd1.b();
        b = (fvf)fvd1.a().f();
    }

    public boolean C_()
    {
        return true;
    }

    public fvf a()
    {
        return b;
    }

    public int b()
    {
        return a;
    }

    public Object f()
    {
        return this;
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
        return (new StringBuilder("DataEventEntity{ type=")).append(s).append(", dataitem=").append(a()).append(" }").toString();
    }
}
