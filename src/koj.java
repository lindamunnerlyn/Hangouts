// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class koj extends kop
{

    public kol unknownFieldData;

    public koj()
    {
    }

    public volatile Object clone()
    {
        return clone();
    }

    public koj clone()
    {
        koj koj1 = (koj)super.clone();
        kon.a(this, koj1);
        return koj1;
    }

    public volatile kop clone()
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

    public final Object getExtension(kok kok1)
    {
        kom kom1;
        if (unknownFieldData != null)
        {
            if ((kom1 = unknownFieldData.a(kou.b(kok1.c))) != null)
            {
                return kom1.a(kok1);
            }
        }
        return null;
    }

    public final boolean hasExtension(kok kok1)
    {
        while (unknownFieldData == null || unknownFieldData.a(kou.b(kok1.c)) == null) 
        {
            return false;
        }
        return true;
    }

    public final koj setExtension(kok kok1, Object obj)
    {
        kom kom1 = null;
        int i = kou.b(kok1.c);
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
            unknownFieldData = new kol();
        } else
        {
            kom1 = unknownFieldData.a(i);
        }
        if (kom1 == null)
        {
            unknownFieldData.a(i, new kom(kok1, obj));
            return this;
        } else
        {
            kom1.a(kok1, obj);
            return this;
        }
    }

    public final boolean storeUnknownField(kog kog1, int i)
    {
        int j = kog1.r();
        if (!kog1.b(i))
        {
            return false;
        }
        int k = kou.b(i);
        kos kos1 = new kos(i, kog1.a(j, kog1.r() - j));
        kog1 = null;
        Object obj;
        if (unknownFieldData == null)
        {
            unknownFieldData = new kol();
        } else
        {
            kog1 = unknownFieldData.a(k);
        }
        obj = kog1;
        if (kog1 == null)
        {
            obj = new kom();
            unknownFieldData.a(k, ((kom) (obj)));
        }
        ((kom) (obj)).a(kos1);
        return true;
    }

    public void writeTo(koh koh)
    {
        if (unknownFieldData != null)
        {
            int i = 0;
            while (i < unknownFieldData.a()) 
            {
                unknownFieldData.c(i).a(koh);
                i++;
            }
        }
    }
}
