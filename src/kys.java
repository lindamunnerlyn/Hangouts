// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kys extends koj
{

    public Integer a;
    public String b;
    public kye c;
    public lcd d;

    public kys()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(4, b);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(5, d);
        }
        j = i;
        if (c != null)
        {
            j = i + koh.d(6, c);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L7:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   34: 114
    //                   42: 125
    //                   50: 154;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = kog1.j();
        continue; /* Loop/switch isn't completed */
_L5:
        if (d == null)
        {
            d = new lcd();
        }
        kog1.a(d);
        continue; /* Loop/switch isn't completed */
_L6:
        if (c == null)
        {
            c = new kye();
        }
        kog1.a(c);
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (b != null)
        {
            koh1.a(4, b);
        }
        if (d != null)
        {
            koh1.b(5, d);
        }
        if (c != null)
        {
            koh1.b(6, c);
        }
        super.writeTo(koh1);
    }
}
