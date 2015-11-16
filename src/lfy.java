// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

final class lfy
    implements lge, lgi
{

    private static Map a = new HashMap();
    private final lcz b;
    private final boolean c;

    lfy(lcz lcz1, boolean flag)
    {
        b = lcz1;
        c = flag;
    }

    public int a()
    {
        return !c ? 20 : 6;
    }

    public int a(lgf lgf1, String s, int i)
    {
        Locale locale = lgf1.b();
        Map map = a;
        map;
        JVM INSTR monitorenter ;
        Object obj = (Map)a.get(locale);
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        obj = new HashMap();
        a.put(locale, obj);
        Object obj1 = ((Object) ((Object[])((Map) (obj)).get(b)));
        if (obj1 != null) goto _L2; else goto _L1
_L1:
        ldo ldo1;
        int j;
        int l;
        obj1 = new HashSet(32);
        ldo1 = (new ldn(ldd.a)).a(b);
        j = ldo1.g();
        l = ldo1.h();
        if (l - j <= 32)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        map;
        JVM INSTR monitorexit ;
        return ~i;
        int k = ldo1.c(locale);
_L4:
        if (j > l)
        {
            break; /* Loop/switch isn't completed */
        }
        ldo1.a(j);
        ((Set) (obj1)).add(ldo1.b(locale));
        ((Set) (obj1)).add(ldo1.b(locale).toLowerCase(locale));
        ((Set) (obj1)).add(ldo1.b(locale).toUpperCase(locale));
        ((Set) (obj1)).add(ldo1.a(locale));
        ((Set) (obj1)).add(ldo1.a(locale).toLowerCase(locale));
        ((Set) (obj1)).add(ldo1.a(locale).toUpperCase(locale));
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        j = k;
        if (!"en".equals(locale.getLanguage()))
        {
            break MISSING_BLOCK_LABEL_355;
        }
        j = k;
        if (b != lcz.w())
        {
            break MISSING_BLOCK_LABEL_355;
        }
        ((Set) (obj1)).add("BCE");
        ((Set) (obj1)).add("bce");
        ((Set) (obj1)).add("CE");
        ((Set) (obj1)).add("ce");
        j = 3;
        ((Map) (obj)).put(b, ((Object) (new Object[] {
            obj1, Integer.valueOf(j)
        })));
        obj = obj1;
_L8:
        map;
        JVM INSTR monitorexit ;
        j = Math.min(s.length(), j + i);
_L6:
        if (j <= i)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = s.substring(i, j);
        if (((Set) (obj)).contains(obj1))
        {
            lgf1.a(b, ((String) (obj1)), locale);
            return j;
        }
        j--;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = (Set)obj1[0];
        j = ((Integer)obj1[1]).intValue();
        continue; /* Loop/switch isn't completed */
        lgf1;
        map;
        JVM INSTR monitorexit ;
        throw lgf1;
        if (true) goto _L6; else goto _L5
_L5:
        return ~i;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(StringBuffer stringbuffer, long l, lcw lcw, int i, ldd ldd1, Locale locale)
    {
        lcw = b.a(lcw);
        if (!c)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        lcw = lcw.b(l, locale);
_L1:
        stringbuffer.append(lcw);
        return;
        try
        {
            lcw = lcw.a(l, locale);
        }
        // Misplaced declaration of an exception variable
        catch (lcw lcw)
        {
            stringbuffer.append('\uFFFD');
            return;
        }
          goto _L1
    }

    public int b()
    {
        return a();
    }

}
