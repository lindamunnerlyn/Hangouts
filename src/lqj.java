// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

final class lqj extends Enum
    implements lqo, lqs
{

    public static final lqj a;
    static final Set b;
    static final int c;
    private static final lqj d[];

    private lqj(String s)
    {
        super(s, 0);
    }

    public static lqj valueOf(String s)
    {
        return (lqj)Enum.valueOf(lqj, s);
    }

    public static lqj[] values()
    {
        return (lqj[])d.clone();
    }

    public int a()
    {
        return c;
    }

    public int a(lqp lqp1, String s, int i)
    {
        String s3;
        Iterator iterator;
        s3 = s.substring(i);
        s = null;
        iterator = b.iterator();
_L2:
        String s1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        String s2 = (String)iterator.next();
        if (!s3.startsWith(s2))
        {
            break MISSING_BLOCK_LABEL_104;
        }
        s1 = s2;
        if (s != null)
        {
            if (s2.length() <= s.length())
            {
                break MISSING_BLOCK_LABEL_104;
            }
            s1 = s2;
        }
_L3:
        s = s1;
        if (true) goto _L2; else goto _L1
_L1:
        if (s != null)
        {
            lqp1.a(lnn.a(s));
            return s.length() + i;
        } else
        {
            return ~i;
        }
        s1 = s;
          goto _L3
    }

    public void a(StringBuffer stringbuffer, long l, lng lng, int i, lnn lnn1, Locale locale)
    {
        if (lnn1 != null)
        {
            lng = lnn1.b;
        } else
        {
            lng = "";
        }
        stringbuffer.append(lng);
    }

    public int b()
    {
        return c;
    }

    static 
    {
        a = new lqj("INSTANCE");
        d = (new lqj[] {
            a
        });
        b = lnn.b();
        Iterator iterator = b.iterator();
        int i;
        for (i = 0; iterator.hasNext(); i = Math.max(i, ((String)iterator.next()).length())) { }
        c = i;
    }
}
