// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iag extends koj
{

    public String a;
    public lhq b;
    public Boolean c;
    public jwb d;
    public String e[];

    public iag()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = kou.f;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (b != null)
        {
            i = j + koh.d(1, b);
        }
        j = i;
        if (c != null)
        {
            c.booleanValue();
            j = i + (koh.f(2) + 1);
        }
        int k = j;
        if (d != null)
        {
            k = j + koh.d(3, d);
        }
        i = k;
        if (a != null)
        {
            i = k + koh.b(4, a);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                int l = 0;
                int i1 = 0;
                for (j = ((flag) ? 1 : 0); j < e.length;)
                {
                    String s = e[j];
                    int k1 = l;
                    int j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + koh.a(s);
                    }
                    j++;
                    l = k1;
                    i1 = j1;
                }

                j = i + l + i1 * 1;
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
                if (b == null)
                {
                    b = new lhq();
                }
                kog1.a(b);
                break;

            case 16: // '\020'
                c = Boolean.valueOf(kog1.i());
                break;

            case 26: // '\032'
                if (d == null)
                {
                    d = new jwb();
                }
                kog1.a(d);
                break;

            case 34: // '"'
                a = kog1.j();
                break;

            case 42: // '*'
                int k = kou.b(kog1, 42);
                String as[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                as = new String[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, as, 0, j);
                    k = j;
                }
                for (; k < as.length - 1; k++)
                {
                    as[k] = kog1.j();
                    kog1.a();
                }

                as[k] = kog1.j();
                e = as;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (b != null)
        {
            koh1.b(1, b);
        }
        if (c != null)
        {
            koh1.a(2, c.booleanValue());
        }
        if (d != null)
        {
            koh1.b(3, d);
        }
        if (a != null)
        {
            koh1.a(4, a);
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                String s = e[i];
                if (s != null)
                {
                    koh1.a(5, s);
                }
            }

        }
        super.writeTo(koh1);
    }
}
