// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;

public final class dba
    implements Serializable
{

    private static final long serialVersionUID = 2L;
    public final long a;
    public final String b;
    private final EnumMap c;

    public dba(jcp jcp1, String s, long l)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        super();
        c = new EnumMap(cvc);
        a = l;
        b = s;
        c.put(cvc.a, jcp1.a);
        c.put(cvc.b, jcp1.b);
        obj1 = c;
        obj2 = cvc.c;
        s = jcp1.i;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s = ((jfa) (s)).a;
        if (s == null || s.length <= 0)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s = ((jbr) (s[0])).a;
        if (s == null || s.length <= 0)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s = g.a(dmt.a(s), null);
_L1:
        ((EnumMap) (obj1)).put(((Enum) (obj2)), s);
        if (jcp1.e != null)
        {
            s = jcp1.e.a;
        } else
        {
            s = null;
        }
        c.put(cvc.d, s);
        obj1 = c;
        obj2 = cvc.e;
        s = jcp1.f;
        if (s != null)
        {
            if (g.a(((iyl) (s)).a, false))
            {
                s = Integer.valueOf(1);
            } else
            if (g.a(((iyl) (s)).c, false))
            {
                s = Integer.valueOf(2);
            } else
            if (g.a(((iyl) (s)).b, false))
            {
                s = Integer.valueOf(3);
            } else
            {
                s = Integer.valueOf(0);
            }
        } else
        {
            s = null;
        }
        ((EnumMap) (obj1)).put(((Enum) (obj2)), s);
        s = c;
        obj1 = cvc.f;
        obj2 = jcp1.j;
        jcp1 = obj;
        if (obj2 != null)
        {
            jcp1 = obj;
            if (((jbe) (obj2)).a != null)
            {
                l = g.a(((jbe) (obj2)).a, 0L);
                jcp1 = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l));
            }
        }
        s.put(((Enum) (obj1)), jcp1);
        return;
        s = null;
          goto _L1
    }

    public Object a(cvc cvc1)
    {
        return c.get(cvc1);
    }
}
