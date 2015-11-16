// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class ldn extends ldu
    implements Serializable, Cloneable, ldq
{

    private static final long serialVersionUID = 0x2796807cf37e0267L;
    private lcy a;
    private int b;

    public ldn()
    {
    }

    public ldn(ldd ldd)
    {
        super(0L, ldd);
    }

    public ldo a(lcz lcz1)
    {
        if (lcz1 == null)
        {
            throw new IllegalArgumentException("The DateTimeFieldType must not be null");
        }
        lcy lcy1 = lcz1.a(c());
        if (!lcy1.c())
        {
            lcz1 = String.valueOf(lcz1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(lcz1).length() + 25)).append("Field '").append(lcz1).append("' is not supported").toString());
        } else
        {
            return new ldo(this, lcy1);
        }
    }

    public void a(long l)
    {
        long l1 = l;
        b;
        JVM INSTR tableswitch 0 5: default 44
    //                   0 46
    //                   1 52
    //                   2 64
    //                   3 76
    //                   4 88
    //                   5 100;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        l1 = l;
_L9:
        super.a(l1);
        return;
_L3:
        l1 = a.d(l);
        continue; /* Loop/switch isn't completed */
_L4:
        l1 = a.e(l);
        continue; /* Loop/switch isn't completed */
_L5:
        l1 = a.f(l);
        continue; /* Loop/switch isn't completed */
_L6:
        l1 = a.g(l);
        continue; /* Loop/switch isn't completed */
_L7:
        l1 = a.h(l);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public Object clone()
    {
        Object obj;
        try
        {
            obj = super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            throw new InternalError("Clone error");
        }
        return obj;
    }

    public String toString()
    {
        return lgk.a().a(this);
    }
}
