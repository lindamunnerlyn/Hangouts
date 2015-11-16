// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lfu
    implements lge
{

    private final lge a[];
    private final int b;

    lfu(lge alge[])
    {
        a = alge;
        int i = 0;
        int j = alge.length;
        do
        {
            j--;
            if (j < 0)
            {
                break;
            }
            lge lge1 = alge[j];
            if (lge1 != null)
            {
                int k = lge1.b();
                if (k > i)
                {
                    i = k;
                }
            }
        } while (true);
        b = i;
    }

    public int a(lgf lgf1, String s, int i)
    {
        Object obj;
        lge alge[];
        Object obj1;
        int j;
        int k;
        int l;
        int j1;
        alge = a;
        j1 = alge.length;
        obj1 = lgf1.d();
        obj = null;
        l = 0;
        k = i;
        j = i;
_L3:
        lge lge1;
        if (l >= j1)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        lge1 = alge[l];
        if (lge1 != null) goto _L2; else goto _L1
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
                lgf1.a(obj);
            }
            return j;
        } else
        {
            return ~k;
        }
_L2:
        i1 = lge1.a(lgf1, s, i);
        if (i1 >= i)
        {
            if (i1 > j)
            {
                if (i1 >= s.length() || l + 1 >= j1 || alge[l + 1] == null)
                {
                    return i1;
                }
                obj = lgf1.d();
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
        lgf1.a(obj1);
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
