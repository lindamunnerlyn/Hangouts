// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jan extends koj
{

    public String a;
    public String b;
    public jbw c;
    public String d;
    public String e[];
    public jbt f[];
    public ixf requestHeader;

    public jan()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = null;
        d = null;
        e = kou.f;
        f = jbt.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + koh.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.b(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(3, b);
        }
        int l = i;
        if (c != null)
        {
            l = i + koh.d(4, c);
        }
        j = l;
        if (d != null)
        {
            j = l + koh.b(5, d);
        }
        i = j;
        if (e != null)
        {
            i = j;
            if (e.length > 0)
            {
                i = 0;
                l = 0;
                int i1;
                int j1;
                for (i1 = 0; i < e.length; i1 = j1)
                {
                    String s = e[i];
                    int k1 = l;
                    j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + koh.a(s);
                    }
                    i++;
                    l = k1;
                }

                i = j + l + i1 * 1;
            }
        }
        l = i;
        if (f != null)
        {
            l = i;
            if (f.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    l = i;
                    if (k >= f.length)
                    {
                        break;
                    }
                    jbt jbt1 = f[k];
                    l = i;
                    if (jbt1 != null)
                    {
                        l = i + koh.d(7, jbt1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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
                a = kog1.j();
                break;

            case 26: // '\032'
                b = kog1.j();
                break;

            case 34: // '"'
                if (c == null)
                {
                    c = new jbw();
                }
                kog1.a(c);
                break;

            case 42: // '*'
                d = kog1.j();
                break;

            case 50: // '2'
                int l = kou.b(kog1, 50);
                String as[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kog1.j();
                    kog1.a();
                }

                as[l] = kog1.j();
                e = as;
                break;

            case 58: // ':'
                int i1 = kou.b(kog1, 58);
                jbt ajbt[];
                int k;
                if (f == null)
                {
                    k = 0;
                } else
                {
                    k = f.length;
                }
                ajbt = new jbt[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(f, 0, ajbt, 0, k);
                    i1 = k;
                }
                for (; i1 < ajbt.length - 1; i1++)
                {
                    ajbt[i1] = new jbt();
                    kog1.a(ajbt[i1]);
                    kog1.a();
                }

                ajbt[i1] = new jbt();
                kog1.a(ajbt[i1]);
                f = ajbt;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null)
        {
            koh1.a(2, a);
        }
        if (b != null)
        {
            koh1.a(3, b);
        }
        if (c != null)
        {
            koh1.b(4, c);
        }
        if (d != null)
        {
            koh1.a(5, d);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    koh1.a(6, s);
                }
            }

        }
        if (f != null && f.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < f.length; j++)
            {
                jbt jbt1 = f[j];
                if (jbt1 != null)
                {
                    koh1.b(7, jbt1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
