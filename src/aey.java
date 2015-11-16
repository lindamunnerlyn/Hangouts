// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class aey
    implements aeq
{

    private static Set a = new HashSet(Arrays.asList(new String[] {
        "X-PHONETIC-FIRST-NAME", "X-PHONETIC-MIDDLE-NAME", "X-PHONETIC-LAST-NAME", "X-ABADR", "X-ABUID"
    }));
    private static Set b = new HashSet(Arrays.asList(new String[] {
        "X-GNO", "X-GN", "X-REDUCTION"
    }));
    private static Set c = new HashSet(Arrays.asList(new String[] {
        "X-MICROSOFT-ASST_TEL", "X-MICROSOFT-ASSISTANT", "X-MICROSOFT-OFFICELOC"
    }));
    private static Set d = new HashSet(Arrays.asList(new String[] {
        "X-SD-VERN", "X-SD-FORMAT_VER", "X-SD-CATEGORIES", "X-SD-CLASS", "X-SD-DCREATED", "X-SD-DESCRIPTION"
    }));
    private static String e = "X-SD-CHAR_CODE";
    private int f;
    private int g;
    private String h;

    public aey()
    {
        f = 0;
        g = -1;
    }

    public void a()
    {
    }

    public void a(aex aex1)
    {
        String s;
        s = aex1.a();
        aex1 = aex1.d();
        if (!s.equalsIgnoreCase("VERSION") || aex1.size() <= 0) goto _L2; else goto _L1
_L1:
        aex1 = (String)aex1.get(0);
        if (aex1.equals("2.1"))
        {
            g = 0;
        } else
        if (aex1.equals("3.0"))
        {
            g = 1;
        } else
        if (aex1.equals("4.0"))
        {
            g = 2;
        } else
        {
            aex1 = String.valueOf(aex1);
            if (aex1.length() != 0)
            {
                "Invalid version string: ".concat(aex1);
            } else
            {
                new String("Invalid version string: ");
            }
        }
_L7:
        if (f == 0) goto _L4; else goto _L3
_L3:
        return;
_L2:
        if (s.equalsIgnoreCase(e))
        {
            f = 3;
            if (aex1.size() > 0)
            {
                h = (String)aex1.get(0);
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (c.contains(s))
        {
            f = 4;
            return;
        }
        if (d.contains(s))
        {
            f = 3;
            return;
        }
        if (b.contains(s))
        {
            f = 2;
            return;
        }
        if (!a.contains(s)) goto _L3; else goto _L5
_L5:
        f = 1;
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void b()
    {
    }

    public int c()
    {
        switch (f)
        {
        default:
            if (g == 0)
            {
                return 0xc0000000;
            }
            break;

        case 3: // '\003'
            return 0x38000008;

        case 2: // '\002'
            return 0x18000008;
        }
        if (g == 1)
        {
            return 0xc0000001;
        }
        return g != 2 ? 0 : 0xc0000002;
    }

    public void d()
    {
    }

    public void e()
    {
    }

}
