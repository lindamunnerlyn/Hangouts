// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jbg extends koj
{

    public jba a;
    public jbw b;
    public jba c[];
    public ixg responseHeader;

    public jbg()
    {
        responseHeader = null;
        a = null;
        b = null;
        c = jba.a();
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
                    jba jba1 = c[j];
                    int k = i;
                    if (jba1 != null)
                    {
                        k = i + koh.d(4, jba1);
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
                if (responseHeader == null)
                {
                    responseHeader = new ixg();
                }
                kog1.a(responseHeader);
                break;

            case 18: // '\022'
                if (a == null)
                {
                    a = new jba();
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
                jba ajba[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                ajba = new jba[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, ajba, 0, j);
                    k = j;
                }
                for (; k < ajba.length - 1; k++)
                {
                    ajba[k] = new jba();
                    kog1.a(ajba[k]);
                    kog1.a();
                }

                ajba[k] = new jba();
                kog1.a(ajba[k]);
                c = ajba;
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
        if (b != null)
        {
            koh1.b(3, b);
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                jba jba1 = c[i];
                if (jba1 != null)
                {
                    koh1.b(4, jba1);
                }
            }

        }
        super.writeTo(koh1);
    }
}
