// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class htr extends koj
{

    private static volatile htr d[];
    public String a;
    public String b;
    public Integer c;

    public htr()
    {
        a = null;
        b = null;
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static htr[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new htr[0];
                }
            }
        }
        return d;
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
        if (c != null)
        {
            i = j + koh.e(3, c.intValue());
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
_L6:
        int i = kog1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   10: 59
    //                   18: 70
    //                   24: 81;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kog1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        a = kog1.j();
          goto _L6
_L4:
        b = kog1.j();
          goto _L6
_L5:
        int j = kog1.f();
        switch (j)
        {
        case 0: // '\0'
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
        case 40: // '('
        case 50: // '2'
            c = Integer.valueOf(j);
            break;
        }
        if (true) goto _L6; else goto _L7
_L7:
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
            koh1.a(3, c.intValue());
        }
        super.writeTo(koh1);
    }
}
