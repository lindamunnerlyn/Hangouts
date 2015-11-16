// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ipx extends kwm
{

    public Integer a;
    public String b[];
    public ipz c;

    public ipx()
    {
        a = null;
        b = kwx.f;
        c = null;
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
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < b.length;)
                {
                    String s = b[j];
                    int j1 = k;
                    int i1 = l;
                    if (s != null)
                    {
                        i1 = l + 1;
                        j1 = k + kwk.a(s);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + kwk.d(3, c);
        }
        return i;
    }

    public kws mergeFrom(kwj kwj1)
    {
_L6:
        int i = kwj1.a();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   18: 106
    //                   26: 208;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = kwj1.f();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            a = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int l = kwx.a(kwj1, 18);
        String as[];
        int k;
        if (b == null)
        {
            k = 0;
        } else
        {
            k = b.length;
        }
        as = new String[l + k];
        l = k;
        if (k != 0)
        {
            System.arraycopy(b, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = kwj1.j();
            kwj1.a();
        }

        as[l] = kwj1.j();
        b = as;
        continue; /* Loop/switch isn't completed */
_L5:
        if (c == null)
        {
            c = new ipz();
        }
        kwj1.a(c);
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                String s = b[i];
                if (s != null)
                {
                    kwk1.a(2, s);
                }
            }

        }
        if (c != null)
        {
            kwk1.b(3, c);
        }
        super.writeTo(kwk1);
    }
}
