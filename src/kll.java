// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class kll
    implements knc
{

    private static final klv a = klv.a();

    public kll()
    {
    }

    public kmy a(klp klp1, klv klv1)
    {
        try
        {
            klp1 = klp1.f();
            klv1 = (kmy)a(((klr) (klp1)), klv1);
        }
        // Misplaced declaration of an exception variable
        catch (klp klp1)
        {
            throw klp1;
        }
        klp1.a(0);
        return klv1;
        klp1;
        throw klp1.a(klv1);
    }

    public kmy b(klp klp1, klv klv1)
    {
        klv1 = a(klp1, klv1);
        if (klv1 != null && !klv1.C_())
        {
            if (klv1 instanceof kli)
            {
                klp1 = ((kli)klv1).b();
            } else
            if (klv1 instanceof klk)
            {
                klp1 = ((klk)klv1).I_();
            } else
            {
                klp1 = new knq();
            }
            throw klp1.a().a(klv1);
        } else
        {
            return klv1;
        }
    }

    public Object c(klp klp1, klv klv1)
    {
        return b(klp1, klv1);
    }

}
