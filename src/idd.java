// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class idd extends koj
{

    private static volatile idd c[];
    public idc a[];
    public idf b;

    public idd()
    {
        a = idc.a();
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static idd[] a()
    {
        if (c == null)
        {
            synchronized (kon.a)
            {
                if (c == null)
                {
                    c = new idd[0];
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
                    idc idc1 = a[k];
                    j = i;
                    if (idc1 != null)
                    {
                        j = i + koh.d(1, idc1);
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
                idc aidc[];
                int j;
                if (a == null)
                {
                    j = 0;
                } else
                {
                    j = a.length;
                }
                aidc = new idc[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(a, 0, aidc, 0, j);
                    k = j;
                }
                for (; k < aidc.length - 1; k++)
                {
                    aidc[k] = new idc();
                    kog1.a(aidc[k]);
                    kog1.a();
                }

                aidc[k] = new idc();
                kog1.a(aidc[k]);
                a = aidc;
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new idf();
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
                idc idc1 = a[i];
                if (idc1 != null)
                {
                    koh1.b(1, idc1);
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
