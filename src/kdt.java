// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kdt extends kwm
{

    public Integer a;
    public Integer b;
    public kdu c[];
    public kdv d[];

    public kdt()
    {
        a = null;
        b = null;
        c = kdu.a();
        d = kdv.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.e(1, a.intValue());
        }
        j = i;
        if (b != null)
        {
            j = i + kwk.e(2, b.intValue());
        }
        i = j;
        if (c != null)
        {
            i = j;
            if (c.length > 0)
            {
                i = j;
                for (int k = 0; k < c.length;)
                {
                    kdu kdu1 = c[k];
                    int i1 = i;
                    if (kdu1 != null)
                    {
                        i1 = i + kwk.d(3, kdu1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (d != null)
        {
            j1 = i;
            if (d.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= d.length)
                    {
                        break;
                    }
                    kdv kdv1 = d[l];
                    j1 = i;
                    if (kdv1 != null)
                    {
                        j1 = i + kwk.d(4, kdv1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L7:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 5: default 56
    //                   0: 65
    //                   8: 67
    //                   16: 126
    //                   26: 140
    //                   34: 264;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L7; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        b = Integer.valueOf(kwj1.f());
        continue; /* Loop/switch isn't completed */
_L5:
        int i1 = kwx.a(kwj1, 26);
        kdu akdu[];
        int k;
        if (c == null)
        {
            k = 0;
        } else
        {
            k = c.length;
        }
        akdu = new kdu[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(c, 0, akdu, 0, k);
            i1 = k;
        }
        for (; i1 < akdu.length - 1; i1++)
        {
            akdu[i1] = new kdu();
            kwj1.a(akdu[i1]);
            kwj1.a();
        }

        akdu[i1] = new kdu();
        kwj1.a(akdu[i1]);
        c = akdu;
        continue; /* Loop/switch isn't completed */
_L6:
        int j1 = kwx.a(kwj1, 34);
        kdv akdv[];
        int l;
        if (d == null)
        {
            l = 0;
        } else
        {
            l = d.length;
        }
        akdv = new kdv[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(d, 0, akdv, 0, l);
            j1 = l;
        }
        for (; j1 < akdv.length - 1; j1++)
        {
            akdv[j1] = new kdv();
            kwj1.a(akdv[j1]);
            kwj1.a();
        }

        akdv[j1] = new kdv();
        kwj1.a(akdv[j1]);
        d = akdv;
        if (true) goto _L7; else goto _L8
_L8:
    }

    public void writeTo(kwk kwk1)
    {
        boolean flag = false;
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kdu kdu1 = c[i];
                if (kdu1 != null)
                {
                    kwk1.b(3, kdu1);
                }
            }

        }
        if (d != null && d.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < d.length; j++)
            {
                kdv kdv1 = d[j];
                if (kdv1 != null)
                {
                    kwk1.b(4, kdv1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
