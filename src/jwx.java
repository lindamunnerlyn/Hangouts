// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;

public final class jwx extends jxb
    implements Serializable
{

    public static final jwx a = new jwx();
    private static final long serialVersionUID = 0L;
    private transient jxb b;
    private transient jxb c;

    private jwx()
    {
    }

    private Object readResolve()
    {
        return a;
    }

    public jxb a()
    {
        jxb jxb2 = b;
        jxb jxb1 = jxb2;
        if (jxb2 == null)
        {
            jxb1 = super.a();
            b = jxb1;
        }
        return jxb1;
    }

    public jxb b()
    {
        jxb jxb2 = c;
        jxb jxb1 = jxb2;
        if (jxb2 == null)
        {
            jxb1 = super.b();
            c = jxb1;
        }
        return jxb1;
    }

    public jxb c()
    {
        return jxn.a;
    }

    public int compare(Object obj, Object obj1)
    {
        obj = (Comparable)obj;
        obj1 = (Comparable)obj1;
        n.b(obj);
        n.b(obj1);
        return ((Comparable) (obj)).compareTo(obj1);
    }

    public String toString()
    {
        return "Ordering.natural()";
    }

}
