// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jax extends koj
{

    public jav a;
    public String b;
    public jbw c;
    public jav d[];
    public ixg responseHeader;

    public jax()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = null;
        d = jav.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (responseHeader != null)
        {
            i = j + koh.d(1, responseHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(2, a);
        }
        int k = j;
        if (c != null)
        {
            k = j + koh.d(3, c);
        }
        i = k;
        if (b != null)
        {
            i = k + koh.b(4, b);
        }
        j = i;
        if (d != null)
        {
            j = i;
            if (d.length > 0)
            {
                for (j = 0; j < d.length;)
                {
                    jav jav1 = d[j];
                    int l = i;
                    if (jav1 != null)
                    {
                        l = i + koh.d(5, jav1);
                    }
                    j++;
                    i = l;
                }

                j = i;
            }
        }
        return j;
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
                if (a == null)
                {
                    a = new jav();
                }
                kog1.a(a);
                break;

            case 26: // '\032'
                if (c == null)
                {
                    c = new jbw();
                }
                kog1.a(c);
                break;

            case 34: // '"'
                b = kog1.j();
                break;

            case 42: // '*'
                int k = kou.b(kog1, 42);
                jav ajav[];
                int j;
                if (d == null)
                {
                    j = 0;
                } else
                {
                    j = d.length;
                }
                ajav = new jav[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(d, 0, ajav, 0, j);
                    k = j;
                }
                for (; k < ajav.length - 1; k++)
                {
                    ajav[k] = new jav();
                    kog1.a(ajav[k]);
                    kog1.a();
                }

                ajav[k] = new jav();
                kog1.a(ajav[k]);
                d = ajav;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (responseHeader != null)
        {
            koh1.b(1, responseHeader);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (c != null)
        {
            koh1.b(3, c);
        }
        if (b != null)
        {
            koh1.a(4, b);
        }
        if (d != null && d.length > 0)
        {
            for (int i = 0; i < d.length; i++)
            {
                jav jav1 = d[i];
                if (jav1 != null)
                {
                    koh1.b(5, jav1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
