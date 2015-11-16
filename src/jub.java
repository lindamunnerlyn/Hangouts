// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jub extends koj
{

    public jud a[];
    public jua b;

    public jub()
    {
        a = jud.a();
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= a.length)
                    {
                        break;
                    }
                    jud jud1 = a[k];
                    j = i;
                    if (jud1 != null)
                    {
                        j = i + koh.d(1, jud1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(2, b);
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

            case 10: // '\n'
                int k = kou.b(kog1, 10);
                jud ajud[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajud = new jud[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajud, 0, j);
                    k = j;
                }
                for (; k < ajud.length - 1; k++)
                {
                    ajud[k] = new jud();
                    kog1.a(ajud[k]);
                    kog1.a();
                }

                ajud[k] = new jud();
                kog1.a(ajud[k]);
                a = ajud;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new jua();
                }
                kog1.a(b);
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                jud jud1 = a[i];
                if (jud1 != null)
                {
                    koh1.b(1, jud1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(2, b);
        }
        super.writeTo(koh1);
    }
}
