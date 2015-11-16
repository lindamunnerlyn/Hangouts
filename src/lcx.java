// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class lcx extends ldu
    implements Serializable, ldq
{

    private static final long serialVersionUID = 0xb83c78646a5bddf9L;

    public lcx()
    {
    }

    public lcx(long l)
    {
        super(l);
    }

    private lcx(long l, lcw lcw1)
    {
        super(l, lcw1);
    }

    public lcx a(int i)
    {
        long l;
        if (i != 0)
        {
            if ((l = c().s().a(b(), i)) != b())
            {
                return new lcx(l, c());
            }
        }
        return this;
    }
}
