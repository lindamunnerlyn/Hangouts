// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fde extends fdj
{

    private static volatile fde c[];
    public String a;
    public fdf b;

    public fde()
    {
        a = "";
        b = null;
        o = null;
        p = -1;
    }

    public static fde[] b()
    {
        if (c == null)
        {
            synchronized (fdm.a)
            {
                if (c == null)
                {
                    c = new fde[0];
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
        int j = super.a() + fdi.b(1, a);
        int i = j;
        if (b != null)
        {
            i = j + fdi.b(2, b);
        }
        return i;
    }

    public fdo a(fdh fdh1)
    {
        do
        {
            int i = fdh1.a();
            switch (i)
            {
            default:
                if (a(fdh1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                a = fdh1.g();
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new fdf();
                }
                fdh1.a(b);
                break;
            }
        } while (true);
    }

    public void a(fdi fdi1)
    {
        fdi1.a(1, a);
        if (b != null)
        {
            fdi1.a(2, b);
        }
        super.a(fdi1);
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
        if (!(obj instanceof fde)) goto _L4; else goto _L3
_L3:
        obj = (fde)obj;
        if (a != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((fde) (obj)).a != null) goto _L4; else goto _L7
_L7:
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((fde) (obj)).b != null) goto _L4; else goto _L8
_L8:
        return a(((fdj) (obj)));
_L6:
        if (!a.equals(((fde) (obj)).a))
        {
            return false;
        }
          goto _L7
        if (!b.equals(((fde) (obj)).b))
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
