// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class ctz
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final dnc b;
    public final List c;
    public final boolean d;
    public final byte e[];
    public final long f;
    public final long g;
    public final long h;

    private ctz(ixr ixr1, boolean flag, long l)
    {
        int i = 0;
        super();
        a = ixr1.a.a;
        if (ixr1.c != null)
        {
            b = new dnc(ixr1.c, (byte)0);
        } else
        {
            b = null;
        }
        if (ixr1.b != null)
        {
            g = g.a(ixr1.b, 0L);
        } else
        {
            g = 0L;
        }
        c = dng.a(ixr1.d, flag, l);
        d = g.a(ixr1.g, false);
        if (ixr1.e != null)
        {
            ize ize1 = ixr1.e;
            int j;
            if (ize1.b.length > 0)
            {
                e = Arrays.copyOf(ize1.b, ize1.b.length);
                f = g.a(ize1.a, 0L);
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
        j = ixr1.h.length;
        l = 0L;
        for (; i < j; i++)
        {
            l = Math.max(l, g.a(ixr1.h[i].c, 0L));
        }

        h = l;
    }

    public static ctz a(byte abyte0[], boolean flag, long l)
    {
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        abyte0 = new ctz((ixr)kws.mergeFrom(new ixr(), abyte0), flag, l);
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
            ctz ctz1 = a((byte[])arraylist.next(), flag, l);
            if (ctz1 != null)
            {
                arraylist1.add(ctz1);
            }
        } while (true);
        return arraylist1;
    }
}
