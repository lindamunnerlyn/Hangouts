// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class fgh extends fgm
{

    public fgi o;

    public fgh()
    {
    }

    protected int a()
    {
        int j = 0;
        int k;
        if (o != null)
        {
            int i = 0;
            do
            {
                k = i;
                if (j >= o.a())
                {
                    break;
                }
                i += o.b(j).a();
                j++;
            } while (true);
        } else
        {
            k = 0;
        }
        return k;
    }

    public void a(fgg fgg)
    {
        if (o != null)
        {
            int i = 0;
            while (i < o.a()) 
            {
                o.b(i).a(fgg);
                i++;
            }
        }
    }

    protected final boolean a(fgf fgf1, int i)
    {
        int j = fgf1.m();
        if (!fgf1.b(i))
        {
            return false;
        }
        int k = i >>> 3;
        fgn fgn1 = new fgn(i, fgf1.a(j, fgf1.m() - j));
        fgf1 = null;
        Object obj;
        if (o == null)
        {
            o = new fgi();
        } else
        {
            fgf1 = o.a(k);
        }
        obj = fgf1;
        if (fgf1 == null)
        {
            obj = new fgj();
            o.a(k, ((fgj) (obj)));
        }
        ((fgj) (obj)).a(fgn1);
        return true;
    }

    protected final boolean a(fgh fgh1)
    {
        if (o == null || o.b())
        {
            return fgh1.o == null || fgh1.o.b();
        } else
        {
            return o.equals(fgh1.o);
        }
    }

    protected final int c()
    {
        if (o == null || o.b())
        {
            return 0;
        } else
        {
            return o.hashCode();
        }
    }

    public Object clone()
    {
        return d();
    }

    public fgh d()
    {
        fgh fgh1 = (fgh)super.e();
        fgk.a(this, fgh1);
        return fgh1;
    }

    public fgm e()
    {
        return d();
    }
}
