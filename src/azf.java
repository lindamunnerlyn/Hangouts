// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class azf
{

    final Map a = new HashMap();
    private final eew b;

    public azf(eew eew1)
    {
        b = eew1;
    }

    Collection a()
    {
        return a.values();
    }

    void a(asa asa1)
    {
        asa asa3;
        String s;
        if (b != null)
        {
            b.a("merge start");
        }
        s = String.format(Locale.US, "%s, TransportId: {%d}", new Object[] {
            asa1.h.b.toString(), Integer.valueOf(asa1.b)
        });
        asa3 = (asa)a.get(s);
        if (asa3 != null) goto _L2; else goto _L1
_L1:
        a.put(s, asa1);
        if (b != null)
        {
            b.a("merge done null");
        }
_L4:
        return;
_L2:
        asa asa2;
        Map map;
        map = a;
        if (asa3 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        asa2 = asa1;
_L6:
        map.put(s, asa2);
        if (b != null)
        {
            b.a("merge done picked");
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj;
        Object obj1;
        obj = asa3.i;
        obj1 = asa1.i;
        asa2 = asa1;
        if (obj == null) goto _L6; else goto _L5
_L5:
        if (obj1 == null) goto _L8; else goto _L7
_L7:
        if (((aoz) (obj)).r == ((aoz) (obj1)).r) goto _L10; else goto _L9
_L9:
        if (((aoz) (obj)).r == 1) goto _L8; else goto _L11
_L11:
        asa2 = asa1;
        if (((aoz) (obj1)).r == 1) goto _L6; else goto _L10
_L10:
        if (((aoz) (obj)).q > ((aoz) (obj1)).q) goto _L8; else goto _L12
_L12:
        asa2 = asa1;
        if (((aoz) (obj)).q < ((aoz) (obj1)).q) goto _L6; else goto _L13
_L13:
        obj = asa3.j;
        obj1 = asa1.j;
        if (obj1 == null) goto _L8; else goto _L14
_L14:
        asa2 = asa1;
        if (obj == null) goto _L6; else goto _L15
_L15:
        int i;
        i = ((bhv) (obj)).g().size();
        asa2 = asa1;
        if (((bhv) (obj1)).g().size() > i) goto _L6; else goto _L8
_L8:
        asa2 = asa3;
          goto _L6
    }
}
