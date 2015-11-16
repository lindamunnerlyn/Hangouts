// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iut extends kwm
{

    public Integer a;
    public Integer b;
    public iuu c[];

    public iut()
    {
        a = null;
        b = null;
        c = iuu.a();
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int j = i;
        if (a != null)
        {
            j = i + kwk.e(1, a.intValue());
        }
        i = j;
        if (b != null)
        {
            i = j + kwk.e(2, b.intValue());
        }
        j = i;
        if (c != null)
        {
            j = i;
            if (c.length > 0)
            {
                for (j = 0; j < c.length;)
                {
                    iuu iuu1 = c[j];
                    int k = i;
                    if (iuu1 != null)
                    {
                        k = i + kwk.d(3, iuu1);
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
                a = Integer.valueOf(kwj1.f());
                break;

            case 16: // '\020'
                b = Integer.valueOf(kwj1.f());
                break;

            case 26: // '\032'
                int k = kwx.a(kwj1, 26);
                iuu aiuu[];
                int j;
                if (c == null)
                {
                    j = 0;
                } else
                {
                    j = c.length;
                }
                aiuu = new iuu[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(c, 0, aiuu, 0, j);
                    k = j;
                }
                for (; k < aiuu.length - 1; k++)
                {
                    aiuu[k] = new iuu();
                    kwj1.a(aiuu[k]);
                    kwj1.a();
                }

                aiuu[k] = new iuu();
                kwj1.a(aiuu[k]);
                c = aiuu;
                break;
            }
        } while (true);
    }

    public void writeTo(kwk kwk1)
    {
        if (a != null)
        {
            kwk1.a(1, a.intValue());
        }
        if (b != null)
        {
            kwk1.a(2, b.intValue());
        }
        if (c != null && c.length > 0)
        {
            for (int i = 0; i < c.length; i++)
            {
                iuu iuu1 = c[i];
                if (iuu1 != null)
                {
                    kwk1.b(3, iuu1);
                }
            }

        }
        super.writeTo(kwk1);
    }
}
