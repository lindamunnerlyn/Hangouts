// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lax extends kwm
{

    public lbd a;
    public int b;

    public lax()
    {
        a = null;
        b = 0x80000000;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != 0x80000000)
        {
            j = i + kwk.e(2, b);
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L5:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 3: default 40
    //                   0: 49
    //                   10: 51
    //                   16: 80;
           goto _L1 _L2 _L3 _L4
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L5; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new lbd();
        }
        kwj1.a(a);
          goto _L5
_L4:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            b = j;
            break;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != 0x80000000)
        {
            kwk1.a(2, b);
        }
        super.writeTo(kwk1);
    }
}
