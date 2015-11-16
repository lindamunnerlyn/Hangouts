// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itn extends koj
{

    public jtj a;
    public String b;
    public Boolean c;
    public jtj d[];
    public iwc e;
    public ixf requestHeader;

    public itn()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = jtj.a();
        e = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + koh.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(2, a);
        }
        int k = j;
        if (b != null)
        {
            k = j + koh.b(3, b);
        }
        i = k;
        if (c != null)
        {
            c.booleanValue();
            i = k + (koh.f(4) + 1);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    jtj jtj1 = d[j];
                    int l = i;
                    if (jtj1 != null)
                    {
                        l = i + koh.d(5, jtj1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(6, e);
        }
        return i;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i = kog1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kog1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (requestHeader == null)
                {
                    requestHeader = new ixf();
                }
                kog1.a(requestHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new jtj();
                }
                kog1.a(a);
                break;

            case 26: // '\032'
                b = kog1.j();
                break;

            case 32: // ' '
                c = Boolean.valueOf(kog1.i());
                break;

            case 42: // '*'
                int k = kou.b(kog1, 42);
                jtj ajtj[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                ajtj = new jtj[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, ajtj, 0, j);
                    k = j;
                }
                for (; k < ajtj.length - 1; k++)
                {
                    ajtj[k] = new jtj();
                    kog1.a(ajtj[k]);
                    kog1.a();
                }

                ajtj[k] = new jtj();
                kog1.a(ajtj[k]);
                d = ajtj;
                break;

            case 50: // '2'
                if (e == null)
                {
                    e = new iwc();
                }
                kog1.a(e);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null)
        {
            koh1.a(3, b);
        }
        if (c != null)
        {
            koh1.a(4, c.booleanValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                jtj jtj1 = d[i];
                if (jtj1 != null)
                {
                    koh1.b(5, jtj1);
                }
            }

        }
        if (e != null)
        {
            koh1.b(6, e);
        }
        super.writeTo(koh1);
    }
}
