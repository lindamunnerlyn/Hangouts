// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class czt
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final int b;
    public final String c;
    public final long d;
    public int e;
    public final long f;

    public czt()
    {
        e = czu.a;
        a = "";
        b = 1;
        c = "";
        d = 0L;
        f = -1L;
    }

    public czt(hxz hxz)
    {
        e = czu.a;
        d = 0L;
        a = "";
        b = 1;
        c = "";
        f = -1L;
    }

    public czt(jdl jdl1)
    {
        e = czu.a;
        a = jdl1.b;
        b = g.a(jdl1.a, 0);
        c = jdl1.c;
        d = g.a(jdl1.d, 0L);
        if (jdl1.i != null && jdl1.i.a != null && jdl1.i.b != null)
        {
            f = g.a(jdl1.i.b, 0L);
            switch (g.a(jdl1.i.a, 0))
            {
            default:
                jdl1 = String.valueOf(jdl1.i.a);
                eev.g("Babel", (new StringBuilder(String.valueOf(jdl1).length() + 66)).append("Unexpected error code for syncHintAnswer in clientResponseHeader: ").append(jdl1).toString());
                return;

            case 0: // '\0'
                e = czu.a;
                return;

            case 1: // '\001'
                e = czu.b;
                return;

            case 2: // '\002'
                e = czu.c;
                return;

            case 3: // '\003'
                e = czu.d;
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
