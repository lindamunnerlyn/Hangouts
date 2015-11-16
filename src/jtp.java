// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jtp extends koj
{

    public Float a;
    public jtr b;
    public Float c;
    public Float d;
    public jtr e[];

    public jtp()
    {
        a = null;
        b = null;
        c = null;
        d = null;
        e = jtr.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.floatValue();
            i = j + (koh.f(1) + 4);
        }
        j = i;
        if (b != null)
        {
            j = i + koh.d(2, b);
        }
        int k = j;
        if (c != null)
        {
            c.floatValue();
            k = j + (koh.f(3) + 4);
        }
        i = k;
        if (d != null)
        {
            d.floatValue();
            i = k + (koh.f(4) + 4);
        }
        j = i;
        if (e != null)
        {
            j = i;
            if (e.length > 0)
            {
                for (j = 0; j < e.length;)
                {
                    jtr jtr1 = e[j];
                    int l = i;
                    if (jtr1 != null)
                    {
                        l = i + koh.d(5, jtr1);
                    }
                    j++;
                    i = l;
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

            case 13: // '\r'
                a = Float.valueOf(kog1.c());
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new jtr();
                }
                kog1.a(b);
                break;

            case 29: // '\035'
                c = Float.valueOf(kog1.c());
                break;

            case 37: // '%'
                d = Float.valueOf(kog1.c());
                break;

            case 42: // '*'
                int k = kou.b(kog1, 42);
                jtr ajtr[];
                int j;
                if (e == null)
                {
                    j = 0;
                } else
                {
                    j = e.length;
                }
                ajtr = new jtr[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(e, 0, ajtr, 0, j);
                    k = j;
                }
                for (; k < ajtr.length - 1; k++)
                {
                    ajtr[k] = new jtr();
                    kog1.a(ajtr[k]);
                    kog1.a();
                }

                ajtr[k] = new jtr();
                kog1.a(ajtr[k]);
                e = ajtr;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.floatValue());
        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c.floatValue());
        }
        if (d != null)
        {
            koh1.a(4, d.floatValue());
        }
        if (e != null && e.length > 0)
        {
            for (int i = 0; i < e.length; i++)
            {
                jtr jtr1 = e[i];
                if (jtr1 != null)
                {
                    koh1.b(5, jtr1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
