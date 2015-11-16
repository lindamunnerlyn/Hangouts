// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jvo extends koj
{

    public jvn a;
    public jvk b[];

    public jvo()
    {
        a = null;
        b = jvk.a();
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
                    jvk jvk1 = b[j];
                    int k = i;
                    if (jvk1 != null)
                    {
                        k = i + koh.d(3, jvk1);
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
                    a = new jvn();
                }
                kog1.a(a);
                break;

            case 26: // '\032'
                int k = kou.b(kog1, 26);
                jvk ajvk[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                ajvk = new jvk[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, ajvk, 0, j);
                    k = j;
                }
                for (; k < ajvk.length - 1; k++)
                {
                    ajvk[k] = new jvk();
                    kog1.a(ajvk[k]);
                    kog1.a();
                }

                ajvk[k] = new jvk();
                kog1.a(ajvk[k]);
                b = ajvk;
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
                jvk jvk1 = b[i];
                if (jvk1 != null)
                {
                    koh1.b(3, jvk1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
