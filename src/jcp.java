// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcp extends koj
{

    private static volatile jcp i[];
    public String a;
    public String b;
    public String c;
    public Integer d;
    public jcr e;
    public jcq f;
    public jct g;
    public jcs h;

    public jcp()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jcp[] a()
    {
        if (i == null)
        {
            synchronized (kon.a)
            {
                if (i == null)
                {
                    i = new jcp[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + koh.b(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + koh.b(2, b);
        }
        j = k;
        if (c != null)
        {
            j = k + koh.b(3, c);
        }
        k = j;
        if (d != null)
        {
            k = j + koh.e(4, d.intValue());
        }
        j = k;
        if (e != null)
        {
            j = k + koh.d(5, e);
        }
        k = j;
        if (f != null)
        {
            k = j + koh.d(6, f);
        }
        j = k;
        if (g != null)
        {
            j = k + koh.d(7, g);
        }
        k = j;
        if (h != null)
        {
            k = j + koh.d(8, h);
        }
        return k;
    }

    public kop mergeFrom(kog kog1)
    {
_L11:
        int j = kog1.a();
        j;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 110
    //                   26: 121
    //                   32: 132
    //                   42: 182
    //                   50: 211
    //                   58: 240
    //                   66: 269;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, j)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L11
_L4:
        b = kog1.j();
          goto _L11
_L5:
        c = kog1.j();
          goto _L11
_L6:
        int k = kog1.f();
        switch (k)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            d = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (e == null)
        {
            e = new jcr();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L8:
        if (f == null)
        {
            f = new jcq();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L9:
        if (g == null)
        {
            g = new jct();
        }
        kog1.a(g);
        continue; /* Loop/switch isn't completed */
_L10:
        if (h == null)
        {
            h = new jcs();
        }
        kog1.a(h);
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d.intValue());
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.b(8, h);
        }
        super.writeTo(koh1);
    }
}
