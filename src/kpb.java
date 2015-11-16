// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kpb extends koj
{

    public Long a;
    public String b;
    public kps c[];
    public String d;

    public kpb()
    {
        a = null;
        b = null;
        c = kps.a();
        d = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + koh.e(1, a.longValue());
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(2, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    kps kps1 = c[j];
                    int k = i;
                    if (kps1 != null)
                    {
                        k = i + koh.d(3, kps1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (d != null)
        {
            i = j + koh.b(4, d);
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

            case 8: // '\b'
                a = Long.valueOf(kog1.e());
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                kps akps[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                akps = new kps[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, akps, 0, j);
                    k = j;
                }
                for (; k < akps.length - 1; k++)
                {
                    akps[k] = new kps();
                    kog1.a(akps[k]);
                    kog1.a();
                }

                akps[k] = new kps();
                kog1.a(akps[k]);
                c = akps;
                break;

            case 34: // '"'
                d = kog1.j();
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(1, a.longValue());
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                kps kps1 = c[i];
                if (kps1 != null)
                {
                    koh1.b(3, kps1);
                }
            }

        }
        if (d != null)
        {
            koh1.a(4, d);
        }
        super.writeTo(koh1);
    }
}
