// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jwr extends koj
{

    public Double a;
    public Double b;
    public Double c;
    public jwq d[];

    public jwr()
    {
        a = null;
        b = null;
        c = null;
        d = jwq.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.doubleValue();
            i = j + (koh.f(1) + 8);
        }
        j = i;
        if (b != null)
        {
            b.doubleValue();
            j = i + (koh.f(2) + 8);
        }
        i = j;
        if (c != null)
        {
            c.doubleValue();
            i = j + (koh.f(3) + 8);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    jwq jwq1 = d[j];
                    int k = i;
                    if (jwq1 != null)
                    {
                        k = i + koh.d(4, jwq1);
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

            case 9: // '\t'
                a = Double.valueOf(kog1.b());
                break;

            case 17: // '\021'
                b = Double.valueOf(kog1.b());
                break;

            case 25: // '\031'
                c = Double.valueOf(kog1.b());
                break;

            case 34: // '"'
                int k = kou.b(kog1, 34);
                jwq ajwq[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                ajwq = new jwq[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, ajwq, 0, j);
                    k = j;
                }
                for (; k < ajwq.length - 1; k++)
                {
                    ajwq[k] = new jwq();
                    kog1.a(ajwq[k]);
                    kog1.a();
                }

                ajwq[k] = new jwq();
                kog1.a(ajwq[k]);
                d = ajwq;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a.doubleValue());
        }
        if (b != null)
        {
            koh1.a(2, b.doubleValue());
        }
        if (c != null)
        {
            koh1.a(3, c.doubleValue());
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                jwq jwq1 = d[i];
                if (jwq1 != null)
                {
                    koh1.b(4, jwq1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
