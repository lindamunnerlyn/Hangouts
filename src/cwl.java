// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public class cwl extends cwm
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

    public cwl(int i, int i1, int j1, int k1, int l1, byte abyte0[], byte abyte1[], 
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

    public kws a(String s, int i, int i1)
    {
        if (cvv.e)
        {
            eev.b("Babel_RequestWriter", "getSuggestedRequest()");
        }
        jag jag1 = new jag();
        jag1.c = Boolean.valueOf(false);
        jag1.requestHeader = cvu.a(null, true, s, i, i1, h);
        s = new jah();
        s.a = Integer.valueOf(a);
        if (k != null)
        {
            s.b = Arrays.copyOf(k, k.length);
        }
        jag1.f = s;
        s = new jah();
        s.a = Integer.valueOf(b);
        if (l != null)
        {
            s.b = Arrays.copyOf(l, l.length);
        }
        jag1.g = s;
        s = new jah();
        s.a = Integer.valueOf(c);
        if (m != null)
        {
            s.b = Arrays.copyOf(m, m.length);
        }
        jag1.h = s;
        s = new jah();
        s.a = Integer.valueOf(d);
        if (n != null)
        {
            s.b = Arrays.copyOf(n, n.length);
        }
        jag1.i = s;
        s = new jah();
        s.a = Integer.valueOf(j);
        if (o != null)
        {
            s.b = Arrays.copyOf(o, o.length);
        }
        jag1.k = s;
        return jag1;
    }

    public void a(aoa aoa1, dcx dcx)
    {
        dcx = dke.b(aoa1.h());
        aoa1 = String.valueOf(eev.b(aoa1.a()));
        if (aoa1.length() != 0)
        {
            aoa1 = "SyncBaselineSuggestedContactsOperation failed: ".concat(aoa1);
        } else
        {
            aoa1 = new String("SyncBaselineSuggestedContactsOperation failed: ");
        }
        eev.f("Babel_RequestWriter", aoa1);
        dcx.a(0);
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return true;
    }

    public String f()
    {
        return "contacts/getsuggestedentities";
    }
}
