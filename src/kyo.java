// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyo extends koj
{

    private static volatile kyo i[];
    public String a;
    public String b;
    public String c;
    public String d;
    public Integer e;
    public kzu f;
    public String g;
    public String h;

    public kyo()
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

    public static kyo[] a()
    {
        if (i == null)
        {
            synchronized (kon.a)
            {
                if (i == null)
                {
                    i = new kyo[0];
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
        if (d != null)
        {
            k = j + koh.b(2, d);
        }
        j = k;
        if (e != null)
        {
            j = k + koh.e(3, e.intValue());
        }
        k = j;
        if (f != null)
        {
            k = j + koh.d(4, f);
        }
        j = k;
        if (g != null)
        {
            j = k + koh.b(5, g);
        }
        k = j;
        if (h != null)
        {
            k = j + koh.b(6, h);
        }
        j = k;
        if (b != null)
        {
            j = k + koh.b(7, b);
        }
        k = j;
        if (c != null)
        {
            k = j + koh.b(8, c);
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
    //                   24: 121
    //                   34: 178
    //                   42: 207
    //                   50: 218
    //                   58: 229
    //                   66: 240;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, j)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L11
_L4:
        d = kog1.j();
          goto _L11
_L5:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            e = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (f == null)
        {
            f = new kzu();
        }
        kog1.a(f);
        continue; /* Loop/switch isn't completed */
_L7:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L8:
        h = kog1.j();
        continue; /* Loop/switch isn't completed */
_L9:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        c = kog1.j();
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (d != null)
        {
            koh1.a(2, d);
        }
        if (e != null)
        {
            koh1.a(3, e.intValue());
        }
        if (f != null)
        {
            koh1.b(4, f);
        }
        if (g != null)
        {
            koh1.a(5, g);
        }
        if (h != null)
        {
            koh1.a(6, h);
        }
        if (b != null)
        {
            koh1.a(7, b);
        }
        if (c != null)
        {
            koh1.a(8, c);
        }
        super.writeTo(koh1);
    }
}
