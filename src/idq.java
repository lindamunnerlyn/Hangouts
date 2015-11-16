// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class idq extends koj
{

    private static volatile idq c[];
    public idp a[];
    public ids b;

    public idq()
    {
        a = idp.a();
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static idq[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new idq[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
                    idp idp1 = a[k];
                    j = i;
                    if (idp1 != null)
                    {
                        j = i + koh.d(1, idp1);
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
                idp aidp[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aidp = new idp[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aidp, 0, j);
                    k = j;
                }
                for (; k < aidp.length - 1; k++)
                {
                    aidp[k] = new idp();
                    kog1.a(aidp[k]);
                    kog1.a();
                }

                aidp[k] = new idp();
                kog1.a(aidp[k]);
                a = aidp;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new ids();
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
                idp idp1 = a[i];
                if (idp1 != null)
                {
                    koh1.b(1, idp1);
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
