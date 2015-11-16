// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iyt extends koj
{

    public Integer a;
    public ivu b;
    public Long c;
    public Long d;
    public iqh e;
    public byte f[];
    public String g;
    public String h;

    public iyt()
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

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.intValue());
        }
        j = i;
        if (f != null)
        {
            j = i + koh.b(2, f);
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(4, b);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(5, d.longValue());
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(6, e);
        }
        i = j;
        if (g != null)
        {
            i = j + koh.b(7, g);
        }
        j = i;
        if (h != null)
        {
            j = i + koh.b(8, h);
        }
        return j;
    }

    public kop mergeFrom(kog kog1)
    {
_L11:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   8: 99
    //                   18: 146
    //                   24: 157
    //                   34: 171
    //                   40: 200
    //                   50: 214
    //                   58: 243
    //                   66: 254;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        f = kog1.k();
        continue; /* Loop/switch isn't completed */
_L5:
        c = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L6:
        if (b == null)
        {
            b = new ivu();
        }
        kog1.a(b);
        continue; /* Loop/switch isn't completed */
_L7:
        d = Long.valueOf(kog1.d());
        continue; /* Loop/switch isn't completed */
_L8:
        if (e == null)
        {
            e = new iqh();
        }
        kog1.a(e);
        continue; /* Loop/switch isn't completed */
_L9:
        g = kog1.j();
        continue; /* Loop/switch isn't completed */
_L10:
        h = kog1.j();
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.intValue());
        }
        if (f != null)
        {
            koh1.a(2, f);
        }
        if (c != null)
        {
            koh1.a(3, c.longValue());
        }
        if (b != null)
        {
            koh1.b(4, b);
        }
        if (d != null)
        {
            koh1.a(5, d.longValue());
        }
        if (e != null)
        {
            koh1.b(6, e);
        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        super.writeTo(koh1);
    }
}
