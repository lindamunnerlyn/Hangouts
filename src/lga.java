// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

final class lga
    implements lge, lgi
{

    private final Map a = null;
    private final int b;

    lga(int i, Map map)
    {
        b = i;
    }

    public int a()
    {
        return b != 1 ? 20 : 4;
    }

    public int a(lgf lgf1, String s, int i)
    {
        String s1;
        Map map;
        map = a;
        String s2;
        String s3;
        Iterator iterator;
        if (map == null)
        {
            map = ldb.b();
        }
        s3 = s.substring(i);
        s = null;
        iterator = map.keySet().iterator();
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s2 = (String)iterator.next();
        if (!s3.startsWith(s2))
        {
            break MISSING_BLOCK_LABEL_134;
        }
        s1 = s2;
        if (s != null)
        {
            if (s2.length() <= s.length())
            {
                break MISSING_BLOCK_LABEL_134;
            }
            s1 = s2;
        }
_L4:
        s = s1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_34;
_L1:
        if (s != null)
        {
            lgf1.a((ldd)map.get(s));
            return s.length() + i;
        } else
        {
            return ~i;
        }
        s1 = s;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(StringBuffer stringbuffer, long l, lcw lcw, int i, ldd ldd1, Locale locale)
    {
        l -= i;
        if (ldd1 == null) goto _L2; else goto _L1
_L1:
        b;
        JVM INSTR tableswitch 0 1: default 36
    //                   0 48
    //                   1 61;
           goto _L2 _L3 _L4
_L2:
        lcw = "";
_L6:
        stringbuffer.append(lcw);
        return;
_L3:
        lcw = ldd1.b(l, locale);
        continue; /* Loop/switch isn't completed */
_L4:
        lcw = ldd1.a(l, locale);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int b()
    {
        return b != 1 ? 20 : 4;
    }
}
