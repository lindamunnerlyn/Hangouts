// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ivm extends koj
{

    private static volatile ivm c[];
    public kur a[];
    public kuj b[];

    public ivm()
    {
        a = kur.a();
        b = kuj.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static ivm[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new ivm[0];
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
        boolean flag = false;
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            i = j;
            if (a.length > 0)
            {
                i = j;
                for (int k = 0; k < a.length;)
                {
                    kur kur1 = a[k];
                    int i1 = i;
                    if (kur1 != null)
                    {
                        i1 = i + koh.d(1, kur1);
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
                    kuj kuj1 = b[l];
                    j1 = i;
                    if (kuj1 != null)
                    {
                        j1 = i + koh.d(2, kuj1);
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
                int l = kou.b(kog1, 10);
                kur akur[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                akur = new kur[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, akur, 0, j);
                    l = j;
                }
                for (; l < akur.length - 1; l++)
                {
                    akur[l] = new kur();
                    kog1.a(akur[l]);
                    kog1.a();
                }

                akur[l] = new kur();
                kog1.a(akur[l]);
                a = akur;
                break;

            case 18: // '\022'
                int i1 = kou.b(kog1, 18);
                kuj akuj[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                akuj = new kuj[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, akuj, 0, k);
                    i1 = k;
                }
                for (; i1 < akuj.length - 1; i1++)
                {
                    akuj[i1] = new kuj();
                    kog1.a(akuj[i1]);
                    kog1.a();
                }

                akuj[i1] = new kuj();
                kog1.a(akuj[i1]);
                b = akuj;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null && a.length > 0)
        {
            for (int i = 0; i < a.length; i++)
            {
                kur kur1 = a[i];
                if (kur1 != null)
                {
                    koh1.b(1, kur1);
                }
            }

        }
        if (b != null && b.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < b.length; j++)
            {
                kuj kuj1 = b[j];
                if (kuj1 != null)
                {
                    koh1.b(2, kuj1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
