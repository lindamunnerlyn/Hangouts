// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ixl extends koj
{

    public iss a[];
    public Boolean b;
    public irk c[];
    public ixg responseHeader;

    public ixl()
    {
        responseHeader = null;
        a = iss.a();
        b = null;
        c = irk.a();
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
                    iss iss1 = a[j];
                    int l = i;
                    if (iss1 != null)
                    {
                        l = i + koh.d(2, iss1);
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
            b.booleanValue();
            i = j + (koh.f(3) + 1);
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
                    irk irk1 = c[k];
                    i1 = i;
                    if (irk1 != null)
                    {
                        i1 = i + koh.d(4, irk1);
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

            case 24: // '\030'
                b = Boolean.valueOf(kog1.i());
                break;

            case 34: // '"'
                int i1 = kou.b(kog1, 34);
                irk airk[];
                int k;
                if (c == null)
                {
                    k = 0;
                } else
                {
                    k = c.length;
                }
                airk = new irk[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(c, 0, airk, 0, k);
                    i1 = k;
                }
                for (; i1 < airk.length - 1; i1++)
                {
                    airk[i1] = new irk();
                    kog1.a(airk[i1]);
                    kog1.a();
                }

                airk[i1] = new irk();
                kog1.a(airk[i1]);
                c = airk;
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
        if (b != null)
        {
            koh1.a(3, b.booleanValue());
        }
        if (c != null && c.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < c.length; j++)
            {
                irk irk1 = c[j];
                if (irk1 != null)
                {
                    koh1.b(4, irk1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
