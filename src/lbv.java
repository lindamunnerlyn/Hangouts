// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lbv extends koj
{

    public lcb a;
    public lbu b[];
    public kyo c;
    public lbx d;
    public lbd e;

    public lbv()
    {
        a = null;
        b = lbu.a();
        c = null;
        d = null;
        e = null;
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
                    lbu lbu1 = b[j];
                    int k = i;
                    if (lbu1 != null)
                    {
                        k = i + koh.d(2, lbu1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (c != null)
        {
            i = j + koh.d(3, c);
        }
        j = i;
        if (d != null)
        {
            j = i + koh.d(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + koh.d(5, e);
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
                if (a == null)
                {
                    a = new lcb();
                }
                kog1.a(a);
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                lbu albu[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                albu = new lbu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, albu, 0, j);
                    k = j;
                }
                for (; k < albu.length - 1; k++)
                {
                    albu[k] = new lbu();
                    kog1.a(albu[k]);
                    kog1.a();
                }

                albu[k] = new lbu();
                kog1.a(albu[k]);
                b = albu;
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new kyo();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                if (d == null)
                {
                    d = new lbx();
                }
                kog1.a(d);
                break;

            case 42: // '*'
                if (e == null)
                {
                    e = new lbd();
                }
                kog1.a(e);
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
                lbu lbu1 = b[i];
                if (lbu1 != null)
                {
                    koh1.b(2, lbu1);
                }
            }

        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (d != null)
        {
            koh1.b(4, d);
        }
        if (e != null)
        {
            koh1.b(5, e);
        }
        super.writeTo(koh1);
    }
}
