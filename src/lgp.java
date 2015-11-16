// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.DataInput;
import java.io.IOException;
import java.util.Arrays;

public final class lgp extends ldd
{

    private static final long serialVersionUID = 0x6c69b735442cb4f9L;
    private final long c[];
    private final int d[];
    private final int e[];
    private final String f[];
    private final lgn g;

    private lgp(String s, long al[], int ai[], int ai1[], String as[], lgn lgn1)
    {
        super(s);
        c = al;
        d = ai;
        e = ai1;
        f = as;
        g = lgn1;
    }

    public static lgp a(DataInput datainput, String s)
    {
        Object obj;
        long al[];
        int ai[];
        int ai1[];
        String as[];
        int j;
        int l;
        int i1;
        l = datainput.readUnsignedShort();
        obj = new String[l];
        for (int i = 0; i < l; i++)
        {
            obj[i] = datainput.readUTF();
        }

        i1 = datainput.readInt();
        al = new long[i1];
        ai = new int[i1];
        ai1 = new int[i1];
        as = new String[i1];
        j = 0;
_L2:
        int k;
        if (j >= i1)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        al[j] = g.a(datainput);
        ai[j] = (int)g.a(datainput);
        ai1[j] = (int)g.a(datainput);
        if (l < 256)
        {
            try
            {
                k = datainput.readUnsignedByte();
            }
            // Misplaced declaration of an exception variable
            catch (DataInput datainput)
            {
                throw new IOException("Invalid encoding");
            }
            break MISSING_BLOCK_LABEL_204;
        }
        k = datainput.readUnsignedShort();
        break MISSING_BLOCK_LABEL_204;
        obj = null;
        if (datainput.readBoolean())
        {
            obj = new lgn(s, (int)g.a(datainput), lgq.a(datainput), lgq.a(datainput));
        }
        return new lgp(s, al, ai, ai1, as, ((lgn) (obj)));
        as[j] = obj[k];
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String a(long l)
    {
        long al[] = c;
        int i = Arrays.binarySearch(al, l);
        if (i >= 0)
        {
            return f[i];
        }
        i = ~i;
        if (i < al.length)
        {
            if (i > 0)
            {
                return f[i - 1];
            } else
            {
                return "UTC";
            }
        }
        if (g == null)
        {
            return f[i - 1];
        } else
        {
            return g.a(l);
        }
    }

    public int b(long l)
    {
        long al[] = c;
        int i = Arrays.binarySearch(al, l);
        if (i >= 0)
        {
            return d[i];
        }
        i = ~i;
        if (i < al.length)
        {
            if (i > 0)
            {
                return d[i - 1];
            } else
            {
                return 0;
            }
        }
        if (g == null)
        {
            return d[i - 1];
        } else
        {
            return g.b(l);
        }
    }

    public boolean c()
    {
        return false;
    }

    public long e(long l)
    {
        long al[] = c;
        int i = Arrays.binarySearch(al, l);
        long l1;
        if (i >= 0)
        {
            i++;
        } else
        {
            i = ~i;
        }
        if (i < al.length)
        {
            l1 = al[i];
        } else
        {
            l1 = l;
            if (g != null)
            {
                long l3 = al[al.length - 1];
                long l2 = l;
                if (l < l3)
                {
                    l2 = l3;
                }
                return g.e(l2);
            }
        }
        return l1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof lgp))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = (lgp)obj;
        if (!super.b.equals(((ldd) (obj)).b) || !Arrays.equals(c, ((lgp) (obj)).c) || !Arrays.equals(f, ((lgp) (obj)).f) || !Arrays.equals(d, ((lgp) (obj)).d) || !Arrays.equals(e, ((lgp) (obj)).e))
        {
            break; /* Loop/switch isn't completed */
        }
        if (g != null) goto _L4; else goto _L3
_L3:
        if (((lgp) (obj)).g == null) goto _L1; else goto _L5
_L5:
        return false;
_L4:
        if (!g.equals(((lgp) (obj)).g)) goto _L5; else goto _L6
_L6:
        return true;
        return false;
    }

    public long f(long l)
    {
        long al[];
        int i;
        al = c;
        i = Arrays.binarySearch(al, l);
        if (i < 0) goto _L2; else goto _L1
_L1:
        long l1;
        l1 = l;
        if (l > 0x8000000000000000L)
        {
            l1 = l - 1L;
        }
_L4:
        return l1;
_L2:
        i = ~i;
        if (i >= al.length)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = l;
        if (i > 0)
        {
            long l2 = al[i - 1];
            l1 = l;
            if (l2 > 0x8000000000000000L)
            {
                return l2 - 1L;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (g != null)
        {
            l1 = g.f(l);
            if (l1 < l)
            {
                return l1;
            }
        }
        long l3 = al[i - 1];
        l1 = l;
        if (l3 > 0x8000000000000000L)
        {
            return l3 - 1L;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }
}
