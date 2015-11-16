// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jci extends koj
{

    private static volatile jci f[];
    public Long a;
    public String b;
    public String c;
    public String d[];
    public jcj e[];

    public jci()
    {
        a = null;
        b = null;
        c = null;
        d = kou.f;
        e = jcj.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static jci[] a()
    {
        if (f == null)
        {
            synchronized (kon.a)
            {
                if (f == null)
                {
                    f = new jci[0];
                }
            }
        }
        return f;
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
            i = j + koh.e(1, a.longValue());
        }
        int l = i;
        if (b != null)
        {
            l = i + koh.b(2, b);
        }
        j = l;
        if (c != null)
        {
            j = l + koh.b(3, c);
        }
        i = j;
        if (d != null)
        {
            i = j;
            if (d.length > 0)
            {
                i = 0;
                l = 0;
                int i1;
                int j1;
                for (i1 = 0; i < d.length; i1 = j1)
                {
                    String s = d[i];
                    int k1 = l;
                    j1 = i1;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        k1 = l + koh.a(s);
                    }
                    i++;
                    l = k1;
                }

                i = j + l + i1 * 1;
            }
        }
        l = i;
        if (e != null)
        {
            l = i;
            if (e.length > 0)
            {
                int k = ((flag) ? 1 : 0);
                do
                {
                    l = i;
                    if (k >= e.length)
                    {
                        break;
                    }
                    jcj jcj1 = e[k];
                    l = i;
                    if (jcj1 != null)
                    {
                        l = i + koh.d(5, jcj1);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
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

            case 8: // '\b'
                a = Long.valueOf(kog1.e());
                break;

            case 18: // '\022'
                b = kog1.j();
                break;

            case 26: // '\032'
                c = kog1.j();
                break;

            case 34: // '"'
                int l = kou.b(kog1, 34);
                String as[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                as = new String[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, as, 0, j);
                    l = j;
                }
                for (; l < as.length - 1; l++)
                {
                    as[l] = kog1.j();
                    kog1.a();
                }

                as[l] = kog1.j();
                d = as;
                break;

            case 42: // '*'
                int i1 = kou.b(kog1, 42);
                jcj ajcj[];
                int k;
                if (e == null)
                {
                    k = 0;
                } else
                {
                    k = e.length;
                }
                ajcj = new jcj[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(e, 0, ajcj, 0, k);
                    i1 = k;
                }
                for (; i1 < ajcj.length - 1; i1++)
                {
                    ajcj[i1] = new jcj();
                    kog1.a(ajcj[i1]);
                    kog1.a();
                }

                ajcj[i1] = new jcj();
                kog1.a(ajcj[i1]);
                e = ajcj;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        boolean flag = false;
        if (a != null)
        {
            koh1.b(1, a.longValue());
        }
        if (b != null)
        {
            koh1.a(2, b);
        }
        if (c != null)
        {
            koh1.a(3, c);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                String s = d[i];
                if (s != null)
                {
                    koh1.a(4, s);
                }
            }

        }
        if (e != null && e.length > 0)
        {
            for (int j = ((flag) ? 1 : 0); j < e.length; j++)
            {
                jcj jcj1 = e[j];
                if (jcj1 != null)
                {
                    koh1.b(5, jcj1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
