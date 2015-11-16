// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jxz extends koj
{

    public Long a;
    public jya b[];

    public jxz()
    {
        a = null;
        b = jya.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    jya jya1 = b[j];
                    int k = i;
                    if (jya1 != null)
                    {
                        k = i + koh.d(2, jya1);
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

            case 8: // '\b'
                a = Long.valueOf(kog1.e());
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                jya ajya[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajya = new jya[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajya, 0, j);
                    k = j;
                }
                for (; k < ajya.length - 1; k++)
                {
                    ajya[k] = new jya();
                    kog1.a(ajya[k]);
                    kog1.a();
                }

                ajya[k] = new jya();
                kog1.a(ajya[k]);
                b = ajya;
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
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jya jya1 = b[i];
                if (jya1 != null)
                {
                    koh1.b(2, jya1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
