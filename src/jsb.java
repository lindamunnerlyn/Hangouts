// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class jsb extends jsq
{

    public jsb()
    {
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
            return jxe.a(c, b);

        case 0: // '\0'
            return jxe.b;

        case 1: // '\001'
            return jsa.a(b[0].getKey(), b[0].getValue());
        }
    }

    public jsq a(Object obj, Object obj1)
    {
        super.a(obj, obj1);
        return this;
    }
}
