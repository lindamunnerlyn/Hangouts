// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public class cuh extends cui
{

    private static final long serialVersionUID = 1L;
    public int a;
    public int b;
    public int c;
    public int d;
    public int j;
    public byte k[];
    public byte l[];
    public byte m[];
    public byte n[];
    public byte o[];

    public cuh(int i, int i1, int j1, int k1, int l1, byte abyte0[], byte abyte1[], 
            byte abyte2[], byte abyte3[], byte abyte4[])
    {
        a = i;
        b = i1;
        c = j1;
        d = k1;
        j = l1;
        k = abyte0;
        l = abyte1;
        m = abyte2;
        n = abyte3;
        o = abyte4;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int i1)
    {
        if (ctr.e)
        {
            ebw.b("Babel_RequestWriter", "getSuggestedRequest()");
        }
        iub iub1 = new iub();
        iub1.c = Boolean.valueOf(false);
        iub1.requestHeader = ctq.a(null, true, s, i, i1, h);
        s = new iuc();
        s.a = Integer.valueOf(a);
        if (k != null)
        {
            s.b = Arrays.copyOf(k, k.length);
        }
        iub1.f = s;
        s = new iuc();
        s.a = Integer.valueOf(b);
        if (l != null)
        {
            s.b = Arrays.copyOf(l, l.length);
        }
        iub1.g = s;
        s = new iuc();
        s.a = Integer.valueOf(c);
        if (m != null)
        {
            s.b = Arrays.copyOf(m, m.length);
        }
        iub1.h = s;
        s = new iuc();
        s.a = Integer.valueOf(d);
        if (n != null)
        {
            s.b = Arrays.copyOf(n, n.length);
        }
        iub1.i = s;
        s = new iuc();
        s.a = Integer.valueOf(j);
        if (o != null)
        {
            s.b = Arrays.copyOf(o, o.length);
        }
        iub1.k = s;
        return iub1;
    }

    public void a(ani ani1, dbo dbo)
    {
        dbo = dir.b(ani1.h());
        ani1 = String.valueOf(ebw.b(ani1.a()));
        if (ani1.length() != 0)
        {
            ani1 = "SyncBaselineSuggestedContactsOperation failed: ".concat(ani1);
        } else
        {
            ani1 = new String("SyncBaselineSuggestedContactsOperation failed: ");
        }
        ebw.f("Babel_RequestWriter", ani1);
        dbo.a(0);
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return true;
    }

    public String g()
    {
        return "contacts/getsuggestedentities";
    }
}
