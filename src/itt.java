// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class itt extends koj
{

    public iss a[];
    public itu b[];
    public ixg responseHeader;

    public itt()
    {
        responseHeader = null;
        a = iss.a();
        b = itu.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int i = super.computeSerializedSize();
        int j = i;
        if (responseHeader != null)
        {
            j = i + koh.d(1, responseHeader);
        }
        i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (int k = 0; k < a.length;)
                {
                    iss iss1 = a[k];
                    int i1 = i;
                    if (iss1 != null)
                    {
                        i1 = i + koh.d(2, iss1);
                    }
                    k++;
                    i = i1;
                }

            }
        }
        int j1 = i;
        if (b != null)
        {
            j1 = i;
            if (b.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    j1 = i;
                    if (l >= b.length)
                    {
                        break;
                    }
                    itu itu1 = b[l];
                    j1 = i;
                    if (itu1 != null)
                    {
                        j1 = i + koh.d(3, itu1);
                    }
                    l++;
                    i = j1;
                } while (true);
            }
        }
        return j1;
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
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 18: // '\022'
                int l = kou.b(kog1, 18);
                iss aiss[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aiss = new iss[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aiss, 0, j);
                    l = j;
                }
                for (; l < aiss.length - 1; l++)
                {
                    aiss[l] = new iss();
                    kog1.a(aiss[l]);
                    kog1.a();
                }

                aiss[l] = new iss();
                kog1.a(aiss[l]);
                a = aiss;
                break;

            case 26: // '\032'
                int i1 = kou.b(kog1, 26);
                itu aitu[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aitu = new itu[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aitu, 0, k);
                    i1 = k;
                }
                for (; i1 < aitu.length - 1; i1++)
                {
                    aitu[i1] = new itu();
                    kog1.a(aitu[i1]);
                    kog1.a();
                }

                aitu[i1] = new itu();
                kog1.a(aitu[i1]);
                b = aitu;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                iss iss1 = a[i];
                if (iss1 != null)
                {
                    koh1.b(2, iss1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                itu itu1 = b[j];
                if (itu1 != null)
                {
                    koh1.b(3, itu1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
