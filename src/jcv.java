// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jcv extends koj
{

    public jcp a;
    public jbw b;
    public jcp c[];
    public ixf requestHeader;

    public jcv()
    {
        requestHeader = null;
        a = null;
        b = null;
        c = jcp.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (requestHeader != null)
        {
            i = j + koh.d(1, requestHeader);
        }
        j = i;
        if (a != null)
        {
            j = i + koh.d(2, a);
        }
        i = j;
        if (b != null)
        {
            i = j + koh.d(3, b);
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    jcp jcp1 = c[j];
                    int k = i;
                    if (jcp1 != null)
                    {
                        k = i + koh.d(4, jcp1);
                    }
                    j++;
                    i = k;
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
                if (requestHeader == null)
                {
                    requestHeader = new ixf();
                }
                kog1.a(requestHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new jcp();
                }
                kog1.a(a);
                break;

            case 26: // '\032'
                if (b == null)
                {
                    b = new jbw();
                }
                kog1.a(b);
                break;

            case 34: // '"'
                int k = kou.b(kog1, 34);
                jcp ajcp[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ajcp = new jcp[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ajcp, 0, j);
                    k = j;
                }
                for (; k < ajcp.length - 1; k++)
                {
                    ajcp[k] = new jcp();
                    kog1.a(ajcp[k]);
                    kog1.a();
                }

                ajcp[k] = new jcp();
                kog1.a(ajcp[k]);
                c = ajcp;
                break;
            }
        } while (true);
    }

    public void writeTo(koh koh1)
    {
        if (requestHeader != null)
        {
            koh1.b(1, requestHeader);
        }
        if (a != null)
        {
            koh1.b(2, a);
        }
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jcp jcp1 = c[i];
                if (jcp1 != null)
                {
                    koh1.b(4, jcp1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
