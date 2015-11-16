// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lew extends kwm
{

    public Boolean a;
    public lex b[];

    public lew()
    {
        a = null;
        b = lex.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (a != null)
        {
            a.booleanValue();
            i = j + (kwk.f(1) + 1);
        }
        j = i;
        if (b != null)
        {
            j = i;
            if (b.length > 0)
            {
                for (j = 0; j < b.length;)
                {
                    lex lex1 = b[j];
                    int k = i;
                    if (lex1 != null)
                    {
                        k = i + kwk.d(2, lex1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        return j;
    }

    public kws mergeFrom(kwj kwj1)
    {
        do
        {
            int i = kwj1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(kwj1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = Boolean.valueOf(kwj1.i());
                break;

            case 18: // '\022'
                int k = kwx.a(kwj1, 18);
                lex alex[];
                int j;
                if (b == null)
                {
                    j = 0;
                } else
                {
                    j = b.length;
                }
                alex = new lex[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(b, 0, alex, 0, j);
                    k = j;
                }
                for (; k < alex.length - 1; k++)
                {
                    alex[k] = new lex();
                    kwj1.a(alex[k]);
                    kwj1.a();
                }

                alex[k] = new lex();
                kwj1.a(alex[k]);
                b = alex;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.booleanValue());
        }
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                lex lex1 = b[i];
                if (lex1 != null)
                {
                    kwk1.b(2, lex1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
