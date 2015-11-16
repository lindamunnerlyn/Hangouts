// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iur extends koj
{

    private static volatile iur g[];
    public ius a;
    public String b;
    public Integer c;
    public String d;
    public String e;
    public byte f[];

    public iur()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iur[] a()
    {
        if (g == null)
        {
            synchronized (kon.a)
            {
                if (g == null)
                {
                    g = new iur[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(2, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.b(3, e);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.b(4, f);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(5, b);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.e(6, c.intValue());
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L9:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   10: 83
    //                   18: 112
    //                   26: 123
    //                   34: 134
    //                   42: 145
    //                   48: 156;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new ius();
        }
        kog1.a(a);
          goto _L9
_L4:
        d = kog1.j();
          goto _L9
_L5:
        e = kog1.j();
          goto _L9
_L6:
        f = kog1.k();
          goto _L9
_L7:
        b = kog1.j();
          goto _L9
_L8:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            c = Integer.valueOf(j);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (d != null)
        {
            koh1.a(2, d);
        }
        if (e != null)
        {
            koh1.a(3, e);
        }
        if (f != null)
        {
            koh1.a(4, f);
        }
        if (b != null)
        {
            koh1.a(5, b);
        }
        if (c != null)
        {
            koh1.a(6, c.intValue());
        }
        super.writeTo(koh1);
    }
}
