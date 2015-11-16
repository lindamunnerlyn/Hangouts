// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jdw extends koj
{

    public jbw a;
    public jci b[];

    public jdw()
    {
        a = null;
        b = jci.a();
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
                    jci jci1 = b[j];
                    int k = i;
                    if (jci1 != null)
                    {
                        k = i + koh.d(2, jci1);
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
                jci ajci[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajci = new jci[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajci, 0, j);
                    k = j;
                }
                for (; k < ajci.length - 1; k++)
                {
                    ajci[k] = new jci();
                    kog1.a(ajci[k]);
                    kog1.a();
                }

                ajci[k] = new jci();
                kog1.a(ajci[k]);
                b = ajci;
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
                jci jci1 = b[i];
                if (jci1 != null)
                {
                    koh1.b(2, jci1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
