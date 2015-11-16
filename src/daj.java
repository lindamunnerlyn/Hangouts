// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class daj extends cxr
{

    private static final long serialVersionUID = 2L;
    private Boolean g;
    private Boolean h;

    private daj(jeo jeo1)
    {
        int i;
        int j;
        super(jeo1.responseHeader, 0L);
        jeo1 = jeo1.a;
        j = jeo1.length;
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = jeo1[i];
        if (((jdm) (obj)).b != null && ((jdm) (obj)).a != null)
        {
            switch (g.a(((jdm) (obj)).a, 0))
            {
            default:
                break;

            case 2: // '\002'
                break; /* Loop/switch isn't completed */

            case 6: // '\006'
                break;
            }
            break MISSING_BLOCK_LABEL_105;
        }
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        g = Boolean.valueOf(g.a(((jdm) (obj)).b, false));
          goto _L3
        h = Boolean.valueOf(g.a(((jdm) (obj)).b, false));
          goto _L3
    }

    public static cxr parseFrom(byte abyte0[])
    {
        abyte0 = (jeo)kws.mergeFrom(new jeo(), abyte0);
        if (a(((jeo) (abyte0)).responseHeader))
        {
            return new cyd(((jeo) (abyte0)).responseHeader);
        } else
        {
            return new daj(abyte0);
        }
    }

    public Boolean k()
    {
        return g;
    }

    public Boolean l()
    {
        return h;
    }
}
