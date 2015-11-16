// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jvx extends koj
{

    public jvw a;
    public jvt b[];

    public jvx()
    {
        a = null;
        b = jvt.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.d(2, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    jvt jvt1 = b[j];
                    int k = i;
                    if (jvt1 != null)
                    {
                        k = i + koh.d(3, jvt1);
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

            case 18: // '\022'
                if (a == null)
                {
                    a = new jvw();
                }
                kog1.a(a);
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                jvt ajvt[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajvt = new jvt[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajvt, 0, j);
                    k = j;
                }
                for (; k < ajvt.length - 1; k++)
                {
                    ajvt[k] = new jvt();
                    kog1.a(ajvt[k]);
                    kog1.a();
                }

                ajvt[k] = new jvt();
                kog1.a(ajvt[k]);
                b = ajvt;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                jvt jvt1 = b[i];
                if (jvt1 != null)
                {
                    koh1.b(3, jvt1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
