// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jux extends koj
{

    public juy a;
    public Long b;
    public juz c;
    public jvf d[];

    public jux()
    {
        a = null;
        b = null;
        c = null;
        d = jvf.a();
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
            j = i + koh.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    jvf jvf1 = d[j];
                    int k = i;
                    if (jvf1 != null)
                    {
                        k = i + koh.d(4, jvf1);
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
                if (a == null)
                {
                    a = new juy();
                }
                kog1.a(a);
                break;

            case 16: // '\020'
                b = Long.valueOf(kog1.e());
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new juz();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                int k = kou.b(kog1, 34);
                jvf ajvf[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                ajvf = new jvf[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, ajvf, 0, j);
                    k = j;
                }
                for (; k < ajvf.length - 1; k++)
                {
                    ajvf[k] = new jvf();
                    kog1.a(ajvf[k]);
                    kog1.a();
                }

                ajvf[k] = new jvf();
                kog1.a(ajvf[k]);
                d = ajvf;
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
        if (b != null)
        {
            koh1.b(2, b.longValue());
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                jvf jvf1 = d[i];
                if (jvf1 != null)
                {
                    koh1.b(4, jvf1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
