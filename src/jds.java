// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jds extends koj
{

    public jbw a;
    public jca b[];

    public jds()
    {
        a = null;
        b = jca.a();
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
                    jca jca1 = b[j];
                    int k = i;
                    if (jca1 != null)
                    {
                        k = i + koh.d(2, jca1);
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
                    a = new jbw();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                jca ajca[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajca = new jca[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajca, 0, j);
                    k = j;
                }
                for (; k < ajca.length - 1; k++)
                {
                    ajca[k] = new jca();
                    kog1.a(ajca[k]);
                    kog1.a();
                }

                ajca[k] = new jca();
                kog1.a(ajca[k]);
                b = ajca;
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
                jca jca1 = b[i];
                if (jca1 != null)
                {
                    koh1.b(2, jca1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
