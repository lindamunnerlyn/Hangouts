// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class lez extends lex
{

    private static final long serialVersionUID = 0x6f4cb35dbe61c66fL;
    final ldh a;

    public lez(ldh ldh1, ldi ldi)
    {
        super(ldi);
        if (ldh1 == null)
        {
            throw new IllegalArgumentException("The field must not be null");
        }
        if (!ldh1.b())
        {
            throw new IllegalArgumentException("The field must be supported");
        } else
        {
            a = ldh1;
            return;
        }
    }

    public long a(long l, int i)
    {
        return a.a(l, i);
    }

    public long a(long l, long l1)
    {
        return a.a(l, l1);
    }

    public boolean c()
    {
        return a.c();
    }

    public long d()
    {
        return a.d();
    }
}
