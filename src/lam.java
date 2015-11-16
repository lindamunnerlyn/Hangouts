// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lam extends koj
{

    public lao a[];
    public lao b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public lan m;
    public String n;
    public Boolean o;

    public lam()
    {
        a = lao.a();
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i1 = super.computeSerializedSize();
        int j1 = i1;
        if (a != null)
        {
            j1 = i1;
            if (a.length > 0)
            {
                int k1 = 0;
                do
                {
                    j1 = i1;
                    if (k1 >= a.length)
                    {
                        break;
                    }
                    lao lao1 = a[k1];
                    j1 = i1;
                    if (lao1 != null)
                    {
                        j1 = i1 + koh.d(1, lao1);
                    }
                    k1++;
                    i1 = j1;
                } while (true);
            }
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + koh.d(2, b);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + koh.b(3, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + koh.b(4, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + koh.b(11, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + koh.b(12, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + koh.b(13, g);
        }
        i1 = j1;
        if (h != null)
        {
            i1 = j1 + koh.b(14, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + koh.b(15, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + koh.b(16, j);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + koh.d(17, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + koh.b(18, n);
        }
        j1 = i1;
        if (o != null)
        {
            o.booleanValue();
            j1 = i1 + (koh.f(19) + 1);
        }
        i1 = j1;
        if (k != null)
        {
            i1 = j1 + koh.b(20, k);
        }
        j1 = i1;
        if (l != null)
        {
            j1 = i1 + koh.b(21, l);
        }
        return j1;
    }

    public kop mergeFrom(kog kog1)
    {
        do
        {
            int i1 = kog1.a();
            switch (i1)
            {
            default:
                if (super.storeUnknownField(kog1, i1))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k1 = kou.b(kog1, 10);
                lao alao[];
                int j1;
                if (a == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = a.length;
                }
                alao = new lao[k1 + j1];
                k1 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(a, 0, alao, 0, j1);
                    k1 = j1;
                }
                for (; k1 < alao.length - 1; k1++)
                {
                    alao[k1] = new lao();
                    kog1.a(alao[k1]);
                    kog1.a();
                }

                alao[k1] = new lao();
                kog1.a(alao[k1]);
                a = alao;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new lao();
                }
                kog1.a(b);
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                d = kog1.j();
                break;

            case 90: // 'Z'
                e = kog1.j();
                break;

            case 98: // 'b'
                f = kog1.j();
                break;

            case 106: // 'j'
                g = kog1.j();
                break;

            case 114: // 'r'
                h = kog1.j();
                break;

            case 122: // 'z'
                i = kog1.j();
                break;

            case 130: 
                j = kog1.j();
                break;

            case 138: 
                if (m == null)
                {
                    m = new lan();
                }
                kog1.a(m);
                break;

            case 146: 
                n = kog1.j();
                break;

            case 152: 
                o = Boolean.valueOf(kog1.i());
                break;

            case 162: 
                k = kog1.j();
                break;

            case 170: 
                l = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i1 = 0; i1 < a.length; i1++)
            {
                lao lao1 = a[i1];
                if (lao1 != null)
                {
                    koh1.b(1, lao1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(2, b);
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
            koh1.a(11, e);
        }
        if (f != null)
        {
            koh1.a(12, f);
        }
        if (g != null)
        {
            koh1.a(13, g);
        }
        if (h != null)
        {
            koh1.a(14, h);
        }
        if (i != null)
        {
            koh1.a(15, i);
        }
        if (j != null)
        {
            koh1.a(16, j);
        }
        if (m != null)
        {
            koh1.b(17, m);
        }
        if (n != null)
        {
            koh1.a(18, n);
        }
        if (o != null)
        {
            koh1.a(19, o.booleanValue());
        }
        if (k != null)
        {
            koh1.a(20, k);
        }
        if (l != null)
        {
            koh1.a(21, l);
        }
        super.writeTo(koh1);
    }
}
