// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class igp extends koj
{

    private static volatile igp e[];
    public String a;
    public String b;
    public int c;
    public String d;

    public igp()
    {
        a = null;
        b = null;
        c = 0x80000000;
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static igp[] a()
    {
        if (e == null)
        {
            synchronized (kon.a)
            {
                if (e == null)
                {
                    e = new igp[0];
                }
            }
        }
        return e;
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
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.b(2, b);
        }
        i = j;
        if (c != 0x80000000)
        {
            i = j + koh.e(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(4, d);
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
    //                   10: 67
    //                   18: 78
    //                   24: 89
    //                   34: 131;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L7
_L4:
        b = kog1.j();
          goto _L7
_L5:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            c = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        d = kog1.j();
        if (true) goto _L7; else goto _L8
_L8:
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
        if (c != 0x80000000)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        super.writeTo(koh1);
    }
}
