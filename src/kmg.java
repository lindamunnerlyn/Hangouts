// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kmg extends kwm
{

    public kmk a;
    public kmi b[];

    public kmg()
    {
        a = null;
        b = kmi.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + kwk.d(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kmi kmi1 = b[j];
                    int k = i;
                    if (kmi1 != null)
                    {
                        k = i + kwk.d(2, kmi1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new kmk();
                }
                kwj1.a(a);
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                kmi akmi[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akmi = new kmi[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akmi, 0, j);
                    k = j;
                }
                for (; k < akmi.length - 1; k++)
                {
                    akmi[k] = new kmi();
                    kwj1.a(akmi[k]);
                    kwj1.a();
                }

                akmi[k] = new kmi();
                kwj1.a(akmi[k]);
                b = akmi;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.b(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kmi kmi1 = b[i];
                if (kmi1 != null)
                {
                    kwk1.b(2, kmi1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
