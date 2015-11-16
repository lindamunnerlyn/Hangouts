// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fgd extends fgh
{

    private static volatile fgd c[];
    public int a;
    public fge b;

    public fgd()
    {
        a = 1;
        b = null;
        o = null;
        p = -1;
    }

    public static fgd[] b()
    {
        if (c == null)
        {
            synchronized (fgk.a)
            {
                if (c == null)
                {
                    c = new fgd[0];
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
        int j = super.a() + fgg.b(1, a);
        int i = j;
        if (b != null)
        {
            i = j + fgg.b(2, b);
        }
        return i;
    }

    public fgm a(fgf fgf1)
    {
_L5:
        int i = fgf1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   8: 51
    //                   18: 143;
           goto _L1 _L2 _L3 _L4
_L1:
        if (a(fgf1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        int j = fgf1.e();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b == null)
        {
            b = new fge();
        }
        fgf1.a(b);
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void a(fgg fgg1)
    {
        fgg1.a(1, a);
        if (b != null)
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
        if (!(obj instanceof fgd)) goto _L4; else goto _L3
_L3:
        obj = (fgd)obj;
        flag = flag1;
        if (a != ((fgd) (obj)).a) goto _L4; else goto _L5
_L5:
        if (b != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((fgd) (obj)).b != null) goto _L4; else goto _L8
_L8:
        return a(((fgh) (obj)));
_L7:
        if (!b.equals(((fgd) (obj)).b))
        {
            return false;
        }
        if (true) goto _L8; else goto _L9
_L9:
    }

    public int hashCode()
    {
        int j = a;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        return (i + (j + 527) * 31) * 31 + c();
    }
}
