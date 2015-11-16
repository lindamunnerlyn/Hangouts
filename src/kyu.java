// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kyu extends koj
{

    private static volatile kyu d[];
    public String a;
    public kyv b[];
    public Boolean c;

    public kyu()
    {
        a = null;
        b = kyv.a();
        c = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static kyu[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new kyu[0];
                }
            }
        }
        return d;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j + koh.b(1, a);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    kyv kyv1 = b[j];
                    int k = i;
                    if (kyv1 != null)
                    {
                        k = i + koh.d(2, kyv1);
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
            c.booleanValue();
            i = j + (koh.f(3) + 1);
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
                a = kog1.j();
                break;

            case 18: // '\022'
                int k = kou.b(kog1, 18);
                kyv akyv[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                akyv = new kyv[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, akyv, 0, j);
                    k = j;
                }
                for (; k < akyv.length - 1; k++)
                {
                    akyv[k] = new kyv();
                    kog1.a(akyv[k]);
                    kog1.a();
                }

                akyv[k] = new kyv();
                kog1.a(akyv[k]);
                b = akyv;
                break;

            case 24: // '\030'
                c = Boolean.valueOf(kog1.i());
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (a != null)
        {
            koh1.a(1, a);
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                kyv kyv1 = b[i];
                if (kyv1 != null)
                {
                    koh1.b(2, kyv1);
                }
            }

        }
        if (c != null)
        {
            koh1.a(3, c.booleanValue());
        }
        super.writeTo(koh1);
    }
}
