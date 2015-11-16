// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class crw
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final cyw b;
    public final List c;
    public final boolean d;
    public final byte e[];
    public final long f;
    public final long g;
    public final long h;

    private crw(irm irm1, boolean flag, long l)
    {
        int i = 0;
        super();
        a = irm1.a.a;
        if (irm1.c != null)
        {
            b = new cyw(irm1.c, (byte)0);
        } else
        {
            b = null;
        }
        if (irm1.b != null)
        {
            g = g.a(irm1.b, 0L);
        } else
        {
            g = 0L;
        }
        c = cza.a(irm1.d, flag, l);
        d = g.a(irm1.g, false);
        if (irm1.e != null)
        {
            isz isz1 = irm1.e;
            int j;
            if (isz1.b.length > 0)
            {
                e = Arrays.copyOf(isz1.b, isz1.b.length);
                f = g.a(isz1.a, 0L);
            } else
            {
                e = null;
                f = 0L;
            }
        } else
        {
            e = null;
            f = 0L;
        }
        j = irm1.h.length;
        l = 0L;
        for (; i < j; i++)
        {
            l = Math.max(l, g.a(irm1.h[i].c, 0L));
        }

        h = l;
    }

    public static crw a(byte abyte0[], boolean flag, long l)
    {
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        abyte0 = new crw((irm)kop.mergeFrom(new irm(), abyte0), flag, l);
        return abyte0;
        abyte0;
        return null;
    }

    public static List a(ArrayList arraylist, boolean flag, long l)
    {
        ArrayList arraylist1 = new ArrayList();
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                break;
            }
            crw crw1 = a((byte[])arraylist.next(), flag, l);
            if (crw1 != null)
            {
                arraylist1.add(crw1);
            }
        } while (true);
        return arraylist1;
    }
}
