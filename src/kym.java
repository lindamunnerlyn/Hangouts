// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kym extends koj
{

    public lcb a;
    public kyk b[];
    public lby c;
    public kyo d;
    public kya e;
    public lbx f;
    public lbd g;
    public String h;

    public kym()
    {
        a = null;
        b = kyk.a();
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    kyk kyk1 = b[k];
                    j = i;
                    if (kyk1 != null)
                    {
                        j = i + koh.d(1, kyk1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(2, c);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(3, a);
        }
        i = j;
        if (d != null)
        {
            i = j + koh.d(4, d);
        }
        j = i;
        if (e != null)
        {
            j = i + koh.d(5, e);
        }
        i = j;
        if (f != null)
        {
            i = j + koh.d(6, f);
        }
        j = i;
        if (g != null)
        {
            j = i + koh.d(7, g);
        }
        i = j;
        if (h != null)
        {
            i = j + koh.b(8, h);
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
                int k = kou.b(kog1, 10);
                kyk akyk[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akyk = new kyk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akyk, 0, j);
                    k = j;
                }
                for (; k < akyk.length - 1; k++)
                {
                    akyk[k] = new kyk();
                    kog1.a(akyk[k]);
                    kog1.a();
                }

                akyk[k] = new kyk();
                kog1.a(akyk[k]);
                b = akyk;
                break;

            case 18: // '\022'
                if (c == null)
                {
                    c = new lby();
                }
                kog1.a(c);
                break;

            case 26: // '\032'
                if (a == null)
                {
                    a = new lcb();
                }
                kog1.a(a);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new kyo();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new kya();
                }
                kog1.a(e);
                break;

            case 50: // '2'
                if (f == null)
                {
                    f = new lbx();
                }
                kog1.a(f);
                break;

            case 58: // ':'
                if (g == null)
                {
                    g = new lbd();
                }
                kog1.a(g);
                break;

            case 66: // 'B'
                h = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kyk kyk1 = b[i];
                if (kyk1 != null)
                {
                    koh1.b(1, kyk1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(2, c);
        }
        if (a != null)
        {
            koh1.b(3, a);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        if (f != null)
        {
            koh1.b(6, f);
        }
        if (g != null)
        {
            koh1.b(7, g);
        }
        if (h != null)
        {
            koh1.a(8, h);
        }
        super.writeTo(koh1);
    }
}
