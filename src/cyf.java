// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyf extends cvn
{

    private static final long serialVersionUID = 2L;
    private Boolean g;
    private Boolean h;

    private cyf(iyj iyj1)
    {
        int i;
        int j;
        super(iyj1.responseHeader, 0L);
        iyj1 = iyj1.a;
        j = iyj1.length;
        i = 0;
_L2:
        Object obj;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        obj = iyj1[i];
        if (((ixh) (obj)).b != null && ((ixh) (obj)).a != null)
        {
            switch (g.a(((ixh) (obj)).a, 0))
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
        g = Boolean.valueOf(g.a(((ixh) (obj)).b, false));
          goto _L3
        h = Boolean.valueOf(g.a(((ixh) (obj)).b, false));
          goto _L3
    }

    public static cvn parseFrom(byte abyte0[])
    {
        abyte0 = (iyj)kop.mergeFrom(new iyj(), abyte0);
        if (a(((iyj) (abyte0)).responseHeader))
        {
            return new cvz(((iyj) (abyte0)).responseHeader);
        } else
        {
            return new cyf(abyte0);
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
