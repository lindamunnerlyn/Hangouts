// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cyi extends cxr
{

    private static final long serialVersionUID = 1L;
    private final int g;
    private final int h;
    private final String i;
    private final boolean j;
    private final int k;

    private cyi(lfb lfb1)
    {
        int i1;
        int j1;
        j1 = 1;
        super();
        k = g.a(lfb1.d, 0);
        Object obj;
        if (g.a(lfb1.b, 0) == 1 && lfb1.c != null && lfb1.c.c != null)
        {
            obj = lfb1.c.c;
        } else
        {
            obj = lfb1.a;
        }
        if (obj != null)
        {
            i = ((leq) (obj)).c;
            lev lev1;
            int k1;
            if (g.a(((leq) (obj)).a, 0L) == 0L)
            {
                j = true;
            } else
            {
                j = false;
            }
        } else
        {
            i = null;
            j = false;
        }
        if (j || lfb1.e == null)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        obj = lfb1.e;
        k1 = obj.length;
        i1 = 0;
_L3:
        if (i1 >= k1)
        {
            break MISSING_BLOCK_LABEL_257;
        }
        lev1 = obj[i1];
        if (g.a(lev1.a, 0) != 1) goto _L2; else goto _L1
_L1:
        if (g.a(lev1.b, false))
        {
            i1 = j1;
        } else
        {
            i1 = 2;
        }
        if (lfb1.c != null && lfb1.c.b != null)
        {
            k1 = g.a(lfb1.c.b, 0);
            j1 = i1;
            i1 = k1;
        } else
        {
            j1 = i1;
            i1 = 60000;
        }
_L4:
        g = j1;
        h = i1;
        return;
_L2:
        i1++;
          goto _L3
        i1 = 60000;
        j1 = 0;
          goto _L4
    }

    public static cxr parseFrom(byte abyte0[])
    {
        if (abyte0 != null)
        {
            abyte0 = (lfb)kws.mergeFrom(new lfb(), abyte0);
            if (abyte0 != null)
            {
                return new cyi(abyte0);
            }
        }
        return null;
    }

    public int k()
    {
        return g;
    }

    public int l()
    {
        return h;
    }

    public String m()
    {
        return i;
    }

    public boolean n()
    {
        return j;
    }

    public int o()
    {
        return k;
    }

    public boolean p()
    {
        return k == 0;
    }
}
