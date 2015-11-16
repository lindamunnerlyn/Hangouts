// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Comparator;

public final class jtp extends jti
{

    private final Comparator c;

    public jtp(Comparator comparator)
    {
        c = (Comparator)n.b(comparator);
    }

    public jse a(Object obj)
    {
        super.c(obj);
        return this;
    }

    public jsf a(Object aobj[])
    {
        return c(aobj);
    }

    public jth a()
    {
        return b();
    }

    public jsf b(Object obj)
    {
        super.c(obj);
        return this;
    }

    public jti b(Object aobj[])
    {
        return c(aobj);
    }

    public jto b()
    {
        Object obj = ((Object) (a));
        Comparator comparator = c;
        int l = b;
        if (l == 0)
        {
            obj = jto.a(comparator);
        } else
        {
            jxa.b(((Object []) (obj)), l);
            Arrays.sort(((Object []) (obj)), 0, l, comparator);
            int j = 1;
            int i = 1;
            for (; j < l; j++)
            {
                Object obj1 = obj[j];
                if (comparator.compare(obj1, obj[i - 1]) != 0)
                {
                    int k = i + 1;
                    obj[i] = obj1;
                    i = k;
                }
            }

            Arrays.fill(((Object []) (obj)), i, l, null);
            obj = new jxm(jsh.b(((Object []) (obj)), i), comparator);
        }
        b = ((jto) (obj)).size();
        return ((jto) (obj));
    }

    public jti c(Object obj)
    {
        super.c(obj);
        return this;
    }

    public transient jtp c(Object aobj[])
    {
        super.b(aobj);
        return this;
    }
}
