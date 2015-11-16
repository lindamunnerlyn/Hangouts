// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class fds extends fdj
{

    public int a;
    public String b;
    public String c;

    public fds()
    {
        a = 0;
        b = "";
        c = "";
        o = null;
        p = -1;
    }

    protected int a()
    {
        int j = super.a();
        int i = j;
        if (a != 0)
        {
            i = j + fdi.b(1, a);
        }
        j = i;
        if (!b.equals(""))
        {
            j = i + fdi.b(2, b);
        }
        i = j;
        if (!c.equals(""))
        {
            i = j + fdi.b(3, c);
        }
        return i;
    }

    public fdo a(fdh fdh1)
    {
_L6:
        int i = fdh1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 199
    //                   26: 210;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (a(fdh1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = fdh1.e();
        switch (j)
        {
        case 0: // '\0'
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
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            a = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = fdh1.g();
        continue; /* Loop/switch isn't completed */
_L5:
        c = fdh1.g();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void a(fdi fdi1)
    {
        if (a != 0)
        {
            fdi1.a(1, a);
        }
        if (!b.equals(""))
        {
            fdi1.a(2, b);
        }
        if (!c.equals(""))
        {
            fdi1.a(3, c);
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
        if (!(obj instanceof fds)) goto _L4; else goto _L3
_L3:
        obj = (fds)obj;
        flag = flag1;
        if (a != ((fds) (obj)).a) goto _L4; else goto _L5
_L5:
        if (b != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((fds) (obj)).b != null) goto _L4; else goto _L8
_L8:
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        flag = flag1;
        if (((fds) (obj)).c != null) goto _L4; else goto _L9
_L9:
        return a(((fdj) (obj)));
_L7:
        if (!b.equals(((fds) (obj)).b))
        {
            return false;
        }
          goto _L8
        if (!c.equals(((fds) (obj)).c))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = a;
        int i;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        if (c != null)
        {
            j = c.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + c();
    }
}
