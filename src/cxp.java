// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class cxp
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public int e;
    public final long f;

    public cxp()
    {
        e = cxq.a;
        a = "";
        b = 1;
        c = "";
        d = 0L;
        f = -1L;
    }

    public cxp(hsv hsv)
    {
        e = cxq.a;
        d = 0L;
        a = "";
        b = 1;
        c = "";
        f = -1L;
    }

    public cxp(ixg ixg1)
    {
        e = cxq.a;
        a = ixg1.b;
        b = g.a(ixg1.a, 0);
        c = ixg1.c;
        d = g.a(ixg1.d, 0L);
        if (ixg1.i != null && ixg1.i.a != null && ixg1.i.b != null)
        {
            f = g.a(ixg1.i.b, 0L);
            switch (g.a(ixg1.i.a, 0))
            {
            default:
                ixg1 = String.valueOf(ixg1.i.a);
                ebw.g("Babel", (new StringBuilder(String.valueOf(ixg1).length() + 66)).append("Unexpected error code for syncHintAnswer in clientResponseHeader: ").append(ixg1).toString());
                return;

            case 0: // '\0'
                e = cxq.a;
                return;

            case 1: // '\001'
                e = cxq.b;
                return;

            case 2: // '\002'
                e = cxq.c;
                return;

            case 3: // '\003'
                e = cxq.d;
                break;
            }
            return;
        } else
        {
            f = -1L;
            return;
        }
    }
}
