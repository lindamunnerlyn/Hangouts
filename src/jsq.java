// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Comparator;

public class jsq
{

    Comparator a;
    jss b[];
    int c;
    boolean d;

    public jsq()
    {
        this(4);
    }

    jsq(int i)
    {
        b = new jss[i];
        c = 0;
        d = false;
    }

    public jso a()
    {
        switch (c)
        {
        default:
            if (a != null)
            {
                if (d)
                {
                    b = (jss[])jxa.a(b, c);
                }
                Arrays.sort(b, 0, c, jxb.a(a).a(jwd.b()));
            }
            boolean flag;
            if (c == b.length)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = flag;
            return jxk.a(c, b);

        case 0: // '\0'
            return jxe.b;

        case 1: // '\001'
            return jsa.a(b[0].getKey(), b[0].getValue());
        }
    }

    public jsq a(Object obj, Object obj1)
    {
        int i = c + 1;
        if (i > b.length)
        {
            b = (jss[])jxa.a(b, jsf.a(b.length, i));
            d = false;
        }
        obj = jso.b(obj, obj1);
        obj1 = b;
        i = c;
        c = i + 1;
        obj1[i] = obj;
        return this;
    }
}
