// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;

public final class czu
    implements Serializable
{

    private static final long serialVersionUID = 2L;
    public final long a;
    public final String b;
    private final EnumMap c;

    public czu(iwk iwk1, String s, long l)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        super();
        c = new EnumMap(csz);
        a = l;
        b = s;
        c.put(csz.a, iwk1.a);
        c.put(csz.b, iwk1.b);
        obj1 = c;
        obj2 = csz.c;
        s = iwk1.i;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s = ((iyv) (s)).a;
        if (s == null || s.length <= 0)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s = ((ivm) (s[0])).a;
        if (s == null || s.length <= 0)
        {
            break MISSING_BLOCK_LABEL_265;
        }
        s = g.a(crr.a(s), null);
_L1:
        ((EnumMap) (obj1)).put(((Enum) (obj2)), s);
        if (iwk1.e != null)
        {
            s = iwk1.e.a;
        } else
        {
            s = null;
        }
        c.put(csz.d, s);
        obj1 = c;
        obj2 = csz.e;
        s = iwk1.f;
        if (s != null)
        {
            if (g.a(((isg) (s)).a, false))
            {
                s = Integer.valueOf(1);
            } else
            if (g.a(((isg) (s)).c, false))
            {
                s = Integer.valueOf(2);
            } else
            if (g.a(((isg) (s)).b, false))
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
        obj1 = csz.f;
        obj2 = iwk1.j;
        iwk1 = obj;
        if (obj2 != null)
        {
            iwk1 = obj;
            if (((iuz) (obj2)).a != null)
            {
                l = g.a(((iuz) (obj2)).a, 0L);
                iwk1 = Long.valueOf(TimeUnit.MICROSECONDS.toMillis(l));
            }
        }
        s.put(((Enum) (obj1)), iwk1);
        return;
        s = null;
          goto _L1
    }

    public Object a(csz csz1)
    {
        return c.get(csz1);
    }
}
