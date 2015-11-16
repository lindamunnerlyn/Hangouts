// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class hwn extends koj
{

    public hwc a;
    public hwo b[];
    public String c;
    public String d;
    public hwo e;
    public String f;
    public String g;

    public hwn()
    {
        a = null;
        b = hwo.a();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    hwo hwo1 = b[j];
                    int k = i;
                    if (hwo1 != null)
                    {
                        k = i + koh.d(2, hwo1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.b(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.b(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(5, e);
        }
        j = i;
        if (f != null)
        {
            j = i + koh.b(6, f);
        }
        i = j;
        if (g != null)
        {
            i = j + koh.b(7, g);
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
                if (a == null)
                {
                    a = new hwc();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                hwo ahwo[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ahwo = new hwo[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ahwo, 0, j);
                    k = j;
                }
                for (; k < ahwo.length - 1; k++)
                {
                    ahwo[k] = new hwo();
                    kog1.a(ahwo[k]);
                    kog1.a();
                }

                ahwo[k] = new hwo();
                kog1.a(ahwo[k]);
                b = ahwo;
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new hwo();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                f = kog1.j();
                break;

            case 58: // ':'
                g = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                hwo hwo1 = b[i];
                if (hwo1 != null)
                {
                    koh1.b(2, hwo1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.a(6, f);
        }
        if (g != null)
        {
            koh1.a(7, g);
        }
        super.writeTo(koh1);
    }
}
