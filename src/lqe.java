// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lqe
    implements lqo
{

    private final lqo a[];
    private final int b;

    lqe(lqo alqo[])
    {
        a = alqo;
        int i = 0;
        int j = alqo.length;
        do
        {
            j--;
            if (j < 0)
            {
                break;
            }
            lqo lqo1 = alqo[j];
            if (lqo1 != null)
            {
                int k = lqo1.b();
                if (k > i)
                {
                    i = k;
                }
            }
        } while (true);
        b = i;
    }

    public int a(lqp lqp1, String s, int i)
    {
        Object obj;
        lqo alqo[];
        Object obj1;
        int j;
        int k;
        int l;
        int j1;
        alqo = a;
        j1 = alqo.length;
        obj1 = lqp1.d();
        obj = null;
        l = 0;
        k = i;
        j = i;
_L3:
        lqo lqo1;
        if (l >= j1)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        lqo1 = alqo[l];
        if (lqo1 != null) goto _L2; else goto _L1
_L1:
        if (j <= i)
        {
            return i;
        }
        l = 1;
_L4:
        int i1;
        if (j > i || j == i && l != 0)
        {
            if (obj != null)
            {
                lqp1.a(obj);
            }
            return j;
        } else
        {
            return ~k;
        }
_L2:
        i1 = lqo1.a(lqp1, s, i);
        if (i1 >= i)
        {
            if (i1 > j)
            {
                if (i1 >= s.length() || l + 1 >= j1 || alqo[l + 1] == null)
                {
                    return i1;
                }
                obj = lqp1.d();
                j = i1;
            }
        } else
        if (i1 < 0)
        {
            i1 = ~i1;
            if (i1 > k)
            {
                k = i1;
            }
        }
        lqp1.a(obj1);
        l++;
          goto _L3
        l = 0;
          goto _L4
    }

    public int b()
    {
        return b;
    }
}
