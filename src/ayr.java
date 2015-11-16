// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class ayr
{

    final Map a = new HashMap();
    private final ebx b;

    public ayr(ebx ebx1)
    {
        b = ebx1;
    }

    Collection a()
    {
        return a.values();
    }

    void a(ark ark1)
    {
        ark ark3;
        String s;
        if (b != null)
        {
            b.a("merge start");
        }
        s = String.format(Locale.US, "%s, TransportId: {%d}", new Object[] {
            ark1.h.b.toString(), Integer.valueOf(ark1.b)
        });
        ark3 = (ark)a.get(s);
        if (ark3 != null) goto _L2; else goto _L1
_L1:
        a.put(s, ark1);
        if (b != null)
        {
            b.a("merge done null");
        }
_L4:
        return;
_L2:
        ark ark2;
        Map map;
        map = a;
        if (ark3 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        ark2 = ark1;
_L6:
        map.put(s, ark2);
        if (b != null)
        {
            b.a("merge done picked");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        obj = ark3.i;
        obj1 = ark1.i;
        ark2 = ark1;
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        if (((aoh) (obj)).r == ((aoh) (obj1)).r) goto _L10; else goto _L9
_L9:
        if (((aoh) (obj)).r == 1) goto _L8; else goto _L11
_L11:
        ark2 = ark1;
        if (((aoh) (obj1)).r == 1) goto _L6; else goto _L10
_L10:
        if (((aoh) (obj)).q > ((aoh) (obj1)).q) goto _L8; else goto _L12
_L12:
        ark2 = ark1;
        if (((aoh) (obj)).q < ((aoh) (obj1)).q) goto _L6; else goto _L13
_L13:
        obj = ark3.j;
        obj1 = ark1.j;
        if (obj1 == null) goto _L8; else goto _L14
_L14:
        ark2 = ark1;
        if (obj == null) goto _L6; else goto _L15
_L15:
        int i;
        i = ((bhj) (obj)).g().size();
        ark2 = ark1;
        if (((bhj) (obj1)).g().size() > i) goto _L6; else goto _L8
_L8:
        ark2 = ark3;
          goto _L6
    }
}
