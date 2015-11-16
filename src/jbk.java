// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbk extends koj
{

    public jba a[];
    public jbw b;
    public jbs c[];
    public ixg responseHeader;

    public jbk()
    {
        responseHeader = null;
        a = jba.a();
        b = null;
        c = jbs.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i;
            if (a.length > 0)
            {
                for (j = 0; j < a.length;)
                {
                    jba jba1 = a[j];
                    int l = i;
                    if (jba1 != null)
                    {
                        l = i + koh.d(2, jba1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
        }
        int i1 = i;
        if (c != null)
        {
            i1 = i;
            if (c.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    i1 = i;
                    if (k >= c.length)
                    {
                        break;
                    }
                    jbs jbs1 = c[k];
                    i1 = i;
                    if (jbs1 != null)
                    {
                        i1 = i + koh.d(4, jbs1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
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
                jba ajba[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                ajba = new jba[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, ajba, 0, j);
                    l = j;
                }
                for (; l < ajba.length - 1; l++)
                {
                    ajba[l] = new jba();
                    kog1.a(ajba[l]);
                    kog1.a();
                }

                ajba[l] = new jba();
                kog1.a(ajba[l]);
                a = ajba;
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new jbw();
                }
                kog1.a(b);
                break;

            case 34: // '"'
                int i1 = kou.b(kog1, 34);
                jbs ajbs[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                ajbs = new jbs[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, ajbs, 0, k);
                    i1 = k;
                }
                for (; i1 < ajbs.length - 1; i1++)
                {
                    ajbs[i1] = new jbs();
                    kog1.a(ajbs[i1]);
                    kog1.a();
                }

                ajbs[i1] = new jbs();
                kog1.a(ajbs[i1]);
                c = ajbs;
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
                jba jba1 = a[i];
                if (jba1 != null)
                {
                    koh1.b(2, jba1);
                }
            }

        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                jbs jbs1 = c[j];
                if (jbs1 != null)
                {
                    koh1.b(4, jbs1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
