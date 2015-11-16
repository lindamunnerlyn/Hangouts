// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Field;
import java.util.Locale;

final class gjm
    implements gix, Runnable
{

    private final gjl a;
    private final String b;
    private final kws c;
    private final Class d;
    private final gds e;
    private final int f;
    private long g;
    private final int h;
    private int i;

    gjm(gjl gjl1, String s, kws kws1, Class class1, gds gds1, int j, long l, int k)
    {
        a = gjl1;
        b = s;
        c = kws1;
        d = class1;
        e = gds1;
        f = j;
        g = 1000L;
        h = k;
        i = 0;
    }

    private void a(kws kws1, jdl jdl1)
    {
        boolean flag;
        if (kws1 == null || jdl1 == null || jdl1.a.intValue() == 3 || jdl1.a.intValue() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag || i == h)
        {
            gne.c("vclib", "%s request failed after %d retries (%s)", new Object[] {
                b, Integer.valueOf(i), kws1
            });
            e.b(kws1);
            return;
        }
        i = i + 1;
        long l;
        if (jdl1 != null && jdl1.f != null)
        {
            l = jdl1.f.longValue();
        } else
        {
            l = 0L;
        }
        l = Math.max(l, g);
        g = g << 1;
        gne.a(3, "vclib", "Will retry %s request after %d milliseconds", new Object[] {
            b, Long.valueOf(l)
        });
        g.a(this, l);
    }

    public void a(long l)
    {
        a(((kws) (null)), ((jdl) (null)));
    }

    public void a(long l, String s)
    {
    }

    public void a(long l, byte abyte0[])
    {
        kws kws1;
        kws1 = (kws)d.newInstance();
        kws.mergeFrom(kws1, abyte0);
        abyte0 = (jdl)d.getField("responseHeader").get(kws1);
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (((jdl) (abyte0)).a.intValue() == 1)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        a(kws1, ((jdl) (abyte0)));
        return;
        try
        {
            gne.a(3, "vclib", "%s request succeeded (%s)", new Object[] {
                b, kws1
            });
            e.a(kws1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            gne.a("vclib", "Failed to process mesi response", abyte0);
        }
        e.b(null);
        return;
    }

    public void run()
    {
        try
        {
            Field field = c.getClass().getField("requestHeader");
            kws kws1 = c;
            jdk jdk1 = new jdk();
            jdk1.a = a.b;
            jdk1.b = a.c;
            jdk1.f = Integer.valueOf(i);
            String s = Locale.getDefault().getLanguage();
            if (!s.isEmpty())
            {
                jdk1.d = s;
            }
            field.set(kws1, jdk1);
            gne.a(3, "vclib", "Issuing %s request attempt %d (%s)", new Object[] {
                b, Integer.valueOf(i), c
            });
            a.a.a(String.valueOf(b).concat("?alt=proto"), kws.toByteArray(c), f, this);
            return;
        }
        catch (Exception exception)
        {
            gne.a("vclib", "Failed to issue mesi request", exception);
        }
        e.b(null);
    }
}
