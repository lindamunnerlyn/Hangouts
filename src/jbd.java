// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbd extends koj
{

    public jba a;
    public jbc b;
    public Boolean c;
    public jbw d;
    public jba e[];
    public ixf requestHeader;

    public jbd()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = jba.a();
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
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (koh.f(4) + 1);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(5, d);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    jba jba1 = e[j];
                    int k = i;
                    if (jba1 != null)
                    {
                        k = i + koh.d(6, jba1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
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
                    a = new jba();
                }
                kog1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new jbc();
                }
                kog1.a(b);
                break;

            case 32: // ' '
                c = Boolean.valueOf(kog1.i());
                break;

            case 42: // '*'
                if (d == null)
                {
                    d = new jbw();
                }
                kog1.a(d);
                break;

            case 50: // '2'
                int k = kou.b(kog1, 50);
                jba ajba[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                ajba = new jba[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, ajba, 0, j);
                    k = j;
                }
                for (; k < ajba.length - 1; k++)
                {
                    ajba[k] = new jba();
                    kog1.a(ajba[k]);
                    kog1.a();
                }

                ajba[k] = new jba();
                kog1.a(ajba[k]);
                e = ajba;
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
            koh1.b(3, b);
        }
        if (c != null)
        {
            koh1.a(4, c.booleanValue());
        }
        if (d != null)
        {
            koh1.b(5, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                jba jba1 = e[i];
                if (jba1 != null)
                {
                    koh1.b(6, jba1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
