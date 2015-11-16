// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public abstract class lex extends ldh
    implements Serializable
{

    private static final long serialVersionUID = 0xdc8d7f9b8cda387eL;
    final ldi d;

    public lex(ldi ldi1)
    {
        if (ldi1 == null)
        {
            throw new IllegalArgumentException("The type must not be null");
        } else
        {
            d = ldi1;
            return;
        }
    }

    public int a(ldh ldh1)
    {
        long l = ldh1.d();
        long l1 = d();
        if (l1 == l)
        {
            return 0;
        }
        return l1 >= l ? 1 : -1;
    }

    public final ldi a()
    {
        return d;
    }

    public final boolean b()
    {
        return true;
    }

    public int compareTo(Object obj)
    {
        return a((ldh)obj);
    }

    public String toString()
    {
        String s = d.m();
        return (new StringBuilder(String.valueOf(s).length() + 15)).append("DurationField[").append(s).append("]").toString();
    }
}
