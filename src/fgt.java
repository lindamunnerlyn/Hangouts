// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgt extends fgh
{

    private static volatile fgt c[];
    public String a;
    public String b;

    public fgt()
    {
        a = "";
        b = "";
        o = null;
        p = -1;
    }

    public static fgt[] b()
    {
        if (c == null)
        {
            synchronized (fgk.a)
            {
                if (c == null)
                {
                    c = new fgt[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int a()
    {
        int j = super.a();
        int i = j;
        if (!a.equals(""))
        {
            i = j + fgg.b(1, a);
        }
        j = i;
        if (!b.equals(""))
        {
            j = i + fgg.b(2, b);
        }
        return j;
    }

    public fgm a(fgf fgf1)
    {
        do
        {
            int i = fgf1.a();
            switch (i)
            {
            default:
                if (a(fgf1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = fgf1.g();
                break;

            case 18: // '\022'
                b = fgf1.g();
                break;
            }
        } while (true);
    }

    public void a(fgg fgg1)
    {
        if (!a.equals(""))
        {
            fgg1.a(1, a);
        }
        if (!b.equals(""))
        {
            fgg1.a(2, b);
        }
        super.a(fgg1);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof fgt)) goto _L4; else goto _L3
_L3:
        obj = (fgt)obj;
        if (a != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((fgt) (obj)).a != null) goto _L4; else goto _L7
_L7:
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((fgt) (obj)).b != null) goto _L4; else goto _L8
_L8:
        return a(((fgh) (obj)));
_L6:
        if (!a.equals(((fgt) (obj)).a))
        {
            return false;
        }
          goto _L7
        if (!b.equals(((fgt) (obj)).b))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + c();
    }
}
