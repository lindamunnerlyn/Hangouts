// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jzi extends koj
{

    private static volatile jzi d[];
    public String a;
    public String b;
    public jzj c[];

    public jzi()
    {
        a = null;
        b = null;
        c = jzj.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jzi[] a()
    {
        if (d == null)
        {
            synchronized (kon.a)
            {
                if (d == null)
                {
                    d = new jzi[0];
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
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    jzj jzj1 = c[j];
                    int k = i;
                    if (jzj1 != null)
                    {
                        k = i + koh.d(2, jzj1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (b != null)
        {
            i = j + koh.b(3, b);
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
                jzj ajzj[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ajzj = new jzj[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ajzj, 0, j);
                    k = j;
                }
                for (; k < ajzj.length - 1; k++)
                {
                    ajzj[k] = new jzj();
                    kog1.a(ajzj[k]);
                    kog1.a();
                }

                ajzj[k] = new jzj();
                kog1.a(ajzj[k]);
                c = ajzj;
                break;

            case 26: // '\032'
                b = kog1.j();
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
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jzj jzj1 = c[i];
                if (jzj1 != null)
                {
                    koh1.b(2, jzj1);
                }
            }

        }
        if (b != null)
        {
            koh1.a(3, b);
        }
        super.writeTo(koh1);
    }
}
