// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class kwm extends kws
{

    public kwo unknownFieldData;

    public kwm()
    {
    }

    public volatile Object clone()
    {
        return clone();
    }

    public kwm clone()
    {
        kwm kwm1 = (kwm)super.clone();
        kwq.a(this, kwm1);
        return kwm1;
    }

    public volatile kws clone()
    {
        return clone();
    }

    public int computeSerializedSize()
    {
        int j = 0;
        int k;
        if (unknownFieldData != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= unknownFieldData.a())
                {
                    break;
                }
                i += unknownFieldData.c(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public final Object getExtension(kwn kwn1)
    {
        kwp kwp1;
        if (unknownFieldData != null)
        {
            if ((kwp1 = unknownFieldData.a(kwn1.c >>> 3)) != null)
            {
                return kwp1.a(kwn1);
            }
        }
        return null;
    }

    public final boolean hasExtension(kwn kwn1)
    {
        while (unknownFieldData == null || unknownFieldData.a(kwn1.c >>> 3) == null) 
        {
            return false;
        }
        return true;
    }

    public final kwm setExtension(kwn kwn1, Object obj)
    {
        kwp kwp1 = null;
        int i = kwn1.c >>> 3;
        if (obj == null)
        {
            if (unknownFieldData != null)
            {
                unknownFieldData.b(i);
                if (unknownFieldData.b())
                {
                    unknownFieldData = null;
                }
            }
            return this;
        }
        if (unknownFieldData == null)
        {
            unknownFieldData = new kwo();
        } else
        {
            kwp1 = unknownFieldData.a(i);
        }
        if (kwp1 == null)
        {
            unknownFieldData.a(i, new kwp(kwn1, obj));
            return this;
        } else
        {
            kwp1.a(kwn1, obj);
            return this;
        }
    }

    public final boolean storeUnknownField(kwj kwj1, int i)
    {
        int j = kwj1.r();
        if (!kwj1.b(i))
        {
            return false;
        }
        int k = i >>> 3;
        kwv kwv1 = new kwv(i, kwj1.a(j, kwj1.r() - j));
        kwj1 = null;
        Object obj;
        if (unknownFieldData == null)
        {
            unknownFieldData = new kwo();
        } else
        {
            kwj1 = unknownFieldData.a(k);
        }
        obj = kwj1;
        if (kwj1 == null)
        {
            obj = new kwp();
            unknownFieldData.a(k, ((kwp) (obj)));
        }
        ((kwp) (obj)).a(kwv1);
        return true;
    }

    public void writeTo(kwk kwk)
    {
        if (unknownFieldData != null)
        {
            int i = 0;
            while (i < unknownFieldData.a()) 
            {
                unknownFieldData.c(i).a(kwk);
                i++;
            }
        }
    }
}
