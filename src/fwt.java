// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fwt
    implements fsx
{

    private int a;
    private fsz b;

    public fwt(fsx fsx1)
    {
        a = fsx1.b();
        b = (fsz)fsx1.a().e();
    }

    public fsz a()
    {
        return b;
    }

    public int b()
    {
        return a;
    }

    public Object e()
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
