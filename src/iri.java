// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iri extends koj
{

    private static volatile iri h[];
    public ivz a;
    public String b;
    public Integer c;
    public Integer d;
    public jtj e;
    public Integer f;
    public Boolean g;

    public iri()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static iri[] a()
    {
        if (h == null)
        {
            synchronized (kon.a)
            {
                if (h == null)
                {
                    h = new iri[0];
                }
            }
        }
        return h;
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
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.e(3, c.intValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(4, e);
        }
        i = j;
        if (f != null)
        {
            i = j + koh.e(5, f.intValue());
        }
        j = i;
        if (d != null)
        {
            j = i + koh.e(6, d.intValue());
        }
        i = j;
        if (g != null)
        {
            g.booleanValue();
            i = j + (koh.f(7) + 1);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L10:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 8: default 80
    //                   0: 89
    //                   10: 91
    //                   18: 120
    //                   24: 131
    //                   34: 182
    //                   40: 211
    //                   48: 274
    //                   56: 326;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L10; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new ivz();
        }
        kog1.a(a);
          goto _L10
_L4:
        b = kog1.j();
          goto _L10
_L5:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            c = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (e == null)
        {
            e = new jtj();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L7:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            f = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int l = kog1.f();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            d = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        g = Boolean.valueOf(kog1.i());
        if (true) goto _L10; else goto _L11
_L11:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c.intValue());
        }
        if (e != null)
        {
            koh1.b(4, e);
        }
        if (f != null)
        {
            koh1.a(5, f.intValue());
        }
        if (d != null)
        {
            koh1.a(6, d.intValue());
        }
        if (g != null)
        {
            koh1.a(7, g.booleanValue());
        }
        super.writeTo(koh1);
    }
}
