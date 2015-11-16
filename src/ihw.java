// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ihw extends koj
{

    public String a;
    public String b;
    public String c;
    public String d;
    public Integer e;
    public Integer f;

    public ihw()
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

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.e(5, e.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i + koh.e(6, f.intValue());
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
    //                   18: 94
    //                   26: 105
    //                   34: 116
    //                   40: 127
    //                   48: 178;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L9
_L4:
        b = kog1.j();
          goto _L9
_L5:
        c = kog1.j();
          goto _L9
_L6:
        d = kog1.j();
          goto _L9
_L7:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            e = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int k = kog1.f();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            f = Integer.valueOf(k);
            break;
        }
        if (true) goto _L9; else goto _L10
_L10:
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
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.a(5, e.intValue());
        }
        if (f != null)
        {
            koh1.a(6, f.intValue());
        }
        super.writeTo(koh1);
    }
}
