// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public abstract class jxb
    implements Comparator
{

    protected jxb()
    {
    }

    public static jxb a(Comparator comparator)
    {
        if (comparator instanceof jxb)
        {
            return (jxb)comparator;
        } else
        {
            return new jrl(comparator);
        }
    }

    public jsh a(Iterable iterable)
    {
        int j;
        if (iterable instanceof Collection)
        {
            iterable = (Collection)iterable;
        } else
        {
            iterable = h.a(iterable.iterator());
        }
        iterable = ((Iterable) (iterable.toArray()));
        j = iterable.length;
        for (int i = 0; i < j; i++)
        {
            n.b(iterable[i]);
        }

        Arrays.sort(iterable, this);
        return jsh.b(iterable, iterable.length);
    }

    public jxb a()
    {
        return new jwy(this);
    }

    public jxb a(jnn jnn)
    {
        return new jrj(jnn, this);
    }

    public jxb b()
    {
        return new jwz(this);
    }

    public jxb c()
    {
        return new jxo(this);
    }

    public abstract int compare(Object obj, Object obj1);

    jxb d()
    {
        return a(jwd.a());
    }
}
